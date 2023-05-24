package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefs {
	
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.get("https://www.saucedemo.com/");
		
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(UserNameVal);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String PassVal) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(PassVal);
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement Loginbtn = driver.findElement(By.id("login-button"));
		Loginbtn.click();
		Thread.sleep(2000);
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   	
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ExptError) {
	    // Write code here that turns the phrase above into concrete actions
	   
		WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActError = error.getText();
		
		Assert.assertEquals(ActError, ExptError);
		
		
		
		
	}

}
