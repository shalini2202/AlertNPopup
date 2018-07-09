package com.AlertNPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertNPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("98765210");
	  
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
		
		Alert alert = driver.switchTo().alert();
	
		String text = alert.getText();
		System.out.println("The alert text is:" + text);
		
		alert.dismiss();
		
		
		
		
	}

}
