package com.creatio.crm.language.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceCssSelector {
	
	
	// grand parents parent : div[id='headerPanel']
	// grand parent : ul[class='leftmenu']
	// parent : li
	// target : a[href='services.htm']

	public static void main(String[] args) {
//		1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

//		2. Maximize the browser window  
		driver.manage().window().maximize();

//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)  
		driver.get("https://parabank.parasoft.com/parabank/index.htm");		
		
//		5. Locate the WebElement solutions 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li[class='Solutions']"));
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(1)"));
		driver.findElement(By.cssSelector("li[class='Solutions']"));

//      6. Locate the WebElement About us 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(2) > a")); // About us
		
//		7. Locate the WebElement Services 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(3) > a")); // Services
		
//		8. Locate the WebElement Product 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(4) > a"));// Product		
		
//		9. Locate the WebElement Location 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(5) > a")); // Location
		
//		10. Locate the WebElement Adminpage 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(6) > a")); // Adminpage
		
// 		11. Locate the WebElement Home Image 'cssSelector' Locator
		driver.findElement(By.cssSelector("li[class='home']>a"));
		driver.findElement(By.cssSelector("ul[class='button'] > li:nth-child(1) >a")); // Image Home
		driver.findElement(By.cssSelector("div[id='headerPanel']>ul[class='button'] > li:nth-child(1) >a")); // Image Home
		
// 		12. Locate the WebElement AboutUS Image 'cssSelector' Locator
		driver.findElement(By.cssSelector("li[class='aboutus']>a"));
		driver.findElement(By.cssSelector("ul[class='button'] > li:nth-child(2) >a")); // Image About Us
		driver.findElement(By.cssSelector("div[id='headerPanel']>ul[class='button'] > li:nth-child(2) >a")); 
		
// 		13. Locate the WebElement Contact Image 'cssSelector' Locator
		driver.findElement(By.cssSelector("li[class='contact']>a"));
		driver.findElement(By.cssSelector("ul[class='button'] > li:nth-child(3) >a")); // Image Contact
		driver.findElement(By.cssSelector("div[id='headerPanel']>ul[class='button'] > li:nth-child(3) >a")); 
		
		
// 		15. Locate the WebElement Log In 'cssSelector' Locator
		driver.findElement(By.cssSelector("[value='Log In')]"));
		driver.findElement(By.cssSelector("input[type='submit']"));
	
// 		16. Locate the WebElement Forgot log in   and Register 'cssSelector' Locator
		
		
		driver.findElement(By.linkText("Forgot login info"));
		driver.findElement(By.linkText("Register"));
		
// 		17. Locate the WebElement ATM Service 'cssSelector' Locator
//		17 Atm Services a)Withdraw Funds b) TransferFunds C) Check Balance D) Make Deposit
		
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(2) >a")); //Withdraw Funds
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(3) >a")); //TransferFunds
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(4) >a")); //Check Balance
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(5) >a")); //Make Deposit
		
//		18 Online Services a) Bill Pay b) Account History c ) Transfer Account
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(2) >a")); //Bill Pay
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(3) >a")); //Account History
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(4) >a")); //Transfer Account 
		
//		19.  02/04/2025  a) ParaBank is Now Re-opened b) News! online Bill Pay c ) News! online Account Transfer
		driver.findElement(By.cssSelector("ul[class='events'] > li:nth-child(2) >a")); //ParaBank is Now Re-opened
		driver.findElement(By.cssSelector("ul[class='events'] > li:nth-child(3) >a")); //News! online Bill Pay
		driver.findElement(By.cssSelector("ul[class='events'] > li:nth-child(4) >a")); //News! online Account Transfer

		
//	    20. ReadMore (duplicate) with two web elements
		driver.findElement(By.cssSelector("p[class='more']>a"));
		driver.findElement(By.cssSelector("div[id='rightPanel'>p[class='more']>a"));
		driver.findElement(By.linkText("Read More"));
		
//      21.Footer a)Home b)About US c)Services d) Products e)Locations f) Forum g) Site Map h) Contact Us
		
		driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li:nth-child(1) >a")); // Home
		driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li:nth-child(2) >a")); // About US
		driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li:nth-child(3) >a")); // Services
		driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li:nth-child(4) >a")); // Products
		driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li:nth-child(5) >a")); // Locations
		driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li:nth-child(6) >a")); // Forum
		driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li:nth-child(7) >a")); // Site Map
		driver.findElement(By.cssSelector("div[id='footerPanel']>ul>li:nth-child(8) >a")); // Contact Us
		
//		22. UserName and Password	text field	
		
		driver.findElement(By.name("username"));
		driver.findElement(By.cssSelector("input[name='username']"));
		driver.findElement(By.cssSelector("input[type='text']"));
		driver.findElement(By.cssSelector("[type='text']"));
		driver.findElement(By.cssSelector("[name='username']"));
		
		driver.findElement(By.name("password"));
		driver.findElement(By.cssSelector("input[name='password']"));
		driver.findElement(By.cssSelector("input[type='password']"));
		driver.findElement(By.cssSelector("[name='password']"));
		driver.findElement(By.cssSelector("[type='password']"));
		
		
		
		
		
		
		
		
		
		
				
		
		

	}

}

