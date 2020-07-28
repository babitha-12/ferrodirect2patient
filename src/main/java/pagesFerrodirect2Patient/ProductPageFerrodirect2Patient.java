package pagesFerrodirect2Patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utiltiesFerrodirect2patient.PageUtilityFerrodirect2patient;

public class ProductPageFerrodirect2Patient {
WebDriver driver;
	
	public ProductPageFerrodirect2Patient(WebDriver driver) {
	
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
	


 @FindBy(xpath="//a[text()='Order Now']")
 WebElement orderNow;
 @FindBy(xpath="//a[text()='Checkout']")
 WebElement checkout;
 @FindBy(xpath="//a[text()='Are you an existing customer?']")
 WebElement exisitngCustomer;
 @FindBy(xpath="//input[@id='usernameId']")
 WebElement mobileNumber;
 @FindBy(xpath="//input[@id='passwordId']")
 WebElement passWord;
 @FindBy(xpath="//a[@id='checkoutSignInId']")
 WebElement login;
 @FindBy(xpath="//span[text()='Invalid Phone or Password']")
 WebElement validationMessage;
 @FindBy(xpath="//a[text()='Go Back']")
 WebElement goBack;
 @FindBy(xpath="//span[text()='Keep Shopping']")
 WebElement keepShopping;

	/* Checking whether SkinCare product can be  purchased by an existing customer and
	 checking whether invalid entry of mobile number or password of existing user will shows the validation message */
	           
	 public void isSkinCareProductcanbePurchased() {
			   
				
				PageUtilityFerrodirect2patient.waitforElementTobeClickable(driver, orderNow, 4);
				orderNow.click();
				PageUtilityFerrodirect2patient.isElementLoaded(driver, checkout, 3);
				checkout.click();

				}
	 
				
	 public String isinvalidentryofexistingCustomershowsValidationMessage(String mobilenumber,String password) {
		 
					//Exisitng Customer giving invalid or wrong mobile number or password as input.
			
		            PageUtilityFerrodirect2patient.isElementLoaded(driver, exisitngCustomer, 4);
			        exisitngCustomer.click();			
		            PageUtilityFerrodirect2patient.isElementLoaded(driver,mobileNumber,3);
					mobileNumber.sendKeys(mobilenumber);
					PageUtilityFerrodirect2patient.isElementLoaded(driver, passWord, 3);
					passWord.sendKeys(password);
					PageUtilityFerrodirect2patient.waitforElementTobeClickable(driver, login, 3);
					login.click();
					PageUtilityFerrodirect2patient.isElementLoaded(driver, validationMessage, 3);
					String invalidmessage=validationMessage.getText(); //validation message
					return invalidmessage;
				
			 }
	
	 public void isCustomerCanGoBacktoHomePage() {
		 
		 PageUtilityFerrodirect2patient.isElementLoaded(driver, goBack, 4);
		 goBack.click();
	 }
	 
	 public void isKeepShoppingcanbeClickedAfterOrderNowisClicked() {
			PageUtilityFerrodirect2patient.waitforElementTobeClickable(driver, orderNow, 4);
			orderNow.click();
			PageUtilityFerrodirect2patient.waitforElementTobeClickable(driver, keepShopping, 4);
			keepShopping.click();
		 
	 }
			
}

