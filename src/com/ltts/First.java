package com.ltts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class First {
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver mydriver = new ChromeDriver();
		/*
		
		mydriver.get("https://www.seleniumeasy.com");
		mydriver.manage().window().maximize();
	
		mydriver.findElement(By.className("form-control")).sendKeys("Pagal-Bagal");
		mydriver.findElement(By.className("form-control")).clear();
		Thread.sleep(5000);
		mydriver.findElement(By.id("at-cv-lightbox-close")).click();
		Thread.sleep(5000);
		mydriver.findElement(By.className("form-control")).sendKeys("Pagal-Bagal");
		mydriver.findElement(By.className("btn-default")).click();
		
		mydriver.findElement(By.className("btn-lg")).click();
		Thread.sleep(4000);
		mydriver.switchTo().alert().dismiss();
	
		
		Select drpdwn = new Select(mydriver.findElement(By.id("multi-select")));
		drpdwn.selectByIndex(1);
		drpdwn.selectByIndex(2);
		
		drpdwn.selectByValue("California");
		mydriver.findElement(By.id("printAll")).click();
		
		mydriver.findElement(By.className("u_0_n_LH")).sendKeys("Prashant");
		mydriver.findElement(By.className("u_0_p_CK")).sendKeys("Bagal");
		mydriver.findElement(By.className("u_0_s_ti")).sendKeys("bagal-pagal@gmail.com");
		mydriver.findElement(By.className("password_step_input")).sendKeys("Bagal@arpi#2018");
		
		Select dd = new Select(mydriver.findElement(By.id("day")));
		dd.selectByValue("1");//Enter date
		Select mm = new Select(mydriver.findElement(By.id("month")));
		mm.selectByValue("9");//Enter month
		Select yy = new Select(mydriver.findElement(By.id("year")));
		yy.selectByValue("1998");//Enter year
		
		WebElement radio1 = mydriver.findElement(By.cssSelector("input[value='2']"));
		radio1.click();
		
		Thread.sleep(3000);
		mydriver.findElement(By.name("websubmit")).click();
		
		//Link test tag starts with a href
		mydriver.findElement(By.linkText("Demo Website")).click();
		
		
		mydriver.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
		mydriver.manage().window().maximize();
		WebElement slider = mydriver.findElement(By.xpath("//div[@class='range']"));
	    Actions act = new Actions(mydriver);
	    act.dragAndDropBy(slider, 50, 0).build().perform();
	   
		mydriver.get("https://emicalculator.net/");
		mydriver.manage().window().maximize();
		WebElement slider = mydriver.findElement(By.xpath("//div[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	    Actions act = new Actions(mydriver);
	    act.dragAndDropBy(slider, 50, 0).build().perform();
	    slider = mydriver.findElement(By.xpath("//div[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"));
	    act = new Actions(mydriver);
	    act.dragAndDropBy(slider, 55, 0).build().perform();
	    slider = mydriver.findElement(By.xpath("//div[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"));
	    act = new Actions(mydriver);
	    act.dragAndDropBy(slider, 25, 0).build().perform();
	    */
		mydriver.get("https://opensource-demo.orangehrmlive.com");
		mydriver.manage().window().maximize();
		
		mydriver.findElement(By.id("txtUsername")).sendKeys("Admin");
		mydriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement firstname = mydriver.findElement(By.id("txtUsername"));
		String s = firstname.getText();
		System.out.println(s);
	
	}

}
