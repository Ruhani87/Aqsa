package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef2 {
	WebDriver driver;

@Given("Launch url")
public void launch_url() {
	
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	
	driver.get("https://www.dell.com/en-us");//Launch dell application
	driver.manage().window().maximize();
	
}

@Then("Mouse over on Sign in")
public void mouse_over_on_sign_in() {
	Actions ac=new Actions(driver);
	WebElement move=driver.findElement(By.id("um-si-label"));
	ac.moveToElement(move).build().perform();
   
}

@Then("click on sign in")
public void click_on_sign_in() {
	WebElement cli=driver.findElement(By.cssSelector("a[class=\"mh-btn mh-btn-primary navigate\"]"));
	cli.click();
   
}

@Then("Enter email")
public void enter_email() {
	WebElement username=driver.findElement(By.id("EmailAddress"));
	username.sendKeys("ruhani7867@gmail.com");
    
}
@Then("Enter password")
public void enter_password() {
	WebElement pass=driver.findElement(By.id("Password"));
	pass.sendKeys("Tahsin2009");
	
} 

@When("Click on sign in button")
public void click_on_sign_in_button() {
	WebElement cl=driver.findElement(By.id("sign-in-button"));
	cl.click();
   
}

@Then("Verify user can login")
public void verify_user_can_login() {
	System.out.println(driver.getTitle());
	
	String actualTitle="Login or Register | Dell US";
	String expectedTitle=driver.getTitle();
	
	Assert.assertEquals(actualTitle,expectedTitle );
	driver.quit();
   
}

}
