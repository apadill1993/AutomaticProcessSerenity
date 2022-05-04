package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.opencart.com/admin/index.php?route=common/login")
public class LoginPage extends PageObject {

    public void goToHome(){
        By btnLogin = By.cssSelector(".btn-primary");
        element(btnLogin).click();
    }

    public void invalidAccess(){
        $("#input-username").sendKeys("anlupama");
        $("#input-password").sendKeys("Andy1234");
        By btnLogin = By.cssSelector(".btn-primary");
        element(btnLogin).click();
    }
}
