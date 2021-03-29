package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class second {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		
		mydriver.get("https://opensource-demo.orangehrmlive.com");
		mydriver.manage().window().maximize();
		
		mydriver.findElement(By.id("txtUsername")).sendKeys("Admin");
		mydriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		mydriver.findElement(By.id("btnLogin")).click();
		mydriver.findElement(By.linkText("Maintenance")).click();
		mydriver.findElement(By.id("confirm_password")).sendKeys("admin123");
		mydriver.findElement(By.xpath("//input[@value='Verify']")).click();
		mydriver.get("https://opensource-demo.orangehrmlive.com");
		WebElement ele = mydriver.findElement(By.linkText("Leave"));
		/*
		mydriver.findElement(By.id("menu_leave_applyLeave")).click();
		Select drpdwn = new Select(mydriver.findElement(By.id("applyleave_txtLeaveType")));
		drpdwn.selectByIndex(2);
		mydriver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2021-03-24");
		mydriver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2021-03-27");
		mydriver.findElement(By.id("applyBtn")).click();
		
		Select drpdwn2 = new Select(mydriver.findElement(By.id("applyleave_duration_duration")));
		drpdwn2.selectByIndex(1);
		*/
		Actions act = new Actions(mydriver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		//ele = mydriver.findElement(By.linkText("Admin"));
		//act.moveToElement(ele).build().perform();
		
		ele = mydriver.findElement(By.linkText("Entitlements"));
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		mydriver.findElement(By.id("menu_leave_viewLeaveEntitlements")).click();
		mydriver.get("https://opensource-demo.orangehrmlive.com");
		ele = mydriver.findElement(By.linkText("Leave"));
		act.moveToElement(ele).build().perform();
		mydriver.findElement(By.id("menu_leave_viewLeaveList")).click();
		
		
		mydriver.findElement(By.xpath("/html/body/div[3]/div/div[2]/section/div/table/tbody/tr[5]/td[5]"));
		
	}

}
