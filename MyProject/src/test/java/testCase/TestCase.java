package testCase;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.LoginPage;

import testBase.WebTestBase;

public class TestCase extends WebTestBase{
	
	HomePage homePage;
	 LoginPage loginPage;
	
	public TestCase(){
        super();
    }
	@BeforeMethod
	public void BeforeMethod()
	{
		//Loading the driver file and establishing the connection ,loading the url
	initialization();
	
	homePage =new HomePage();
	loginPage = new LoginPage();
	
}

 @Test(priority=1)
	public void check() {
		System.out.println("Welcome");
	}
 @Test(priority=2)
 public void verifyLoginWithValidCredentials() {
		SoftAssert softAssert = new SoftAssert();
	     homePage.userSearchClick();
	    
	     loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	   // softAssert.assertEquals(myAccountPage.getTextOFMYAccountPage(), "My Account", "My Account text should be match");
	     softAssert.assertAll();
	}
 @Test(priority=3)
 public void verifyselectDropDown() throws InterruptedException {
	 SoftAssert softAssert = new SoftAssert();
	 
	 loginPage.buttonClick();
     loginPage.selectDropDown("byVisibleText", "Price");
     softAssert.assertAll();
 }
 
 @Test(priority=4)
	public void verifySearchBar() throws InterruptedException{
	     SoftAssert softAssert = new SoftAssert();
	     loginPage.search();
	     Thread.sleep(1000);
	     // System.out.println(loginPage.getTextOfSearch());
	     //System.out.println("Hi");
	     softAssert.assertEquals(loginPage.getTextOfSearch(),"Fusion Backpack");
	    
	     softAssert.assertAll();
	 }
	@Test(priority=5)
	public void verifyMouseHover(){
	     SoftAssert softAssert = new SoftAssert();
	     loginPage.mouseHover();
	     softAssert.assertAll();
	 }
	

	@Test(priority=6)
	 public void verifyScrollDown(){
	     SoftAssert softAssert = new SoftAssert();
	     loginPage.scrollDownMethod();
	     softAssert.assertAll();
	 }
	@Test(priority=7)
	public void verifyScrollUp() throws InterruptedException{
	     SoftAssert softAssert = new SoftAssert();
	     loginPage.scrollDownMethod1();
	     Thread.sleep(1000);
	     loginPage.scrollUpMethod();
	     softAssert.assertAll();
	 }
	@Test(priority=8)
	public void verifyCookiesHandle(){
	     SoftAssert softAssert = new SoftAssert();
	     loginPage.getCookiesHandle();
	     softAssert.assertAll();
	 }
	
@AfterMethod
public void afterMethod(){     
	driver.close();
}
}
