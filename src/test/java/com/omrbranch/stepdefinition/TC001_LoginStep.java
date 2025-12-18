package com.omrbranch.stepdefinition;

import org.junit.Assert;
import com.omrbranch.manager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC001_LoginStep {

private final PageObjectManager pom = new PageObjectManager();

@Given("User is on the OMR Branch hotel page")
public void userIsOnTheOMRBranchHotelPage() {

}
@When("User enters {string} and {string}")
public void userEnters(String userName, String password) {
pom.getLoginPage().login(userName, password);
}
@Then("User should verify success message after login {string}")
public void userShouldVerifySuccessMessageAfterLogin(String exploginSuccessMessage) {
String actLoginMsg = pom.getExploreHotelPage().loginMessageText();
Assert.assertEquals(exploginSuccessMessage, actLoginMsg);

}

@When("User enters {string} and {string} with enter key")
public void userEntersAndWithEnterKey(String userName, String password) {
}

@Then("User should verify error message after login {string}")
public void userShouldVerifyErrorMessageAfterLogin(String loginErrorMessage) {
}
}