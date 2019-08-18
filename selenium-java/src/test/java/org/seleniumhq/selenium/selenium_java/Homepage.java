package org.seleniumhq.selenium.selenium_java;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Homepage {
		
		static String actualTitle;
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
	   Properties prop = new Properties();
	   FileInputStream ip = new FileInputStream("C:\\Users\\Subhash\\git\\repository\\selenium-java\\src\\test\\java\\prop\\Elements.Properties");
	   prop.load(ip);
	   System.out.println(prop.getProperty("URL"));
	    
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Subhash\\eclipse-workspace\\chromedriver.exe");
	   WebDriver driver=  new ChromeDriver();
	   
	   driver.get(prop.getProperty("URL"));
	   actualTitle = driver.getTitle();
	   driver.manage().window().maximize();
	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   WebElement webElement = driver.findElement(By.id(prop.getProperty("Pickup")));
	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   webElement.sendKeys("Bar");
	   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   webElement.sendKeys(Keys.TAB);
	   
	    driver.findElement(By.id(prop.getProperty("Dropoff"))).sendKeys("Barcelona city centre");
	    try {   
	    Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
	 			Thread.sleep(3000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	    webElement.sendKeys(Keys.TAB);
	    
	        driver.findElement(By.id(prop.getProperty("Booknow"))).click();
	        try {
	     			Thread.sleep(3000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}    
	        driver.findElement(By.name(prop.getProperty("BookProduct"))).click();
		
	        try {
	     			Thread.sleep(3000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Useremail"))).sendKeys("email@email.com");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Conirmemail"))).sendKeys("email@email.com");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Title"))).sendKeys("Mr.");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Firstname"))).sendKeys("X");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Surname"))).sendKeys("Y");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Mobile"))).sendKeys("1234567890");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Arrivalflight"))).sendKeys("1234");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Departureairport"))).sendKeys("lon");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  

	        driver.findElement(By.name(prop.getProperty("Departureflight"))).sendKeys("4321");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Accomodation"))).sendKeys("Star");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Address1"))).sendKeys("1");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}  
	        driver.findElement(By.name(prop.getProperty("Address2"))).sendKeys("2");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		} 
	        driver.findElement(By.id(prop.getProperty("Paymenttype"))).click();
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		} 

	        driver.findElement(By.name(prop.getProperty("Accountholderaddress1"))).sendKeys("1");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		} 
	        driver.findElement(By.name(prop.getProperty("Accountholderaddress2"))).sendKeys("2");
	    	
	        try {
	     			Thread.sleep(2000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		} 
	        driver.findElement(By.name(prop.getProperty("Accountholderpostcode"))).sendKeys("BN1 1ND");
	    	
	        try {
	     			Thread.sleep(3000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}
	        driver.findElement(By.xpath(prop.getProperty("Termsconditions"))).click();
	    	
	        try {
	     			Thread.sleep(3000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}
	        driver.findElement(By.name(prop.getProperty("ContinuetoPayment"))).click();
	    	
	        try {
	     			Thread.sleep(3000);
	     		} catch (InterruptedException e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}
		} 
		
		}
		 



