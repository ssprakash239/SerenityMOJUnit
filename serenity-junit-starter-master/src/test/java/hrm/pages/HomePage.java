package hrm.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {

    OrangeHRMHomePage home ;
    @Step("This step will verify the title")
    public void verifyTitle()
    {
        home.verifyTitle();
    }
    @Step("This step will allow us to login credentials")
    public void loginCredentials()
    {
        home.enterUserNamePassword();
    }
    @Step("This step will verify the dashboard title")
    public void verifyDashboard()
    {
        home.verifyLogin();
    }
}
