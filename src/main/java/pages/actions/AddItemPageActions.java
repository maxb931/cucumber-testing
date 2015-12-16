package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.AddItemPageLocators;
import pages.locators.HomePageLocators;
import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;


public class AddItemPageActions {

    private AddItemPageLocators locators;

    public AddItemPageActions() {
        this.locators = new AddItemPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }


    public void addItemName(String itemName) {
        locators.itemType.sendKeys(itemName);
    }

    public void addAmount(String itemAmount){
        locators.itemAmount.clear();
        locators.itemAmount.sendKeys(itemAmount);
    }

    public void addItem(){
        locators.itemAddButton.click();
    }


    }
