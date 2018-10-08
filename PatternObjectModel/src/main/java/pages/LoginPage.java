package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	//@And("Enter the User Name as (.*)")
	public LoginPage enterUserName(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(eleUserName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	//@And("Enter the password as (.*)")
	public LoginPage enterPassword(String data) {
		//WebElement elePassword = locateElement("password");
		type(elePassword, data);
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	//@When("click on the Login Button")
	public HomePage clickLogIn() {
		click(eleLogin);
		return new HomePage();		
	}
	//@Then("Login should be successful")
	public void checkLoginStatus() {
		System.out.println("The user has logged in successfully");
	}
	
	//@But("validate whether the login is successful or not")
	public LoginPage clickLogInForFailer() {
		click(eleLogin);
		System.out.println("The user has not entered proper credentials");
		return this;		
	}
	
	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMsg;
	
	public LoginPage verifyErrorMsg(String data) {
	verifyPartialText(eleErrorMsg, data);
		return this;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
