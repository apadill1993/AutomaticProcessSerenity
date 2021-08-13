package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShowCategoryPage extends PageObject {

    public void clickOnCategory(){
        $(By.linkText("T-SHIRTS")).click();
    }

    public String showCategory(){
        return $("div#rte p").getText();
    }
}
