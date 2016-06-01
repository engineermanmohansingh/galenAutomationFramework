package com.moni.sample.keywords;

import com.moni.automation.getpageobjects.GetPage;

import static com.moni.automation.utils.YamlReader.getData;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 *
 * @author prashantshukla
 */
public class LoginPageActions extends GetPage {

	public LoginPageActions(WebDriver driver) {
		super(driver, "LoginPage");
	}

	public void verify_User_Is_On_Login_Page() {
		verifyPageTitleContains();
	}

	public void login_to_the_application_as(String user) {
		String _username = getData("users." + user + ".username");
		String _password = getData("users." + user + ".password");
		logMessage("[INFO]: log into application as '" + user + "'");
		login_to_the_application_as(_username, _password);
	}

	public void login_to_the_application_as(String username, String password) {
		element("inp_username").clear();
		element("inp_username").sendKeys(username);
		element("inp_password").clear();
		element("inp_password").sendKeys(password);
		element("btn_signin").click();
		logMessage("[INFO]: log into the application using credentials '" + username + " / " + password + "'");
	}

	

    public void open_login_form() {
        
    }
}
