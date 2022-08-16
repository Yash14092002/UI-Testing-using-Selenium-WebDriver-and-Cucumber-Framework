package StepDifinitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupplierTestDefintion {
	int time=2000;
	public WebDriver driver;
	@Given("supplier is on login page")
	public void supplier_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/api/supplier");
		driver.manage().window().maximize();
		System.out.println("Supplier is on login page");
	}

	@When("supplier enters valid email and password")
	public void supplier_enters_valid_email_and_password() {
		try {
			Thread.sleep(time);
			driver.findElement(By.name("email")).sendKeys("supplier@phptravels.com");
			driver.findElement(By.name("password")).sendKeys("demosupplier");
			Thread.sleep(time);
			System.out.println("Supplier enters valid username and password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("supplier clicks on login button")
	public void supplier_clicks_on_login_button() {
		try {
			Thread.sleep(time);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(time);
			System.out.println("Supplier clicks on login button");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	@Then("supplier will be navigated to home page")
	public void supplier_will_be_navigated_to_home_page() {
	     try {
	    	 Thread.sleep(time);
	    	 WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.xpath("//h1[@class='display-4 mb-0']")));
	    	 Thread.sleep(time);
		        String p=firstres.getText();

		        if(p.length()>0)
		        {
				System.out.println("successful login");
		        }
	     }
	     catch(Exception e)
			{
				System.out.println(e);
			}
	}
	@And("supplier will click on Dashboard")
	public void supplier_will_click_on_Dashboard() {
		try {
			 Thread.sleep(time);
			driver.findElement(By.xpath("//a[@class='nav-link loadeffect mdc-ripple-upgraded']")).click();
			 Thread.sleep(time);
			System.out.println("Clicked on Dashboard");
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("supplier to check on text Sales overview and summary")
	public void supplier_to_check_on_text_Sales_overview_and_summary() {
		try{
			Thread.sleep(time);
			boolean p=driver.findElement(By.xpath("//*[text()='Sales overview & summary']")).isDisplayed();
			Thread.sleep(time);
			System.out.println(p);
		}
		 catch(Exception e)
			{
				System.out.println(e);
			}
	}
	@And("supplier will check for Revenue Breakdown")
	public void supplier_will_check_for_Revenue_Breakdown() {
		try {
			Thread.sleep(time);
			boolean display=driver.findElement(By.xpath("//div[@class='col-lg-8 mb-5']//h2[@class='card-title mb-0']")).isDisplayed();
			Thread.sleep(time);
			System.out.println(display);
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("supplier will click on Bookings")
	public void supplier_will_click_on_Bookings() {
		try {
			Thread.sleep(time);
			driver.findElement(By.xpath("//a[@class='loadeffect nav-link collapsed mdc-ripple-upgraded']//div[@class='drawer-collapse-arrow']//i[@class='material-icons']")).click();
			Thread.sleep(time);
			System.out.println("Clicked on Bookings");
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("supplier will click on Pending Bookings")
	public void supplier_will_click_on_Pending_Bookings() {
	try {
		Thread.sleep(time);
		WebElement e=driver.findElement(By.xpath("//div[@class='icon-circle bg-warning text-white']//i[@class='material-icons']"));
		e.click();
		Thread.sleep(4000);
		System.out.println("Clicked on Pending Bookings");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	@And("supplier will convert one of record to Confirmed Bookings")
	public void supplier_will_convert_one_of_record_to_Confirmed_Bookings() {
		try {
			Thread.sleep(time);
			Select s=new Select(driver.findElement(By.id("booking_status")));
			Thread.sleep(time);
			s.selectByVisibleText("Confirmed");
			Thread.sleep(time);
			System.out.println("Changed to Confirmed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("supplier will navigate to booking page")
	public void supplier_will_navigate_to_booking_page() {
		try {
			Thread.sleep(time);
			driver.navigate().to("https://www.phptravels.net/api/supplier/bookings");
			Thread.sleep(time);
			System.out.println("Bookings page");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("supplier to be taken to main page")
	public void supplier_to_be_taken_to_main_page() {
		try {
			Thread.sleep(time);
			driver.navigate().to("https://www.phptravels.net/api/supplier");
			driver.navigate().refresh();
			Thread.sleep(time);
			System.out.println("Navigated to main page");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("supplier will check if Flight is displayed and if yes will check if it is clickable")
	public void supplier_will_check_if_Flight_is_displayed_and_if_yes_will_check_if_it_is_clickable() {
		try {
			Thread.sleep(time);
			 WebElement e=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.xpath("//i[normalize-space()='local_airport']")));
		
			Thread.sleep(time);
			if(e.getText().length()>0)
			{
				System.out.println(e.isDisplayed());
				e.click();
				Thread.sleep(time);
				e.click();
			}
			else {
				System.out.println("No such module");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("supplier will check if Visa is displayed and if yes will check if it is clickable")
	public void supplier_will_check_if_Visa_is_displayed_and_if_yes_will_check_if_it_is_clickable() {
		try {
			Thread.sleep(time);
			 WebElement e=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.xpath("//i[normalize-space()='class']")));
		
			Thread.sleep(time);
			if(e.getText().length()>0)
			{
				System.out.println(e.isDisplayed());
				e.click();
				Thread.sleep(time);
				e.click();
			}
			else {
				System.out.println("No such module");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("supplier will check if Tours is displayed and if yes will check if it is clickable")
	public void supplier_will_check_if_Tours_is_displayed_and_if_yes_will_check_if_it_is_clickable() {
		
		try {
			Thread.sleep(time);
			 WebElement e=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.xpath("//i[normalize-space()='luggage']")));
		
			Thread.sleep(time);
			if(e.getText().length()>0)
			{
				System.out.println(e.isDisplayed());
				e.click();
				Thread.sleep(time);
				e.click();
			}
			else {
				System.out.println("No such module");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("supplier will check if Bookings is displayed and if yes will check if it is clickable")
	public void supplier_will_check_if_Bookings_is_displayed_and_if_yes_will_check_if_it_is_clickable() {
		
		try {
			Thread.sleep(time);
			WebElement e=driver.findElement(By.xpath("//*[text()='Bookings']"));
			Thread.sleep(time);
			if(e.getText().length()>0)
			{
				System.out.println(driver.findElement(By.xpath("//*[text()='Bookings']")).isDisplayed());
				driver.findElement(By.xpath("//*[text()='Bookings']")).click();
				Thread.sleep(time);
			}
			else {
				System.out.println("No such module");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@And("close the application for supplier")
	public void close_the_application_for_supplier() {
		try {
			Thread.sleep(time);
		driver.quit();
		System.out.println("close the application");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@When("supplier enters invalid email and password")
	public void supplier_enters_invalid_email_and_password() {
		try {
			Thread.sleep(time);
			driver.findElement(By.name("email")).sendKeys("supplier@phptravel.com");
			driver.findElement(By.name("password")).sendKeys("demouser");
			Thread.sleep(time);
			System.out.println("Supplier enters invalid username and password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Then("supplier will be unable to login")
	public void supplier_will_be_unable_to_login() {
		 try {
			 Thread.sleep(time);
			 WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.xpath("//div[@class='alert alert-danger loading wow fadeIn animated animated']")));
			 Thread.sleep(time);
				System.out.println("Login failed"+firstres.getText());
		 }
		 catch(Exception e)
			{
				System.out.println(e);
			}
		 
	}

}
