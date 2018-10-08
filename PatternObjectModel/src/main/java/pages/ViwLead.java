package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViwLead extends ProjectMethods{
	
	public ViwLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how = How.LINK_TEXT,using = "Edit")
	WebElement Edit;
	public EditLead EditLeads() {
		click(Edit);
		return new EditLead();
	}
	@FindBy(how = How.CLASS_NAME,using = "subMenuButtonDangerous")
	WebElement delete;
	public MyLeads deleteLead() {
		click(delete);
		return new MyLeads();
	}
	@FindBy(how = How.LINK_TEXT,using = "Duplicate Lead")
	WebElement dupli;
	public DuplicateLead clickDuplicateLead() {
		click(dupli);
		return new DuplicateLead();
	}
	/*@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}*/
	/*@FindBy(how = How.LINK_TEXT,using = "CRM/SFA")
	WebElement crmlink;
	public LeadsPage CRMSFAlink() {
		click(crmlink);
		return new LeadsPage();
	}*/
	
	/*@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;
	
	public HomePage verifyLoggedName(String data) {
	verifyPartialText(eleLoggedName, data);
		return this;		
	}
	*/
	
	
	
	

}
