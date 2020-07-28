package testScriptsFerrodirect2patient;

import org.testng.annotations.Test;

import pagesFerrodirect2Patient.CartPageFerrodirect2Patient;
import pagesFerrodirect2Patient.HomePageFerrodirect2patient;
import pagesFerrodirect2Patient.ProductPageFerrodirect2Patient;

import org.testng.Assert;


public class RegressionTestFerro extends TestHelperFerro {
 
	@Test
	
	/* Verify that pregnancy, scars, vitamin deficinecy, skincare, menopause, vaginal care, fertility,trying to conceive, 
	supplements, vaginal care, sexual wellness and displaying all are displayed on home page */
	
	public void verifyProductTabsareDispalyedonHomePage() {
		HomePageFerrodirect2patient homePageFerrodirect2patient=new HomePageFerrodirect2patient(driver);
		Assert.assertTrue(homePageFerrodirect2patient.isAllProductTabsareDisplayedonHomePage());
	}
	
	@Test
	
	/* Checking whether SkinCare product can be  purchased by an existing customer and
	 checking whether invalid entry of mobile number or password of existing user will shows the validation message */
	
	public void verifythatExistingCustomercanPurchaseaProduct() {
		HomePageFerrodirect2patient homePageFerrodirect2patient=new HomePageFerrodirect2patient(driver);
		homePageFerrodirect2patient.isSkinCareProductTabcanbeSeelctedtoPurchaseaProduct();
		ProductPageFerrodirect2Patient productPageFerrodirect2Patient=new ProductPageFerrodirect2Patient(driver);
		productPageFerrodirect2Patient.isSkinCareProductcanbePurchased();
		Assert.assertEquals(productPageFerrodirect2Patient.isinvalidentryofexistingCustomershowsValidationMessage("960543917", "1q2w4r"), "Invalid Phone or Password");
	   
	}
	
	@Test
	// verify whether the product is visible in cart after clicking on Order Now
	
	public void verifyProductSelectedisAddedtoCart() {
		HomePageFerrodirect2patient homePageFerrodirect2patient=new HomePageFerrodirect2patient(driver);
		homePageFerrodirect2patient.isSkinCareProductTabcanbeSeelctedtoPurchaseaProduct();
		ProductPageFerrodirect2Patient productPageFerrodirect2Patient=new ProductPageFerrodirect2Patient(driver);
		productPageFerrodirect2Patient.isKeepShoppingcanbeClickedAfterOrderNowisClicked();
		CartPageFerrodirect2Patient cartPageFerrodirect2Patient=new CartPageFerrodirect2Patient(driver);
		cartPageFerrodirect2Patient.clickonCart();
		Assert.assertTrue(cartPageFerrodirect2Patient.isProductisavailableinCart());
		
	}
	
	@Test
	/* Checking whether customer can go back to home page from product page*/
	
	public void verifyCustomerCanGoBacktoHomePagefromProductPagebyclickingonGoBackTab() {
		HomePageFerrodirect2patient homePageFerrodirect2patient=new HomePageFerrodirect2patient(driver);
		homePageFerrodirect2patient.isSkinCareProductTabcanbeSeelctedtoPurchaseaProduct();
		ProductPageFerrodirect2Patient productPageFerrodirect2Patient=new ProductPageFerrodirect2Patient(driver);
		productPageFerrodirect2Patient.isSkinCareProductcanbePurchased();
		productPageFerrodirect2Patient.isCustomerCanGoBacktoHomePage();
		homePageFerrodirect2patient.isAllProductTabsareDisplayedonHomePage();
		
	}
 
 
	
  }


