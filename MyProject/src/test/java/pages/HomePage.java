package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;


	public class HomePage extends WebTestBase{
		@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
		WebElement signIn;

	//creating web elements
	    public HomePage(){
	        PageFactory.initElements(driver,this);
	    }

	  
	    public void userSearchClick(){
	    	signIn.click();
	    }


	

}
