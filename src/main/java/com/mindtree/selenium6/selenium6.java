package com.mindtree.selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver6/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.xpath("//a[@href='https://www.moneycontrol.com/personal-finance/']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(a).build().perform();
		
	
		
		
	}

}
