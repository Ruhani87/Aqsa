package CvsStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefHealthHub {
	WebDriver driver;

@Given("Launch cvs url")
public void launch_cvs_url() {
	
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	
	driver.get("https://www.cvs.com/");
	driver.manage().window().maximize();
   
}

@Then("Click on healthhub option")
public void click_on_healthhub_option() {
	driver.findElement(By.xpath("//a[text()='HealthHUB']")).click();
  
}

@When("Verify healthhub page")
public void verify_healthhub_page() {
 boolean veri= driver.findElement(By.xpath("//h2[text()='Affordable, quality health services']")).isDisplayed();
 Assert.assertTrue(veri);
 driver.quit();
}

}



