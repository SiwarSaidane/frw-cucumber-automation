package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;
	

	public AuthenticationStepDefinition() {
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
