package StepDefinitions;

import Pages.CatalogPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
public class CatalogPageStep {
    private CatalogPage catalog;

    @Step
    public void viewCatalog(){
        catalog.viewCatalogProducts();
    }

    @Step
    public String searchProduct(String keyword, String articleName){
        return catalog.filterProductByName(keyword, articleName);
    }

}
