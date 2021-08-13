package Test;

import Pages.BaseTest;
import StepDefinitions.LoginPageStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {

    @Steps
    LoginPageStep loginPageStep;

    @Test
    public  void loginTest(){

        loginPageStep.isOnLoginPage();
        loginPageStep.goHome();
        loginPageStep.loginAsUser();
        loginPageStep.userShouldBeLogin();
    }

}
