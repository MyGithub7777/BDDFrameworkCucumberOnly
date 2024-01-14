package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver ;
	@Given("open home page on browser")
	public void open_home_page_on_browser()
	{
		driver =  new ChromeDriver();
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@When("click on login link")
	public void click_on_login_link()
	{
		driver.findElement(By.xpath("//a[@id='login2']")).click();
	}
	
	@Then("user is logged in")
	public void user_is_logged_in()
	{
		String expected_result = "Welcome testacc3";
		String actual_result = waitForElement(By.xpath("//a[@id='nameofuser']")).getText();
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@When("enter valid username and enter valid password and click on login button")
	public void enter_valid_username_and_enter_valid_password_and_click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("testacc3");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("test");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}
	
	@When("enter invalid username and enter invalid password and click on login button")
	public void enter_invalid_username_and_enter_invalid_password_and_click_on_login_button() {
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("testacc3");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("test423");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}
	
	private WebElement waitForElement(By locatorvalue)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement x = wait.until(ExpectedConditions.visibilityOfElementLocated(locatorvalue));
		return x;
	}
	
	private WebElement waitForElementIsClickable(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement x = wait.until(ExpectedConditions.elementToBeClickable(element));
		return x;
	}
	
	private Alert waitForAlert()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert x = wait.until(ExpectedConditions.alertIsPresent());
		return x;
	}
	
	//------------------------------------------------------
	@When("click on signup link")
	public void click_on_signup_link() {
		WebElement xyz = driver.findElement(By.xpath("//a[@id='signin2']"));
		waitForElementIsClickable(xyz).click();
	}
	@When("enter username {string} and enter password {string} and click on signup button")
	public void enter_username_and_enter_password_and_click_on_signup_button(String username, String password) {
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
	}
	@Then("account created successfully and showing {string}")
	public void account_created_successfully_and_showing(String expected_result) {
		
		String actual_result = waitForAlert().getText();
		Assert.assertEquals(actual_result, expected_result);
		
		waitForAlert().accept();
	   
	}
	
	

//	By.xpath("//a[@id='nameofuser']")
}
