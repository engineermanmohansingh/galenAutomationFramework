package com.moni.sample.tests;

import static com.moni.automation.utils.YamlReader.getData;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.moni.automation.TestCreator;

/**
 *
 * @author Manmohan Singh
 */
public class Login_Layout_Test {

    TestCreator test;

    String[] browserSizes = {"720x360"};
    String[] layoutTags = {"mobile"};

    @BeforeClass
    @Parameters("browser")
    public void start_test_session(@Optional String browser) {
        test = new TestCreator("Login_Layout_Tests", browser);
    }

    @Test
    public void Test01_Launch_Application() {
        test.launchApplication();

    }

    @Test
    public void Test02_Login_To_Application() {
        test.loginPage.testPageLayout();
        test.loginPage.login_to_the_application_as("admin", "admin");

    }

    @AfterMethod
    public void take_screenshot_on_failure(ITestResult result) {
        test.takescreenshot.takeScreenShotOnException(result);
    }

    @AfterClass
    public void stop_test_session() {
        test.closeTestSession();
    }

}
