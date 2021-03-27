package assignprogram.withoutwebelement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedProg2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {

	    launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
	    user1();
	    user2();
	    user3();
	    logout();
	    loginUserAs1();
	    logout();
	    loginAsUser2();
	    logout();
	    loginAsUser3();
	    logout();
	    login();
	    modifyUser1();
	    modifyUser2();
	    modifyUser3();
	    logout();
	    newloginUser1();
	    logout();
	    newloginUser2();
	    logout();
	    newloginUser3();
	    logout();
	    login();
	    deleteUser1();
	    deltUser2();
	    deltUser3();
	    logout();
	    closeApplication();
	    }
	public static void launchBrowser()
	{
	   try
	   {
		   String path = System.getProperty("user.dir");
		   System.setProperty("webdriver.chrome.driver",path+"\\lib\\drivers\\chromedriver.exe");
		   oBrowser = new ChromeDriver();
		   Thread.sleep(2000);
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	}
	public static void navigate()
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
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("User");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("demo@email.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("Zareen");
			oBrowser.findElement(By.name("lastName")).sendKeys("khan");
			oBrowser.findElement(By.name("email")).sendKeys("khan@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("5678");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("5678");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void user3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("salma");
			oBrowser.findElement(By.name("lastName")).sendKeys("khanum");
			oBrowser.findElement(By.name("email")).sendKeys("khanum@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("6789");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("6789");
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
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
			oBrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginUserAs1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("5678");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("6789");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser1()
	{
		try
		{   oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
		    Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("testing123");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("testing123");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("password123");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("password123");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
		    Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("software123");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("software123");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void newloginUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("testing123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void newloginUser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("password123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void newloginUser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("software123");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String textcontent=oAlert.getText();
			System.out.println(textcontent);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deltUser2()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String textcontent=oAlert.getText();
			System.out.println(textcontent);
			oAlert.accept();
			Thread.sleep(2000);
			 
			 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deltUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String textcontent=oAlert.getText();
			System.out.println(textcontent);
			oAlert.accept();
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
