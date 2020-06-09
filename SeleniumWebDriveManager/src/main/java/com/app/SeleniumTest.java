package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {


		/**	WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.operadriver().setup();
		WebDriverManager.phantomjs().setup();
		WebDriverManager.iedriver().setup();
		WebDriverManager.chromiumdriver().setup(); */

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/");

		WebElement textBox = driver.findElement(By.id("lst-ib"));
		textBox.sendKeys("automation step by step");
		Thread.sleep(3000);
		driver.close();
		driver.quit();         
	}

}