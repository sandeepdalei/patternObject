package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{
	
	public FindLead() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how = How.XPATH,using = "(//div[@class = 'x-form-element'])[19]/input")
	WebElement fNames;
	public FindLead enterFirstname(String data) {
		type(fNames,data);
		return this;
	}
	@FindBy(how = How.XPATH,using="(//button[@class = 'x-btn-text'])[7]")
	WebElement clickfindleads;
	public FindLead clickFindleads() {
		click(clickfindleads);
		return this;
	}
	@FindBy(how = How.XPATH,using="(//a[@class='linktext'])[4]")
	WebElement clickleads;
    public ViwLead clicKLeads() {
    	click(clickleads);
    	return new ViwLead();
    }
    @FindBy(how = How.XPATH,using = "(//a[@class='linktext'])[40]")
    WebElement duplead;
    public ViwLead clickDuplead() {
    	click(duplead);
    	return new ViwLead();
    }
}
