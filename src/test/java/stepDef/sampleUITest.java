package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locators.Locator;

public class sampleUITest {
	
	Locator locate = new Locator();	
	WebDriver driver = new ChromeDriver();
	
	@Given("^Open google$")
	public void open_google() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SuyankaAgnihotri\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		
	}

	@When("^Sign in to Google by entering username and password$")
	public void sign_in_to_Google_by_entering_username_and_password() throws Throwable {
		String signin = Locator.sign_In_button;
		String username = Locator.email_field;
		String password = Locator.passwd_field;
		String next = Locator.next_button;
		driver.findElement(By.xpath(signin));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath(username)).sendKeys("");
		driver.findElement(By.xpath(next));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath(password)).sendKeys("");
		driver.findElement(By.xpath(next));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}

	@Then("^Logout from Google$")
	public void logout_from_Google() throws Throwable {
		String user_Logo = Locator.logged_In_Icon;
		String logout	=	Locator.signOut_button;
		driver.findElement(By.xpath(user_Logo));
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.xpath(logout));
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.close();
		driver.quit();

	}

	
	
}
