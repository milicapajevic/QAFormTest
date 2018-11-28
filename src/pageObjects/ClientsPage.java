package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientsPage {

public static WebElement getClients(WebDriver driver){	
		
		WebElement clients = driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']"));
		return clients;
	}
	public static WebElement getAddNewClient(WebDriver driver){	
		
		WebElement addNewClient = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return addNewClient;
	}
public static WebElement getBackToClientList(WebDriver driver){	
		
		WebElement backToClientList = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn--active v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return backToClientList;
	}
public static WebElement getClientName(WebDriver driver){	
	
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement clientName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label=\"Client Name\"]")));
        return clientName;
    }

public static WebElement getContactName(WebDriver driver){	
	
	WebElement contactName = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
	return contactName;
}
public static WebElement getEmail(WebDriver driver){	
	
	WebElement email = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
	return email;
}
public static WebElement getRegistryNumber(WebDriver driver){	
	
	WebElement registryNumber = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
	return registryNumber;
}
public static WebElement getCountries(WebDriver driver){	
	
	WebElement countries = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
	return countries;
}

public static WebElement getCity(WebDriver driver){	
	
	WebElement city = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
	return city;
}
public static WebElement getStreet(WebDriver driver){	
	
	WebElement street = driver.findElement(By.xpath("//input[@aria-label=\"Street\"]"));
	return street;
	
}
public static WebElement getZip(WebDriver driver){	
	
	WebElement zip = driver.findElement(By.xpath("//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
	return zip;
}
public static WebElement getDateAdded(WebDriver driver){	
	
	WebElement dateAdded = driver.findElement(By.xpath("//div[@class='flex xs3']//div[@class='v-dialog__container']//input[@type='text']"));
	return dateAdded;
}
public static WebElement getCode(WebDriver driver){	
	
	WebElement code = driver.findElement(By.xpath("//input[@aria-label=\"Code\"]"));
	return code;
	
}
public static WebElement getAgreement(WebDriver driver){	
	
	WebElement agreement = driver.findElement(By.xpath("//div[@class='flex xs3 ml-3']//input[@type='text']"));
	return agreement;
}
public static WebElement getStatus(WebDriver driver){	
	
	WebElement status = driver.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple primary--text']"));
	return status;
}
public static WebElement getSave(WebDriver driver){	
	
	WebElement save = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
	return save;
}
public static void setClients(WebDriver driver){	
	
	getClients(driver).click();
}

public static void setAddNewClient(WebDriver driver){	
	
	getAddNewClient(driver).click();
}
public static void setBackToClientList(WebDriver driver){	
	
	getBackToClientList(driver).click();
}
public static void setClientName(WebDriver driver, String clientName){	

	getClientName(driver).sendKeys(clientName);
}
public static void setContactName(WebDriver driver, String contactName){	

	getContactName(driver).sendKeys(contactName);
}
public static void setEmail(WebDriver driver, String email){	

	getEmail(driver).sendKeys(email);
}
public static void setRegistryNumber(WebDriver driver, String registryNumber){	

	getRegistryNumber(driver).sendKeys(registryNumber);
}
public static void setCountries(WebDriver driver, String countryName) throws InterruptedException{   
Actions builder = new Actions(driver);
Actions country = builder
.moveToElement(getCountries(driver))
.click()
.sendKeys(countryName);
country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
country.perform();
		
}

public static void setCity (WebDriver driver, String city){	
	
	getCity(driver).sendKeys(city);
}
public static void setStreet (WebDriver driver, String street){	
	
	getStreet(driver).sendKeys(street);
}
public static void setZip (WebDriver driver, String zip){	
	
	getZip(driver).sendKeys(zip);
}
public static void setDateAdded(WebDriver driver){	

	getDateAdded(driver).click();
}
public static void setCode(WebDriver driver, String code){	

	getCode(driver).sendKeys(code);
}
public static void setAgreement(WebDriver driver, String agreement){	

	getAgreement(driver).sendKeys(agreement);
}
public static void setStatus(WebDriver driver){	

	getStatus(driver).click();
}
public static void setSave(WebDriver driver){	

	getSave(driver).click();
}
}
