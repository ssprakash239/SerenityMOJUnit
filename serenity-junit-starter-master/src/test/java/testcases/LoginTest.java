package testcases;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

    @Managed
    WebDriver driver;

    @Test
    public void myGoogleSearch(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElementFacade username = $(By.id("txtUsername"));
        username.shouldBeVisible();
        username.type("Admin");
        $(By.id("txtPassword")).typeAndEnter("admin123");

    }
}
