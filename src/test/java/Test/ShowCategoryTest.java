package Test;


import Pages.BaseTest;
import StepDefinitions.LoginPageStep;
import StepDefinitions.ShowCategoryStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ShowCategoryTest extends BaseTest {

    @Steps
    LoginPageStep loginPageStep;

    @Steps
    ShowCategoryStep showCategoryStep;

    @Before
    public void setup(){
        loginPageStep.isOnLoginPage();
        loginPageStep.goHome();
        loginPageStep.loginAsUser();
        loginPageStep.userShouldBeLogin();
    }
    @Test
    public void clickOnCategoryPageTest(){
        showCategoryStep.clickOnCategoryStep();
        //showCategoryStep.showCategoryList();
    }

}
