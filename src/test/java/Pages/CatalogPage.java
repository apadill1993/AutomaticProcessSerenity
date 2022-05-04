package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CatalogPage extends PageObject {

    public void viewCatalogProducts(){
        $(By.linkText("Catalog")).click();
        $(By.linkText("Products")).click();
    }

    public String filterProductByName(String keyword, String productName){
        typeInto($("#input-name"),keyword);
        waitForTextToAppear(productName);
        clickOn($("//a[text()='"+productName+"']"));
        $("#button-filter").click();

        return find(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
    }


}
