package Test;


import Pages.BaseTest;
import StepDefinitions.LoginPageStep;
import StepDefinitions.CatalogPageStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AccountTest extends BaseTest {

    @Steps
    LoginPageStep loginPageStep;

    @Steps
    CatalogPageStep catalog;

    //Iniciar sesión
    @Test
    public void doLogin(){
        loginPageStep.isOnLoginPage();
        loginPageStep.goHome();
    }

    //Ver catalogo de productos
    @Test
    public void viewCatalog(){
        loginPageStep.isOnLoginPage();
        loginPageStep.goHome();
        catalog.viewCatalog();
    }

    //Filtrar productos por nombre
    @Test
    public void searchProduct(){
        loginPageStep.isOnLoginPage();
        loginPageStep.goHome();
        catalog.viewCatalog();
        String result = catalog.searchProduct("can", "Canon EOS 5D");
        Assert.assertEquals("Canon EOS 5D", result);
    }
}
