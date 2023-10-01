package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

	@Given("Je me connecte a la page Register")
	public void jeMeConnecteALaPageRegister() {
	   
	}
	@When("Je saisis le First Name {string}")
	public void jeSaisisLeFirstName(String string) {
	    
	}
	@When("Je saisis le Last Name {string}")
	public void jeSaisisLeLastName(String string) {
	    
	}
	@When("Je saisis le Phone {string}")
	public void jeSaisisLePhone(String string) {
	    
	}
	@When("Je saisis le Email {string}")
	public void jeSaisisLeEmail(String string) {
	    
	}
	@When("Je saisis l Adress {string}")
	public void jeSaisisLAdress(String string) {
	    
	}
	@When("Je saisis City {string}")
	public void jeSaisisCity(String string) {
	    
	}
	@When("Je saisis State {string}")
	public void jeSaisisState(String string) {
	    
	}
	@When("Je saisis Postal Code {string}")
	public void jeSaisisPostalCode(String string) {
	    
	}
	@When("Je saisis Country {string}")
	public void jeSaisisCountry(String string) {
	    
	}
	@When("Je saisis User Name {string}")
	public void jeSaisisUserName(String string) {
	    
	}
	@When("Je saisis Password {string}")
	public void jeSaisisPassword(String string) {
	    
	}
	@When("Je saisis Confirm Password {string}")
	public void jeSaisisConfirmPassword(String string) {
	    
	}
	@When("Je clique sur le boutton Envoyer")
	public void jeCliqueSurLeBouttonEnvoyer() {
	   
	}
	@Then("Je suis enregistre dans l application")
	public void jeSuisEnregistreDansLApplication() {
	    
	}


	//////
	
	
	
	private AuthenticationPage authenticationPage;
	

	public RegisterStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}
	
	@Given("Je me connecte a l application Mercury")
	public void jeMeConnecteALApplicationMercury() {
		authenticationPage.goToUrl();   
	}
	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String name) {
		authenticationPage.fillUserName(name);
	}
	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
	    authenticationPage.fillPassword(password);
	}
	@When("Je clique sur le boutton submit")
	public void jeCliqueSurLeBouttonSubmit() {
		authenticationPage.clickOnButtonSubmit();	    
	}
	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthenticationPage.welcomeMessage.getText();
		Assert.assertEquals(text, message);
	}

}
