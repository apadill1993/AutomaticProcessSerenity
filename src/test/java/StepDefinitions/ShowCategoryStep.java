package StepDefinitions;

import Pages.ShowCategoryPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ShowCategoryStep {

    private ShowCategoryPage showCategoryPage;

    @Step
    public void clickOnCategoryStep(){
        showCategoryPage.clickOnCategory();
    }

    /*@Step
    public void showCategoryList(){
        Assert.assertEquals("T-shirts", showCategoryPage.showCategory());

    }*/
}
