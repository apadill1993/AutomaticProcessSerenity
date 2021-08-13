package StepDefinitions;

import Pages.ContactPage;
import net.thucydides.core.annotations.Step;

public class ContactPageStep {

    private ContactPage contactPage;

    @Step
    public String fillContactFormStep(){
        return contactPage.fillContactForm();

    }

}
