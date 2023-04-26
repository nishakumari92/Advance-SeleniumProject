package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignCreatePage {
	
public CampaignCreatePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

  @FindBy(linkText="Campaigns")
  private WebElement CampaignsLinkText;
   
   @FindBy(name="campaignname")
   private WebElement CagName;
   
   @FindBy(xpath="//img[@alt=\"Create Campaign...\"]")
   private WebElement plusImg ;
   
   @FindBy(xpath="//input[@title='Save [Alt+S]']")
    private WebElement saveButton ;

   
   public WebElement getCampaignsLinkText() {
		return CampaignsLinkText;
	}

   public WebElement getplusImg() {
	return plusImg;
}
   
   public WebElement getCagName() {
		return CagName;
	}

  public WebElement getSaveButton() {
	 return saveButton;
}
  
  
  
//Business logic for Campaigns
  
  public void clickCampaignsLinkText()
  {
 	 CampaignsLinkText.click();
  }
  
  //img
  
  public void clickplusImg()
  {
	  plusImg.click();
  }
  
  //orgName
  public void campaignName(String cagName)
  {
	  CagName.sendKeys(cagName);
  }
  
  //save
  public void saveButton()
  {
  saveButton.click();
  }
}


