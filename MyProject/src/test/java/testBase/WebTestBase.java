package testBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTestBase {
	public static WebDriver driver;
	public static Properties prop;
	//in class first Constructor is their
	public WebTestBase()
	{
		try
		{
			//used to read the properties file
			//user.dir=it will take the current Path
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"//properties//config.properties");
			prop = new Properties();
			//loading the properties file
			prop.load(fileInputStream);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void initialization()
	 {
		//for reading the property
        String browserName = prop.getProperty("browser");
        WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.http.factory", "jdk-http-client");//
			driver=new ChromeDriver();   
        
      
            
    		//creating object for chrome driver 
    	    
    	    driver.navigate().to(prop.getProperty("url"));
           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           driver.manage().deleteAllCookies();
        
	 }

	 

}
