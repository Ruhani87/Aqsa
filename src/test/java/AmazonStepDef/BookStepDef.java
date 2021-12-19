package AmazonStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStepDef {
	WebDriver driver;

@Given("Launch amazon url")
public void launch_amazon_url() {
	
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");////a[text()='Books']
	driver.manage().window().maximize();
}

@Then("Click on books")
public void click_on_books() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.linkText("Books")).click();
	
   
}

@Then("Click on children books")
public void click_on_children_books() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.linkText("Children's Books")).click();
   
}

@When("Verify  user can  see children book page")
public void verify_user_can_see_children_book_page() throws InterruptedException {
	Thread.sleep(2000);
	boolean verify=driver.findElement(By.xpath("//h2[text()='Books for every age and stage']")).isDisplayed();
    Assert.assertTrue(verify);
    driver.quit();
}

}
