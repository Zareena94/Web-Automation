package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4UsingActiTime {
  public static  WebDriver oBrowser = null;
  public static ActiTimePage oPage = null;

	public static void main(String[] args)
	{
		launchBrowser();
		naviagte();
		login();
		minimizeWindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
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
	     static void createCustomer()
	     {
	    	 try
	    	 {
	    		oPage.getTask().click();
	    		Thread.sleep(2000);
	    		oPage.getAddNewBtn().click();
	    		Thread.sleep(2000);
	    		oPage.getAddNewCustomer().click();
	    		Thread.sleep(2000);
	    		oPage.getCustomerName().sendKeys("Infosys");
	    		Thread.sleep(2000);
	    		oPage.getCustomerCommitBtn().click();
	    		Thread.sleep(2000);
	    		
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	    	 
	     }
	     static void createProject()
	     {
	    	 try
	    	 {
	    		 oPage.getAddNewBtn().click();
		    	 Thread.sleep(2000); 
		    	 oPage.getNewProject().click();
		    	 Thread.sleep(2000);
		    	 oPage.getProjectName().sendKeys("Java Project");
		    	 Thread.sleep(2000);
		    	 oPage.getCreateProj().click();
		    	 Thread.sleep(2000);
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	    	 
	     }
	     static void deleteProject()
	     {
	    	 try
	    	 {
	    		oPage.getClickSetting().click();
	    		Thread.sleep(2000);
	    		oPage.getClickActionBtn().click();
	    		Thread.sleep(2000);
	    		oPage.getClickDeltBtn().click();
	    		Thread.sleep(2000);
	    		oPage.getClickDeltPermanent().click();
	    		Thread.sleep(2000);
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	     }
	     static void deleteCustomer()
		    {
		    	try
		    	{
		    		oPage.getCustButton().click(); 
		    		Thread.sleep(2000);
		    		oPage.getActionBtn().click();
		    		Thread.sleep(2000);
		    		oPage.getDelteBtn().click();
		    		Thread.sleep(2000);
		    		oPage.getCustomerPermtDelt().click();
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
