package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icici {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		mydriver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		mydriver.manage().window().maximize();
		//mydriver.findElement(By.className("carRelbtn")).click();
		//mydriver.findElement(By.id("New Car Loan")).click();
		mydriver.findElement(By.name("CUSTFIRSTNAME")).sendKeys("Manzar");
		mydriver.findElement(By.name("CUSTLASTNAME")).sendKeys("Hussain");
		mydriver.findElement(By.name("MOBILENUM")).sendKeys("9760542563");
		JavascriptExecutor js = (JavascriptExecutor) mydriver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement firstname = mydriver.findElement(By.id("logInPanelHeading"));
		String s = firstname.getText();
		System.out.println(s);
	
	}

}
