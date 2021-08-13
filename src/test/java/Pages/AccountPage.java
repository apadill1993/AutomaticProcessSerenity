package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageObject {

    @FindBy(id = "add_to_cart")
    WebElement button;

    public void addToChart(){
        button.click();
    }

    public void isLogo(){
        shouldBeVisible(By.className("logo"));
    }

    public String search(String keyword, String articleName){
        typeInto($("#search_query_top"),keyword);
        waitForTextToAppear(articleName);
        clickOn($("//li[text()='"+articleName+"']"));

        return find(By.tagName("h1")).getText();
    }
}
