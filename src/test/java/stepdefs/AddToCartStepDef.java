package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDef {
	
	WebDriver driver = Hooks.driver;

@When("I click on the Product name as {string}")
public void i_click_on_the_Product_name_as(String string) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    
	WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
    product.click();
    
    Thread.sleep(1000);
    
}

@When("I  click on Add to cart button")
public void i_click_on_Add_to_cart_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   
	WebElement Addtocart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
	Addtocart.click();
	
	Thread.sleep(1000);
	
}

@When("I click on Shopping cart button")
public void i_click_on_Shopping_cart_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    
	WebElement cartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	cartLink.click();
	
	 Thread.sleep(1000);
	 
}

@Then("I validate the item displayed on the cart page")
public void i_validate_the_item_displayed_on_the_cart_page() {
    
	WebElement ItemOnCartPage = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	String ExpItem = ItemOnCartPage.getText();
	String ActlItem = "Sauce Labs Backpack";
	
	Assert.assertEquals(ActlItem, ExpItem);
	
   
}


}
