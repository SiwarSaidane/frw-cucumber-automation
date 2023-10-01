package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {
	
	private ConfigFileReader configFileReader;
	
	/*@FindBy*/
	@FindBy(name = "firstName")
	public static WebElement firstName;
	
	@FindBy(name = "lastName")
	public static WebElement lastName;
	
	@FindBy(name = "phone")
	public static WebElement phone;
	
	@FindBy(id="userName")
	public static WebElement email;
	
	@FindBy(name="address1")
	public static WebElement address;
	
	@FindBy(name="city")
	public static WebElement city;
	
	@FindBy(name="state")
	public static WebElement state;
	
	@FindBy(name="postalCode")
	public static WebElement postalCode;
	
	@FindBy(name="country")
	public static WebElement countryMenu;
	
	@FindBy(id="email")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(name="confirmPassword")
	public static WebElement confirmPassword;
	
	@FindBy(how = How.NAME, using="submit")
	public static WebElement btnEnvoyer;
	
	@FindBy(xpath="//b[contains(text(),'Dear')]")
	public static WebElement registerMessage;
	
	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	
	/*Create Method*/
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("register.url"));
	}
	
	public void fillFirstName(String firstNameText) {
		firstName.sendKeys(firstNameText);
	}
	public void fillLastName(String lastNameText) {
		lastName.sendKeys(lastNameText);
	}
	public void fillPhone(String phoneText) {
		phone.sendKeys(phoneText);
	}
	public void fillEmail(String emailText) {
		email.sendKeys(emailText);
	}
	public void fillAddress(String addressText) {
		address.sendKeys(addressText);
	}
	public void fillCity(String cityText) {
		city.sendKeys(cityText);
	}
	public void fillState(String stateText) {
		state.sendKeys(stateText);
	}
	public void fillPostalCode(String postalCodeText) {
		postalCode.sendKeys(postalCodeText);
	}
	public void fillCountry(String country) {
		Select dropDownList = new Select(countryMenu);
		dropDownList.selectByVisibleText(country);
	}
	public void fillUserName(String userNameText) {
		userName.sendKeys(userNameText);
	}
	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);
	}
	public void fillConfirmPassword(String confirmPasswordText) {
		confirmPassword.sendKeys(confirmPasswordText);
	}
	public void clickOnButtonEnvoyer() {
		btnEnvoyer.click();
	}
}
