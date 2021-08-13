package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php")
public class LoginPage extends PageObject {

    public void goToHome(){
       $(By.linkText("Sign in")).click();
    }

    public void Login(){
        $("#email").sendKeys("anlupama@gmail.com");
        $("#passwd").sendKeys("Andy1234");
        $("#SubmitLogin").click();
    }

    public String accountUserPage(){
        return $("div#center_column h1").getText();
    }

    public void goToContactPage(){
        $(By.linkText("Contact us")).click();
    }
}
