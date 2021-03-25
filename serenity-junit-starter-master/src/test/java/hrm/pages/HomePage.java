package hrm.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {

    OrangeHRMHomePage orange ;
    @Step("This step will verify the title")
    public void verifyTitle()
    {
        orange.verifyTitle();
    }
    @Step("This step will allow us to login credentials")
    public void loginCredentials()
    {
        orange.enterUserNamePassword();
    }
    @Step("This step will verify the dashboard title")
    public void verifyDashboard()
    {
        orange.verifyLogin();
    }
}
