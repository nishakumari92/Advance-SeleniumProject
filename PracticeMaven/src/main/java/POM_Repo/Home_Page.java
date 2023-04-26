package POM_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilities.WebDriver_Utility;

public class Home_Page {
	
	public Home_Page(WebDriver driver)  
	  {
	     PageFactory.initElements(driver,this);
	  }

	    //Declaration
	
	
	    @FindBy(linkText="Organizations")
         private WebElement OrganizationsLinkText;
	  
	    @FindBy(linkText="Products")
	      private WebElement productLinkText;
	     
	    @FindBy(xpath="//a[text()='More']")
	    private WebElement MoreButton;
	    
	    
	       
	     @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	      private WebElement SignoutImg;
	     
	     @FindBy(linkText="Sign Out")
	      private WebElement SignoutLinkText;
	     
	     
	     //getters method

		public WebElement getProductLinkText() {
			return productLinkText;
		}


		public WebElement getMoreButton() {
			return MoreButton;
		}

		
		public WebElement getOrganizationsLinkText() {
			return OrganizationsLinkText;
		}


		public WebElement getSignoutImg() {
			return SignoutImg;
		}


		public WebElement getSignoutLinkText() {
			return SignoutLinkText;
		}
	 

   //Business Logics For Organization
		
     public void clickOrganizationsLinkText() 
     {
		
    	 OrganizationsLinkText.click();
      }
     
   //  Business logic for Products
     public void clickproductLinkText()
     {
    	 productLinkText.click();
     }
     
 //  Business logic for More
     public void clickMoreButton()
     {
    	 MoreButton.click();
     }
 
     
 //  Business logic for SignOut
     
     public void logout(WebDriver driver)
     {
    	 Actions a = new Actions(driver);
	     a.moveToElement(SignoutImg).perform();
	     SignoutLinkText.click();
     }
     
}   
     
     
     