package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chromedriver", "E:\\SeleniumTest\\div\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("praveen280694@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("8939535006");
		
		WebElement login = driver.findElement(By.name("login"));
		
		login.click();
		
		
		
		
		
                   
		
		
		
		
		
	}

}
