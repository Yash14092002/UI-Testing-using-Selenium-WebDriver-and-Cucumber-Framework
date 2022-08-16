package StepDifinitions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AgentStepDefinition {
	public WebDriver driver;
	int time=2000;
	@Given("agent is on login page")
	public void agent_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		System.out.println("agent is on login page");
	}
	@And("agent accept cookies")
	public void agent_accept_cookies() {
		try {
			Actions actions = new Actions(driver);
			Thread.sleep(time);
			WebElement e=driver.findElement(By.xpath("//button[@id='cookie_stop']"));
			actions.moveToElement(e).perform();
			Thread.sleep(time);
			e.click();
			Thread.sleep(time);
			System.out.println("Clicks on Got It");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@When("agent enters valid email and password")
	public void agent_enters_valid_email_and_password() {
		try {
			Thread.sleep(time);
			driver.findElement(By.name("email")).sendKeys("agent@phptravels.com");
			driver.findElement(By.name("password")).sendKeys("demoagent");
			Thread.sleep(time);
			System.out.println("Agent enters valid email and password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("agent clicks on login button")
	public void agent_clicks_on_login_button() {
		try {
			Thread.sleep(time);
			driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).click();
			Thread.sleep(time);
			System.out.println("agent clicks on login button");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Then("agent will be navigated to home page")
	public void agent_will_be_navigated_to_home_page() {
		try {
			Thread.sleep(time);
			WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.partialLinkText("Home")));
			String p=firstres.getText();

			if(p.length()>0)
			{
				System.out.println("successful login");
			}
			Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on My Bookings")
	public void agent_clicks_on_My_Bookings() {
		try {

			driver.findElement(By.xpath("//ul[@class='sidebar-menu list-items']//a[contains(@class,'waves-effect')][normalize-space()='My Bookings']")).click();
			Thread.sleep(time);

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			System.out.println("Clicked on My Bookings");
			Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on Add Funds")
	public void agent_clicks_on_Add_Funds() {
		try {


			driver.findElement(By.xpath("//li[contains(@class,'user_wallet')]//a[contains(@class,'waves-effect')][normalize-space()='Add Funds']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			System.out.println("Clicked on Add Funds");
			Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on My Profile")
	public void agent_clicks_on_My_Profile() {
		try {

			driver.findElement(By.xpath("//ul[@class='sidebar-menu list-items']//a[contains(@class,'waves-effect')][normalize-space()='My Profile']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			System.out.println("Clicked on My Profile");
			Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on Logout")
	public void agent_clicks_on_Logout() {
		try {
			Thread.sleep(time);
			driver.findElement(By.xpath("//ul[@class='sidebar-menu list-items']//a[contains(@class,'waves-effect')][normalize-space()='Logout']")).click();
			System.out.println("Clicked on Logout");
			Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on Home")
	public void agent_clicks_on_Home() {
		try {

			driver.findElement(By.xpath("//body/header[@class='header-area']/div[@class='header-menu-wrapper padding-right-100px padding-left-100px']/div[@class='container']/div[@class='row']/div[@class='col-lg-12']/div[@class='menu-wrapper']/div[@class='main-menu-content']/nav/ul/li[1]/a[1]")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			System.out.println("Clicked on Home");
			Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("agent clicks on Hotels no scroll")
	public void agent_clicks_on_Hotels_no_scroll() {
		try {
			driver.findElement(By.xpath("//a[normalize-space()='Hotels']")).click();
			Thread.sleep(time);

			System.out.println("Clicked on Hotels");
			Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on Hotels")
	public void agent_clicks_on_Hotels() {
		try {
			driver.findElement(By.xpath("//a[normalize-space()='Hotels']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			System.out.println("Clicked on Hotels");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on Flights")
	public void agent_clicks_on_Flights() {
		try {
			driver.findElement(By.xpath("//a[normalize-space()='flights']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			System.out.println("Clicked on Flights");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on Tours")
	public void agent_clicks_on_Tours() {
		try {

			driver.findElement(By.xpath("//a[normalize-space()='Tours']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			System.out.println("Clicked on Tours");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on Visa")
	public void agent_clicks_on_Visa() {
		try {

			driver.findElement(By.xpath("//a[normalize-space()='visa']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			System.out.println("Clicked on Visa");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on Blog")
	public void agent_clicks_on_Blog() {
		try {

			driver.findElement(By.xpath("//a[@title='blog']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			System.out.println("Clicked on Blog");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent clicks on Offers")
	public void agent_clicks_on_Offers() {
		try {
			driver.findElement(By.xpath("//a[@title='offers']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			System.out.println("Clicked on Offers");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@When("agent enters a city")
	public void agent_enters_a_city() {
		try {
			Thread.sleep(time);
			driver.findElement(By.xpath("//b[@role='presentation']")).click();
			Thread.sleep(time);
			WebElement element=driver.findElement(By.xpath("//input[@role='searchbox']"));
			element.sendKeys("Bangalore");
			WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.className("select2-results__option--highlighted")));
			firstres.click();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	@And("agent clicks on search")
	public void agent_clicks_on_search() {
		try {
			Thread.sleep(time);
			driver.findElement(By.id("submit")).click();
			
			Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent is on page displaying hotels available in the city")
	public void agent_is_on_page_displaying_hotels_available_in_the_city() {
		try {
			Thread.sleep(time);
			WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.className("sec__title_list")));
			String p=firstres.getText();

			if(p.length()>0)
			{
				System.out.println("agent is on page displaying hotels available in the city");
			}
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(time);
			driver.navigate().back();
			Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("agent will click on dropdown button after USD and change it to INR")
	public void agent_will_click_on_dropdown_button_after_USD_and_change_it_to_INR() {
		try {
			Actions actions = new Actions(driver);
			Thread.sleep(time);
			driver.findElement(By.id("currency")).click();
			Thread.sleep(time);
			WebElement e=driver.findElement(By.xpath("//a[normalize-space()='INR']"));
			actions.moveToElement(e).perform();
			Thread.sleep(time);
			e.click();
			Thread.sleep(time);
			//a[normalize-space()='INR']
			System.out.println("Updated to INR");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@When("agent enters invalid email and password")
	public void agent_enters_invalid_email_and_password() {
		try {
			Thread.sleep(time);
			driver.findElement(By.name("email")).sendKeys("agent@phptravels.com");
			driver.findElement(By.name("password")).sendKeys("demouser");
			Thread.sleep(time);
			System.out.println("Agent enters invalid email and password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Then("agent will be unable to login")
	public void agent_will_be_unable_to_login() {
		try {
			Thread.sleep(time);
			WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.className("message")));
			Thread.sleep(time);
			System.out.println("Login failed"+firstres.getText());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("close the application for agent")
	public void close_the_application_for_agent() {
		try {
			driver.close();
			Thread.sleep(time);
			System.out.println("close the application");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}



}
