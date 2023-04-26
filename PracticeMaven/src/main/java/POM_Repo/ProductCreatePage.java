package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCreatePage {
	
public ProductCreatePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
   @FindBy(xpath="//img[@alt='Create Product...']")
    private WebElement plusImg;
   
   @FindBy(name="productname")
   private WebElement PrdName;
   
   @FindBy(xpath="//input[@title='Save [Alt+S]']")
    private WebElement saveButton ;

   public WebElement getPlusImg() {
	 return plusImg;
}

   public WebElement getPrdName() {
	return PrdName;
}

  public WebElement getSaveButton() {
	 return saveButton;
}
  
//+img
  public void clickProduct() 
  {
	  plusImg.click(); 
  }
  
  //orgName
  public void productName(String productName)
  {
	  PrdName.sendKeys(productName);
  }
  
  //save
  public void saveButton()
  {
  saveButton.click();
  }
}



