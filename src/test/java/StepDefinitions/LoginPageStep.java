package StepDefinitions;

import Pages.LoginPage;
import net.thucydides.core.annotations.Step;


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

}
