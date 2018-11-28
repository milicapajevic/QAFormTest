package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BussinesPage {
	

	public static WebElement getBusiness (WebDriver driver){	
		
		 WebElement business = driver.findElement(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']"));
	     return business;
	}
	
	public static WebElement getAddNewBusiness (WebDriver driver){	
		
		 WebElement addNewBusiness = driver.findElement(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']"));
	     return addNewBusiness;
	     }
public static WebElement getBackToBusinessList (WebDriver driver){	
		
	 WebElement backToBusinessList = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn--active v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
	 return backToBusinessList;
}
public static WebElement getBussinesName (WebDriver driver){	
	
	WebElement bussinesName = driver.findElement(By.xpath("//input[@id='business-form-name']"));
	return bussinesName;
}
public static WebElement getCountries (WebDriver driver){	
	
	WebElement countries = driver.findElement(By.xpath("//input[@id='business-form-country']"));
	return countries;
}
public static WebElement getCity (WebDriver driver){	
	
	WebElement city = driver.findElement(By.xpath("//input[@id='business-form-city']"));
	return city;
}
public static WebElement getStreet (WebDriver driver){	
	
	WebElement street = driver.findElement(By.xpath("//input[@id='business-form-street']"));
	return street;
}
public static WebElement getZip (WebDriver driver){	
	
	WebElement zip = driver.findElement(By.xpath("//input[@id='business-form-zip']"));
	return zip;
}
public static WebElement getRegistryNumber (WebDriver driver){	
	
	WebElement registryNumber = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
	return registryNumber;
}
public static WebElement getBankAccount (WebDriver driver){	
	
	WebElement BankAccount = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
	return BankAccount;
}
public static WebElement getBankName (WebDriver driver){	
	
	WebElement bankName = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
	return bankName;
}
public static WebElement getAccountNumber (WebDriver driver){	
	
	WebElement accountNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
	return accountNumber;
}
public static WebElement getSwiftNumber (WebDriver driver){	
	
	WebElement swiftNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
	return swiftNumber;
}
public static WebElement getPaymentInstructions(WebDriver driver){	
	
	WebElement paymentInstructions = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
	return paymentInstructions;
}
public static WebElement getCurrency(WebDriver driver){	
	
	WebElement currency = driver.findElement(By.xpath("//div[@class='v-select__selections']"));
	return currency;
}
	public static WebElement getCurrencyList(WebDriver driver){	
		
		WebElement currency = driver.findElement(By.xpath("//div[contains(text(),'Dinar')]"));
		return currency;
}
public static WebElement getCancel(WebDriver driver){	
	
	WebElement cancel = driver.findElement(By.xpath("//div[contains(text(),'Cancel')]"));
	return cancel;
}
public static WebElement getAddBankAccountButton(WebDriver driver){	
	
	WebElement addBankAccountButton = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
	return addBankAccountButton;
}
public static WebElement getSave(WebDriver driver){	
	
	WebElement save = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
	return save;
}

public static void setBusiness (WebDriver driver){	
	
	getBusiness(driver).click();
    }

public static void setAddNewBusiness (WebDriver driver){	
	
	getAddNewBusiness(driver).click();
    }
public static void setBackToBusinessList (WebDriver driver){	
	
	getBackToBusinessList(driver).click();
}
public static void setBussinesName (WebDriver driver, String bussinesName){	
	
	getBussinesName(driver).sendKeys(bussinesName);
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
public static void setRegistryNumber (WebDriver driver, String registryNumber){	
	
	getRegistryNumber(driver).sendKeys(registryNumber);
}
public static void setBankAccount (WebDriver driver){	
	
	getBankAccount(driver).click();
}
public static void setBankName (WebDriver driver, String bankName){	
	
	getBankName(driver).sendKeys(bankName);
}
public static void setAccountNumber (WebDriver driver, String accountNumber){	
	
	getAccountNumber(driver).sendKeys(accountNumber);
}
public static void setSwiftNumber (WebDriver driver, String swiftNumber){	
	
	getSwiftNumber(driver).sendKeys(swiftNumber);
}
public static void setPaymentInstructions(WebDriver driver, String paymentInstructions){	
	
	getPaymentInstructions(driver).sendKeys(paymentInstructions);
}
public static void setCurrency(WebDriver driver) {
	getCurrency(driver).click();
}

public static void setCurrencyList(WebDriver driver) {
	getCurrencyList(driver).click();
}
public static void setCancel(WebDriver driver){	
	
	getCancel(driver).click();
}
public static void setAddBankAccountButton(WebDriver driver){	
	
	getAddBankAccountButton(driver).click();
}
public static void setSave(WebDriver driver){	
	
	getSave(driver).click();
}
}