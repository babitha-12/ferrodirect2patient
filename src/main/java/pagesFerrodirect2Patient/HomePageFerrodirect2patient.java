package pagesFerrodirect2Patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utiltiesFerrodirect2patient.PageUtilityFerrodirect2patient;



public class HomePageFerrodirect2patient {


	WebDriver driver;
	
	public HomePageFerrodirect2patient(WebDriver driver) {
	
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

 @FindBy(xpath="//span[text()='embrace X- Large 6.3\" (16cm) Active Scar Defense ']") 
 WebElement product;
 @FindBy(xpath="//a[text()='Pregnancy']")
 WebElement pregnancy;
 @FindBy(xpath="//a[text()='Skincare']")
 WebElement skinCare;
 @FindBy(xpath="//a[text()='Scars']") 
 WebElement scars;
 @FindBy(xpath="//a[text()='Vitamin Deficiency']")
 WebElement vitaminDeficiency;
 @FindBy(xpath="//a[text()='Menopause']")
 WebElement menopause;
 @FindBy(xpath="//a[text()='Vaginal Care']")
 WebElement vaginalCare;
 @FindBy(xpath="//a[text()='Fertility']")
 WebElement fertility;
 @FindBy(xpath="//a[text()='Trying to Conceive']")
 WebElement tryingtoConceive;
 @FindBy(xpath="//a[text()='Supplements']")
 WebElement supplements;
 @FindBy(xpath="//a[text()='Sexual Wellness']")
 WebElement sexualWellness;
 @FindBy(xpath="//a[text()='Displaying All']")
 WebElement displayingAll;


 
 public boolean isAllProductTabsareDisplayedonHomePage() {
    	   
    	   PageUtilityFerrodirect2patient.isElementLoaded(driver, pregnancy, 3);
	       return(pregnancy.isDisplayed()&&skinCare.isDisplayed()&&scars.isDisplayed()&&vitaminDeficiency.isDisplayed()&&menopause.isDisplayed()&&vaginalCare.isDisplayed()&&fertility.isDisplayed()&&tryingtoConceive.isDisplayed()&&supplements.isDisplayed()&&sexualWellness.isDisplayed()&&displayingAll.isDisplayed());

    	   
       }
 public void isSkinCareProductTabcanbeSeelctedtoPurchaseaProduct() {
		    //SkinCare product purchased by existing customer
	 
			PageUtilityFerrodirect2patient.isElementLoaded(driver,skinCare,3);
			skinCare.click();
			PageUtilityFerrodirect2patient.waitforElementTobeClickable(driver, product, 3);
			product.click();
 }	
 
}
