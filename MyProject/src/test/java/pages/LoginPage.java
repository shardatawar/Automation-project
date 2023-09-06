package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testBase.WebTestBase;
import utils.utility;

public class LoginPage extends WebTestBase {
	
	
	 @FindBy(name = "login[username]")
	    WebElement Email;

	    @FindBy(name = "login[password]")
	    WebElement Password;

	    @FindBy(id = "send2")
	    WebElement send2;
	    
	    @FindBy(xpath = "//input[@type='text']")
	    WebElement searchTitle;
	    
	    @FindBy(xpath = "//select[@id='sorter']")
	    WebElement dropDown;
	 
	   

	    @FindBy(xpath = "//span[text()='Gear']")
	    WebElement hover;
	    
	   @FindBy(xpath = "//span[@class='action more button']")
	    WebElement shopNewYoga;
	  
	    
	    @FindBy(xpath = "//a[text()='Contact us']")
	    WebElement Contact;
	  
	    @FindBy(xpath = "/html/body/div[2]/header/div[2]/a/img")
	    WebElement logo;
	    
	   
	
	    public LoginPage(){
	    	//used for creating webelements
	        PageFactory.initElements(driver, this);
	    }
	
//sending the email and password to the login
	    public void login(String email, String password){
	    	Email.sendKeys(email);
	    	Password.sendKeys(password);
	    	send2.click();
	    }
	
       public void search() {
			
		searchTitle.sendKeys("Fusion Backpack");
			searchTitle.sendKeys(Keys.ENTER);
		        	
		}

		
		public void mouseHover() {
			utility.mouseHover1(driver,hover);
			
		}
		
		
		public void scrollDownMethod() {
			utility.scrollDownByElement(driver,Contact);
			
		}
         public void scrollDownMethod1() {
			
			utility.scrollDownByElement(driver,Contact);
		}

		
		public void scrollUpMethod() {
			utility.scrollUpByElement(driver,logo);
			
		}
		

		
		public String getTextOfSearch() {
			System.out.println(searchTitle.getAttribute("value"));
			return  searchTitle.getAttribute("value");
		}
		
		public void getCookiesHandle() {
			utility.getCookies();
		}

		public void selectDropDown(String term, String value) {
			
				 dropDown.click();
					utility.selectDropDown1(dropDown,term,value);
					
			}

		public void buttonClick() {
			shopNewYoga.click();
			
			
		}

		
		}