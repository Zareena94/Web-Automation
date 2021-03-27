package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignUsingActiTime {
public static WebDriver oBrowser=null;
public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		naviagte();
		login();
		minimizeWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();

	}
    public static void launchBrowser()
    {
    	try
    	{
    		String path=System.getProperty("user.dir");
    		System.setProperty("webdriver.chrome.driver",path+"\\lib\\drivers\\chromedriver.exe");
    		oBrowser = new ChromeDriver();
    		oPage = new ActiTimePage(oBrowser);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    public static void naviagte()
    {
    	try
    	{
    	    oBrowser.get("http://localhost/login.do");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
     static void login()
     {
    	 try
    	 {
    		oPage.getUserName().sendKeys("admin");
 			oPage.getPassword().sendKeys("manager");
 			oPage.getLogin().click();
 			Thread.sleep(4000); 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void minimizeWindow()
     {
    	 try
    	 {
    		oPage.getFlyOutWindow().click();
 			Thread.sleep(2000); 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void createUser()
     {
    	 try
    	 {
    		 oPage.getCreateUser().click();
    		 oPage.getCreateUserBtn().click();
    		 oPage.getFirstName().sendKeys("user1");
    		 oPage.getLastName().sendKeys("demo");
    		 oPage.getEmail().sendKeys("user@gmail.com");
    		 oPage.getUserName1().sendKeys("User1");
    		 oPage.getUserPwd().sendKeys("1234");
    		 oPage.getUserCopyPwd().sendKeys("1234");
    		 oPage.getCommitBtn().click();
    		 Thread.sleep(2000);
    		 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void deleteUser()
     {
    	 try
    	 {   oPage.getSearchBtn().sendKeys("khan,user1");
   	         Thread.sleep(2000);
   		     oPage.getUserDelt().click();
   		     Thread.sleep(2000);
   		     oPage.getUserDeltBtn().click();
    		 Alert oAlert=oBrowser.switchTo().alert();
    		 String content =oAlert.getText();
    		 oAlert.accept();
    		 Thread.sleep(2000);
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void logout()
     {
    	 try
    	 {
    		oPage.getLogout().click();
 			Thread.sleep(2000); 
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     static void closeApplication()
     {
    	 try
    	 {
    		 oBrowser.close();
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
     }
}
