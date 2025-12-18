package com.omrbranch.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.utility.BaseClass;

public class ExploreHotelPage extends BaseClass {

public ExploreHotelPage() {
PageFactory.initElements(driver,this);
}

@FindBy(xpath="//li[@class='dropdown']")
private WebElement loginMsg;

public WebElement getLoginMsg() {
return loginMsg;
}
//Login success message to be Displayed

public String loginMessageText() {
String msgTxt = loginMsg.getText();
return msgTxt;

}
}


	
	


