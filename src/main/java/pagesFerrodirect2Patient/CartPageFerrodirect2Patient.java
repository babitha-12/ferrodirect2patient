package pagesFerrodirect2Patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utiltiesFerrodirect2patient.PageUtilityFerrodirect2patient;

public class CartPageFerrodirect2Patient {
	
		WebDriver driver;
			
			public CartPageFerrodirect2Patient(WebDriver driver) {
			
				this.driver=driver;
			    PageFactory.initElements(driver, this);
			}
			 @FindBy(xpath="//a[@href='http://ferro.direct2patient.com/check-out']")
			 WebElement cart;
			@FindBy(xpath="//span[text()='embrace X- Large 6.3\" (16cm) Active Scar Defense']")
			WebElement productinCart;
			
			 public void clickonCart() {
				 PageUtilityFerrodirect2patient.waitforElementTobeClickable(driver, cart, 4);
				 cart.click();
			
			 }
			public boolean isProductisavailableinCart() {
				
				 PageUtilityFerrodirect2patient.waitforElementTobeClickable(driver, productinCart, 4);
				 return productinCart.isDisplayed();
			}
			
}
