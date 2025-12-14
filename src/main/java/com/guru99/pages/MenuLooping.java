package com.guru99.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		
		List<WebElement> navLinks = driver.findElements(By.xpath("//td[@class='mouseOut']//a"));
		
		for(int i = 0; i<navLinks.size(); i++) {
			System.out.println(navLinks.get(i).getText());
		}
		
		driver.quit();
	}

}
