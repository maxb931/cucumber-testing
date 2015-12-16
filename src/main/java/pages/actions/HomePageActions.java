package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;


public class HomePageActions {

    private HomePageLocators locators;

    public HomePageActions() {
        locators = new HomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }

    public void openHomePage() {
        SeleniumDriver.openPage("localhost:8282");
    }

    public void goToLoginPage() {
        locators.loginLink.click();
    }

    public void goToAddItemPage() {
        locators.newItemsLink.click();
    }

    public boolean isLogoutButton() {
        return SeleniumHelper.isElementPresent(locators.logoutButton);
    }

    public void logoutFromSystem(){
        locators.logoutButton.click();
    }

    public boolean isUserNotLogged() {
        return SeleniumHelper.isElementPresent(locators.loginLink);


    }
}
