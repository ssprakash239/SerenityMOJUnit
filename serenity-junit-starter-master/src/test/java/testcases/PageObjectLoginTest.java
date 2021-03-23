package testcases;

import hrm.pages.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.TestsRequirement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class PageObjectLoginTest {

    @Managed
    WebDriver driver;

    @Steps
    HomePage home;

    @Test
    public void loginAsAdmin(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        home.verifyTitle();
        home.loginCredentials();
        home.verifyDashboard();
    }
}
