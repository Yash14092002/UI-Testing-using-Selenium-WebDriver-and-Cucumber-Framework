package StepDifinitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinition {
	int time=2000;
	public WebDriver driver;
@Given("admin is on login page")
public void admin_is_on_login_page() {
    System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://phptravels.net/api/admin");
	driver.manage().window().maximize();
	System.out.println("admin is on login page");
}

@When("admin enters valid email and password")
public void admin_enters_valid_email_and_password() {
	try {
		Thread.sleep(time);
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		Thread.sleep(time);
		System.out.println("Admin enters valid email and password");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

@And("admin clicks on login button")
public void admin_clicks_on_login_button() {
try {
	Thread.sleep(time);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(time);
	System.out.println("Admin clicks on login button");
}
catch(Exception e)
{
	System.out.println(e);	
}
}

@Then("admin will be navigated to home page")
public void admin_will_be_navigated_to_home_page() {
    try {
    	Thread.sleep(time);
    	 WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.xpath("//a[normalize-space()='Website']")));
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
@And("admin will click on Bookings")
public void admin_will_click_on_Bookings() {
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
@And("admin will click on Paid Bookings")
public void admin_will_click_on_Paid_Bookings() {
	try {
		Thread.sleep(time);
		driver.findElement(By.xpath("//div[@class='card card-raised border-start border-primary border-4 paid_']//div[@class='d-flex justify-content-between align-items-center mb-2']")).click();
		Thread.sleep(time);
		System.out.println("Clicked on Paid Bookings");
	}
	 catch(Exception e)
    {
    	System.out.println(e);	
    }
}
@And("admin will click on invoice of one of the record")
public void admin_will_click_on_invoice_of_one_of_the_record() {
	try {
		Actions action=new Actions(driver);
		Thread.sleep(time);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e=driver.findElement(By.xpath("//tbody/tr[1]/td[13]/a[1]"));
		action.moveToElement(e).perform();
		Thread.sleep(time);
		e.click();
		  String winHandleBefore = driver.getWindowHandle();

		  // Perform the click operation that opens new window

		  // Switch to new window opened
		  for(String winHandle : driver.getWindowHandles()){
		      driver.switchTo().window(winHandle);
		  }
		  Thread.sleep(3000);
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  Thread.sleep(time);
		  // Perform the actions on new window

		  // Close the new window, if that window no more required
		  driver.close();

		  // Switch back to original browser (first window)
		  driver.switchTo().window(winHandleBefore);

		System.out.println("Invoice Displayed");
		Thread.sleep(time);
	}
	 catch(Exception e)
    {
    	System.out.println(e);	
    }
}
@And("close the application for admin")
public void close_the_application_for_admin() {
	try {
		Thread.sleep(time);
		driver.quit();
		Thread.sleep(time);
		System.out.println("close the application");
	}
	catch(Exception e)
    {
    	System.out.println(e);	
    }
}
@And("navigate to booking page")
public void navigate_to_booking_page() {
	try {
		Thread.sleep(time);
		driver.navigate().to("https://www.phptravels.net/api/admin/bookings");
		Thread.sleep(time);
		System.out.println("close the application");
	}
	catch(Exception e)
    {
    	System.out.println(e);	
    }
}
@And("will click on Cancelled Bookings")
public void will_click_on_Cancelled_Bookings() {
	try {
		Thread.sleep(time);
		driver.findElement(By.xpath("//div[@class='icon-circle bg-danger text-white']//i[@class='material-icons']")).click();
		Thread.sleep(time);
		System.out.println("Clicked on Cancelled Bookings");
	}
	catch(Exception e)
    {
    	System.out.println(e);	
    }
}
@And("admin will click on Pending Bookings")
public void admin_will_click_on_Pending_Bookings() {
	try {
		Thread.sleep(time);
		WebElement e=driver.findElement(By.xpath("//div[@class='icon-circle bg-warning text-white']//i[@class='material-icons']"));
		e.click();
		Thread.sleep(time);
		System.out.println("Clicked on Pending Bookings");
	}
	catch(Exception e)
    {
    	System.out.println(e);	
    }
}
@And("admin will convert one of record to Confirmed Bookings")
public void admin_will_convert_one_of_record_to_Confirmed_Bookings() {
	try {
		Thread.sleep(time);
		Select s=new Select(driver.findElement(By.id("booking_status")));
		s.selectByVisibleText("Confirmed");
		Thread.sleep(time);
		System.out.println("Changed to Confirmed");
	}
	catch(Exception e)
    {
    	System.out.println(e);	
    }
}
@And("admin will click on delete button")
public void admin_will_click_on_delete_button() {
	try {
		Actions action=new Actions(driver);
		Thread.sleep(time);
		WebElement e=driver.findElement(By.className("fa-times"));
		action.moveToElement(e).perform();
		Thread.sleep(time);
		e.click();
		Thread.sleep(time);
		driver.switchTo().alert().accept();
		System.out.println("Clicked on Delete Button");
	}
	catch(Exception e)
    {
    	System.out.println(e);	
    }
}

@And("click on website")
public void click_on_website() {
try {
	Thread.sleep(time);
	driver.findElement(By.xpath("//a[normalize-space()='Website']")).click();
	Thread.sleep(5000);
	System.out.println("Website");
}
catch(Exception e)
{
	System.out.println(e);	
}
}

@When("admin enters invalid email and password")
public void admin_enters_invalid_email_and_password() {
	try {
		Thread.sleep(time);
		driver.findElement(By.name("email")).sendKeys("dem@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demo124");
		Thread.sleep(time);
		System.out.println("Admin enters invalid email and password");
	}
	catch(Exception e)
	{
		System.out.println(e);	
	}
}

@Then("admin will be unable to login")
public void admin_will_be_unable_to_login() {
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
