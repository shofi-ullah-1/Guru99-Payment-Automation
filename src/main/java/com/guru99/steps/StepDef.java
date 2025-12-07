package com.guru99.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.guru99.pages.PaymentPage;
import com.guru99.pages.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver driver;
	ProductPage productPage = new ProductPage() ;
	PaymentPage paymentPage = new PaymentPage();
	
	
	
	@Given("Open any browser")
	public void open_any_browser() {
	   driver = new ChromeDriver();
	}

	@Given("Go to application link")
	public void go_to_application_link() {
		 driver.get(productPage.getURL());
	}

	@When("Select product quantity to four")
	public void select_product_quantity_to_four() throws InterruptedException {
		WebElement quantityDropdown = driver.findElement(By.xpath(productPage.getQuantity()));
		Select select = new Select(quantityDropdown);
        select.selectByVisibleText("4");
        
        
      Thread.sleep(3000);
      WebElement box = driver.findElement(By.xpath(productPage.getBox()));
      if(box.isDisplayed()) {
    	  box.click();
      }
	}

	@When("Click buy now")
	public void click_buy_now() throws InterruptedException {
	   
	    
	    driver.findElement(By.xpath(productPage.getBuyNow())).click();
	    
	}

	@When("Add Credit card information")
	public void add_credit_card_information() {
	driver.findElement(By.xpath(paymentPage.getCardNumber())).sendKeys("1111222233334444");
	WebElement monthDropdown = driver.findElement(By.xpath(paymentPage.getMonth()));
	Select select = new Select(monthDropdown);
    select.selectByVisibleText("04");
    
	WebElement yearDropdown = driver.findElement(By.xpath(paymentPage.getYear()));
	Select selects = new Select(yearDropdown);
    selects.selectByValue("2028");
    
    driver.findElement(By.xpath(paymentPage.getCvvCode())).sendKeys("123");
 
	}

	@When("Click submit order")
	public void click_submit_order() {
		   driver.findElement(By.xpath(paymentPage.getSubmit())).click();
	}

	@Then("Order should be successful and order id should be generated")
	public void order_should_be_successful_and_order_id_should_be_generated() {

	WebElement payStatus = driver.findElement(By.xpath(paymentPage.getOrdersuccess()));
	Assert.assertTrue(payStatus.isDisplayed());
	driver.quit();
		
		

	}
}
