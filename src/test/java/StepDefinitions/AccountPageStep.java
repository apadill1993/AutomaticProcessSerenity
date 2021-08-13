package StepDefinitions;

import Pages.AccountPage;
import net.thucydides.core.annotations.Step;

public class AccountPageStep {

    private AccountPage accountPage;

    @Step
    public void verifyLogo(){
        accountPage.isLogo();
    }

    @Step
    public String searchArticle(String keyword, String articleName){
        return accountPage.search(keyword, articleName);
    }

    @Step
    public void addToChart(){
        accountPage.addToChart();
    }

}
