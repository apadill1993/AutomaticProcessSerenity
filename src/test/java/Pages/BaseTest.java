package Pages;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    @Managed(uniqueSession = true, driver = "chrome")
    WebDriver browser;
}
