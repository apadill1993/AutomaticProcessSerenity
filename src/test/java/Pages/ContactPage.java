package Pages;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends PageObject{

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "id_order")
    WebElement order;

    @FindBy(id = "message")
    WebElement message;

    @FindBy(id = "submitMessage")
    WebElement button;

    By subj_heading = By.id("id_contact");
    By choose_File = By.id("fileUpload");
    By successMsg = By.cssSelector(".alert-success");

    public String fillContactForm(){
        email.sendKeys("mailtomail@mail.com");
        order.sendKeys("202101");
        message.sendKeys("I need your help, with my order ref");

        element(subj_heading).selectByVisibleText("Webmaster");
        upload("/Users/example/img.jpg").to(find(choose_File));
        button.click();

        return element(successMsg).getText();

    }
}
