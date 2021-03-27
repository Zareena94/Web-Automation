package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	WebDriver oBrowser=null;
	public ActiTimePage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		PageFactory.initElements(oBrowser, this);
	}
	//UserName text field WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password text field WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//FlyoutWindow WebElement
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement oUser;
	public WebElement getCreateUser()
	{
		return oUser;
	}
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement addUserButtonbeigeButtonuseNativeActive;
	public WebElement getCreateUserBtn()
	{
		return  addUserButtonbeigeButtonuseNativeActive;
	}
	private WebElement firstName;
	public WebElement getFirstName()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement getLastName()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserName1()
	{
		return  userDataLightBox_usernameField;
	}
	private WebElement password;
	public WebElement getUserPwd()
	{
		return password;
	}
	private WebElement passwordCopy;
	public WebElement getUserCopyPwd()
	{
		return passwordCopy;
	}
	private WebElement userDataLightBox_commitBtn;
	public WebElement getCommitBtn()
	{
		return userDataLightBox_commitBtn;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement userDetails;
	public WebElement getUserModification()
	{
		return userDetails;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement userLastName;
	public WebElement getUserLastName()
	{
		return userLastName;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement newUserName;
	public WebElement getUserNewLastName()
	{
		return newUserName;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
	private WebElement commitBtn;
	public WebElement getUserCommitBtn()
	{
		return commitBtn;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
	private WebElement oTask;
	public WebElement getTask()
	{
		return oTask;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement oAddNew;
	public WebElement getAddNewBtn()
	{
		return  oAddNew;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement oAddCutomer;
	public WebElement getAddNewCustomer()
	{
		return  oAddCutomer;
	}
	@FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
	private WebElement customerEntryBox;
	public WebElement getCustomerName()
	{
		return  customerEntryBox;
	}
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement commitButton;
	public WebElement getCustomerCommitBtn()
	{
		return  commitButton;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oCustomer;
	public WebElement getCustButton()
	{
		return oCustomer;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement oDesc;
	public WebElement getCustomerModified()
	{
		return oDesc;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement oclose;
	public WebElement getCloseCustomer()
	{
		return  oclose;
	}
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement oProject;
	public WebElement getNewProject()
	{
		return oProject;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectName()
	{
		return projectPopup_projectNameField;
	}
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']")
	private WebElement createProj;
	public WebElement getCreateProj()
	{
		return createProj;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement clickSetting;
	public WebElement getClickSetting()
	{
		return clickSetting;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement clickAction;
	public WebElement getClickActionBtn()
	{
		return clickAction;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement clickDelt;
	public WebElement getClickDeltBtn()
	{
		return clickDelt;
	}
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")
	private WebElement clickDeltPermanently;
	public WebElement getClickDeltPermanent()
	{
		return  clickDeltPermanently;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement oAction;
	public WebElement getActionBtn()
	{
		return oAction;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement oDelte;
	public WebElement getDelteBtn()
	{
		return oDelte;
	}
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")
	private WebElement oDeltedePermanently;
	public WebElement getCustomerPermtDelt()
	{
		return  oDeltedePermanently;
	}
	
	
	
	
	
	@FindBy(xpath="//*[@id=\'userListTableHeader\']/tr[2]/th[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")
	private WebElement oSearchBtn;
	public WebElement getSearchBtn()
	{
		return oSearchBtn;
	}
	
	
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement oDelt;
	public WebElement getUserDelt()
	{
		return oDelt;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement oDeltBtn;
	public WebElement getUserDeltBtn()
	{
		return oDeltBtn;
	}
	
	
	
	
	
	//Logout Link WebElement
	@FindBy(xpath="//*[@id=\'logoutLink\']")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}

}
