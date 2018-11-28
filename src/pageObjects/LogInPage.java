package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

public class LogInPage {

	public static WebElement getEmail (WebDriver driver){	
		
		 WebElement email = driver.findElement(By.xpath("//input[@id='login-form-email']"));
	     return email;
	     }
	public static WebElement getPassword (WebDriver driver){	
		
		 WebElement password = driver.findElement(By.xpath("//input[@id='login-pass']"));
	     return password;
	     }
	public static WebElement getLogin (WebDriver driver){	
		
		 WebElement login = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
	     return login;
	     }
	
	public static void setEmail (WebDriver driver, String email){	
		
		 getEmail(driver).sendKeys(email);
	     }
	public static void setPassword (WebDriver driver, String password){	
		
		 getPassword(driver).sendKeys(password);
	     }
	public static void setLogin (WebDriver driver){	
		
		 getLogin(driver).click();
	     }
}
