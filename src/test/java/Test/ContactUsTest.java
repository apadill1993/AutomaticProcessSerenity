package Test;

import Pages.BaseTest;
import StepDefinitions.ContactPageStep;
import StepDefinitions.LoginPageStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)

public class ContactUsTest extends BaseTest {

    String success = "Your message has been successfully sent to our team.";

    @Steps
    LoginPageStep loginPageStep;

    @Steps
    ContactPageStep contactPageStep;

    @Before
    public void  setup(){
        loginPageStep.isOnLoginPage();
        loginPageStep.navigateToContactPage();
    }
    @Test
    public void fillContactPageTest(){
        String msg = contactPageStep.fillContactFormStep();
        System.out.println(msg);
        Assert.assertEquals(msg, success);
    }
}
