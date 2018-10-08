package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
	
	public MergeLead() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how = How.XPATH,using = "//img[@src = '/images/fieldlookup.gif']")
	WebElement fromLead;
	public MergeLead enterFromLead() {
		click(fromLead);
		switchToWindow(1);
		return this;
	}
	
	
	@FindBy(how = How.XPATH,using = "(//div[@class = 'x-form-element'])[2]/input")
	WebElement FnamE;
	public MergeLead enterFirstNamE(String data) {
		type(FnamE,data);
		return this;
	}
	
	@FindBy(how = How.XPATH,using = "//button[@class = 'x-btn-text']")
	WebElement findLead;
	public MergeLead clickFinDLeads() {
		click(findLead);
		return this;
	}
	@FindBy(how = How.XPATH,using = "(//a[@class = 'linktext'])[16]")
	WebElement clikanyLead;
	public MergeLead clickAnyLead() {
		click(clikanyLead);
		switchToWindow(0);
		return this;
	}
	
	@FindBy(how = How.XPATH,using = "(//img[@src = '/images/fieldlookup.gif'])[2]")
	WebElement tolead;
	public MergeLead enterToLead() {
		click(tolead);
		switchToWindow(1);
		return this;
	}
	
	@FindBy(how = How.XPATH,using = "//a[text() = 'Merge']")
	WebElement merge;
	public ViwLead clickMerge() {
		click(merge);
		acceptAlert();
		return new ViwLead();
	}
	/*@FindBy(how = How.XPATH,using = "(//div[@class = 'x-form-element'])[2]/input")
	WebElement FNAME;
	public MergeLead enterFIRSTName(String data) {
		type(FNAME,data);
		return this;
	}*/
	
	
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
