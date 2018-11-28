package automationFramework;

import pageObjects.BussinesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


import utility.Constant;
import utility.ExcelUtils;

public class BusinessPageTest {
	public static void SetUpExcel() throws Exception {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet2");
	}
	
  public static String AddNewBusinessTest(WebDriver driver) throws Exception {
	  
		String businessName = ExcelUtils.getCellData(1, 1);
		System.out.println(businessName);
		String countries = ExcelUtils.getCellData(1, 2);
		System.out.println(countries);
		String city = ExcelUtils.getCellData(1, 3);
		System.out.println(city);
		String street = ExcelUtils.getCellData(1, 4);
		System.out.println(street);
		String zip = ExcelUtils.getCellData(1, 5);
		System.out.println(zip);
		String registryNumber = ExcelUtils.getCellData(1, 6);
		System.out.println(registryNumber);
		String bankName = ExcelUtils.getCellData(1, 7);
		System.out.println(bankName);
		String accountNumber = ExcelUtils.getCellData(1, 8);
		System.out.println(accountNumber);
		String swiftNumber = ExcelUtils.getCellData(1, 9);
		System.out.println(swiftNumber);
		String paymentInstructions = ExcelUtils.getCellData(1, 10);
		System.out.println(paymentInstructions);
		
		Thread.sleep(5000);
		BussinesPage.setAddNewBusiness(driver);
		System.out.println("Seting business name");
		BussinesPage.setBussinesName(driver, businessName);
		System.out.println("Seting contact name");
		BussinesPage.setCountries(driver, countries);
		System.out.println("Seting city");
		BussinesPage.setCity(driver, city);
		System.out.println("Seting street");
		BussinesPage.setStreet(driver, street);
		System.out.println("Seting zip");
		BussinesPage.setZip(driver, zip);
		System.out.println("Seting registry number");
		BussinesPage.setRegistryNumber(driver, registryNumber);
		BussinesPage.setBankAccount(driver);
		System.out.println("Seting bank name");
		BussinesPage.setBankName(driver, bankName);
		System.out.println("Seting account number");
		BussinesPage.setAccountNumber(driver, accountNumber);
		System.out.println("Seting swift number");
		BussinesPage.setSwiftNumber(driver, swiftNumber);
		System.out.println("Seting payment instructions");
		BussinesPage.setPaymentInstructions(driver, paymentInstructions);
		System.out.println("Seting currency");
		BussinesPage.setCurrency(driver);
		BussinesPage.setCurrencyList(driver);
		System.out.println("Seting bank account");
		BussinesPage.setAddBankAccountButton(driver);
		System.out.println("Save");
		BussinesPage.setSave(driver);
		Thread.sleep(1000);
		return "Pass";
  }
}
