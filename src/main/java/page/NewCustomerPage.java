package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;


public class NewCustomerPage {
	
	WebDriver driver;
	
	public NewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//strong[contains(text(), 'New Customer')]") WebElement NEW_CUSTOMER_VALIDATION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[1]/div/input") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[2]/div/select") WebElement COMPANY_DROPDOWN_ELEMENT;
	
	public void validatenNewCustomerPage(String newCustomerText) {
		Assert.assertEquals(NEW_CUSTOMER_VALIDATION_ELEMENT.getText(), newCustomerText, "New Customer page is not available!");
	}
	
	public void insertFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName);
	}
	
	public void selectCompany(String company) {
		Select sel = new Select(COMPANY_DROPDOWN_ELEMENT);
		sel.selectByVisibleText(company);
	}
	
	
}
