package Test;


import Pages.BaseTest;
import StepDefinitions.AccountPageStep;
import StepDefinitions.LoginPageStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AccountTest extends BaseTest {

    @Steps
    LoginPageStep loginPageStep;

    @Steps
    AccountPageStep accountPageStep;

    @Before
    public void setup(){
        loginPageStep.isOnLoginPage();
        loginPageStep.goHome();
        loginPageStep.loginAsUser();
        loginPageStep.userShouldBeLogin();
    }

    @Test
    public void accLogo(){
        accountPageStep.verifyLogo();
    }

    @Test
    public void searchTest(){
        String result = accountPageStep.searchArticle("Dress", "Summer Dresses > Printed Summer ");
        Assert.assertEquals("Printed Summer Dress", result);

        //accountPageStep.addToChart();
    }
}
