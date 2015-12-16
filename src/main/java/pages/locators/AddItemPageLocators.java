package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student04 on 16.12.15.
 */
public class AddItemPageLocators {


    @FindBy(how = How.XPATH, using = ".//*[@id='itemType']")
    public WebElement itemType;

    @FindBy(how = How.XPATH, using = ".//*[@id='amount']")
    public WebElement itemAmount;

    @FindBy(how = How.XPATH, using = "html/body/form/table/tbody/tr[3]/td/button")
    public WebElement itemAddButton;

}
