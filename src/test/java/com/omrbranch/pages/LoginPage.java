package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.utility.BaseClass;

public class LoginPage extends BaseClass {
public LoginPage() {
PageFactory.initElements(driver,this);
}

@FindBy(id = "email")
private WebElement txtUsername;

@FindBy(id = "pass")
private WebElement txtPassword;

@FindBy(xpath = "//button[@value='login']")
private WebElement btnLogin;

@FindBy(xpath = "//b[@style='color: #dc3545;']")
private WebElement errMsg;

public WebElement getTxtUsername() {
return txtUsername;
}

public WebElement getTxtPassword() {
return txtPassword;
}

public WebElement getBtnLogin() {
return btnLogin;
}
// Login Without Enter Keys using Valid Credentials

public void login(String username, String password) {
elementSendKeys(txtUsername, username);
elementSendKeys(txtPassword, password);
elementClick(btnLogin);
}
// Login with Enter Keys using Invalid Credentials

public void loginWithEnter(String username, String password) throws AWTException {
elementSendKeysEnter(txtUsername, username);
elementSendKeysEnter(txtPassword, password);
enterKey();
}

// Login with Invalid Credentials and Get the Error Message Text

public String loginErrorMessage() {

String errTxt = errMsg.getText();
return errTxt;
}

}