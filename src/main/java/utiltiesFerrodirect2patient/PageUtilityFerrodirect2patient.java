package utiltiesFerrodirect2patient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilityFerrodirect2patient {

	public static WebElement isElementLoaded(WebDriver driver,WebElement elementTobeLoaded,int Time) { 
		
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement  element=wait.until(ExpectedConditions.visibilityOf(elementTobeLoaded));
		return element;
		
	}
	public static WebElement waitforElementTobeClickable(WebDriver driver,WebElement elementTobeLoaded,int Time) {
		
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement  element=wait.until(ExpectedConditions.elementToBeClickable(elementTobeLoaded));
		return element;
		
	}
    public static  Boolean waitfortextpresentinElement(WebDriver driver, WebElement elementTobePresent, String text, int Time) {
		
		WebDriverWait wait=new WebDriverWait(driver,Time);
		Boolean  element=wait.until(ExpectedConditions.textToBePresentInElement(elementTobePresent, text));
		return element;
		
	}
  public static  Boolean waitfortheattributeToBe(WebDriver driver, WebElement elementTobePresent, int Time, String attribute, String value) {
		
		WebDriverWait wait=new WebDriverWait(driver,Time);
		Boolean  element=wait.until(ExpectedConditions.attributeToBe(elementTobePresent, attribute, value));
		return element;
		
	}
  public static  WebElement waitforpresenceOfElementLocated(WebDriver driver, WebElement elementTobePresent, By locator,  int Time) {
		
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement  element=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
		
	}

}
