package StepDefinitions;

import Pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageStep {

    private LoginPage login;

    @Step
    public void goHome(){
        login.goToHome();
    }
    @Step
    public void isOnLoginPage(){
        login.open();
    }

    @Step
    public void loginAsUser(){
        login.Login();
    }

    @Step
    public void userShouldBeLogin(){
        //Assert.assertTrue(login.accountUserPage().equals("MY ACCOUNT"));
        Assert.assertEquals("MY ACCOUNT", login.accountUserPage());
    }

    @Step
    public void navigateToContactPage(){
        login.goToContactPage();
    }
}
