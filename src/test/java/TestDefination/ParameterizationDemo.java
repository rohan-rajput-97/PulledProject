package TestDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ParameterizationDemo {
	WebDriver driver;
	@Given("required website is launched")
	public void required_website_is_launched() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.ajit.ichalkaranje\\Documents\\selenium-monday\\target\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		
	   // throw new cucumber.api.PendingException();
	}
	@Then("user have to go to login")
	public void user_have_to_go_to_login() throws InterruptedException {
		  driver.findElement(By.xpath("//a[@href='/login']")).click();  // link
		  Thread.sleep(5000);
	   // throw new cucumber.api.PendingException();
	}

	@Given("user have to fill email id to log in into page {string}")
	public void user_have_to_fill_email_id_to_log_in_into_page(String name) throws InterruptedException {
		boolean b =driver.findElement(By.xpath("//input[@id='Email']")).isDisplayed();
		System.out.println(b);//field
//		Assert.assertEquals(true, b);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(name);
		
	   // throw new cucumber.api.PendingException();
	}

	@Then("user put   to complete login{string}")
	public void user_put_to_complete_login(String pswd) {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pswd);
	   // throw new cucumber.api.PendingException();
	}

	@Then("system checks credentials and log in into page")
	public void system_checks_credentials_and_log_in_into_page() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("user has to log out")
	public void user_has_to_log_out() {
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
	  //  throw new cucumber.api.PendingException();
	}

}