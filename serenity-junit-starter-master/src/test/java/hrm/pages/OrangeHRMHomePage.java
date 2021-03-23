package hrm.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OrangeHRMHomePage extends PageObject {

    public void verifyTitle()
    {
        String title = getDriver().getTitle();
        Assert.assertTrue(title.contains("OrangeHRM"));
    }

    public void enterUserNamePassword()
    {
        $(By.id("txtUsername")).type("Admin");
        $(By.id("txtPassword")).typeAndEnter("admin123");
    }

    public void verifyLogin()
    {
        String current_url = getDriver().getCurrentUrl();
        Assert.assertTrue(current_url.contains("dashboard"));
    }
}
