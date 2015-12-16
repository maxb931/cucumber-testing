package pages.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

    @FindBy(how = How.LINK_TEXT, using = "Home")
    public WebElement homeLink;

    @FindBy(how = How.LINK_TEXT, using = "Users")
    public WebElement usersLink;

    @FindBy(how = How.LINK_TEXT, using = "Items")
    public WebElement itemsLink;

    @FindBy(how = How.XPATH, using = "html/body/nav/ul/li[5]/a")
    public WebElement newItemsLink;

    @FindBy(how = How.XPATH, using = "//a[@href='/login']")
    public WebElement loginLink;

    @FindBy(how = How.XPATH, using = "//a[@href='/register']")
    public WebElement registerLink;

    @FindBy(how = How.XPATH, using = "//input[@value='Log Out']")
    public WebElement logoutButton;
}
