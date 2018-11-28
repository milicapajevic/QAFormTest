package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInPage;
import utility.ExcelUtils;

public class SignIn_Action {
	public static void Execute(WebDriver driver) throws Exception {
		
	String email = ExcelUtils.getCellData(1, 1);
	String password = ExcelUtils.getCellData(1, 2);

	LogInPage.setEmail(driver, email);
	LogInPage.setPassword(driver, password);
	LogInPage.setLogin(driver);
	
}
}
