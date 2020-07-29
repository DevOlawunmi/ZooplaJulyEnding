package co.uk.zoopla.pages;

import co.uk.zoopla.common.DriverLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        DriverLibrary.driver = driver;
    }
}
