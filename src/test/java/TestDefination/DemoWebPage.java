package TestDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoWebPage {
	WebDriver driver;
	@Given("DemoWebShop website is launced")
	public void demowebshop_website_is_launced() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\n.ajit.ichalkaranje\\Documents\\selenium-monday\\target\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	   // throw new cucumber.api.PendingException();
	}

	@Given("user click on register button")
	public void user_click_on_register_button() {
	    driver.findElement(By.xpath("//a[@href='/register'][contains(.,'Register')]")).click();
	   // throw new cucumber.api.PendingException();
	}

	@Given("user filled gender details")
	public void user_filled_gender_details() {
		 driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}

	@Given("frist name")
	public void frist_name() {
		 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Nikita");
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("lastName")
	public void lastname() {
		 driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("ichalkaranje");
	  //  throw new cucumber.api.PendingException();
	}

	@Given("email id")
	public void email_id() {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nikitaichal@gmail.com");
	   // throw new cucumber.api.PendingException();
	}

	@Then("fiiled password")
	public void fiiled_password() {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nikita");
		
	   // throw new cucumber.api.PendingException();
	}

	@Then("confirrmed password")
	public void confirrmed_password() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("nikita");
	   // throw new cucumber.api.PendingException();
		Thread.sleep(2000);
	}
	@Then("click on register")
	public void click_on_register() {
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	    //throw new cucumber.api.PendingException();
	}

	@Then("log out")
	public void log_out() throws InterruptedException{
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	   // throw new cucumber.api.PendingException();
		
	}
	
	
	@Given("user click on login button to enter data")
	public void user_click_on_login_button_to_enter_data() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ico-login")));
		driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
	  //  throw new cucumber.api.PendingException();
	}

	@Given("filled email id")
	public void filled_email_id() {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nikitaichal@gmail.com");
	   // throw new cucumber.api.PendingException();
	}

	@Given("password")
	public void password() {
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("nikita");
	   // throw new cucumber.api.PendingException();
	}

	@When("click on sumbit button to send data")
	public void click_on_sumbit_button_to_send_data() {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	  //  throw new cucumber.api.PendingException();
	}

	@Given("click on search item box")
	public void click_on_search_item_box() {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	  //  throw new cucumber.api.PendingException();
	}

	@Given("enter desire product")
	public void enter_desire_product() {
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
	  //  throw new cucumber.api.PendingException();
	}

	@Given("enter")
	public void enter() {
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
	    // throw new cucumber.api.PendingException();
	}

	@Given("click on add to cart")
	public void click_on_add_to_cart() {
		driver.findElement(By.xpath("//input[@type='button'])[3]")).click(); 
	  //  throw new cucumber.api.PendingException();
	}

	@Given("go to shooping cart")
	public void go_to_shooping_cart() {
		driver.findElement(By.xpath(" //input[contains(@value,'Add to cart')])[1]")).click();
	 //   throw new cucumber.api.PendingException();
	}

	@Then("check out product")
	public void check_out_product() {
		driver.findElement(By.xpath(" //button[@id='checkout']")).click(); 
	    // throw new cucumber.api.PendingException();
	}

}