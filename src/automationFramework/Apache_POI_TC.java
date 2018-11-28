package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModules.SignIn_Action;
import pageObjects.BussinesPage;
import pageObjects.LogOut;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI_TC {
	public static void main(String[] args) throws Exception {

	    ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(Constant.URL);
	    SignIn_Action.Execute(driver);
	    System.out.println("Login Successfully.");
	    ExcelUtils.setCellData("Pass", 1, 3);
	    
	    Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URLB);
		Thread.sleep(5000);
		BusinessPageTest.AddNewBusinessTest(driver);
		ExcelUtils.setCellData("Pass", 1, 11);
		
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet3");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URLC);
		Thread.sleep(5000);
		ClientsPageTest.AddNewClientTest(driver);
		ExcelUtils.setCellData("Pass", 1, 10);
		
		LogOut.setLogOutIcon(driver);
		LogOut.setLogOutButton(driver);
		Thread.sleep(2000);
		LogOut.setLogOut(driver);
		System.out.println("Logout Successfully.");
	 
		Thread.sleep(5000);
	    driver.close();
}
}
