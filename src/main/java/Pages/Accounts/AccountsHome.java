package Pages.Accounts;

import Framework.BrowserManager;
import Framework.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Miguel.Pari on 6/24/2015.
 */
public class AccountsHome {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@name='new' and @type='button']")
    @CacheLookup
    WebElement NewButtton;

    public AccountsHome(WebDriver driver) {
        this.driver = driver;
        wait = BrowserManager.getInstance().getWait();

        PageFactory.initElements(driver, this);
    }

    public NewAccountForm clickNewButton() {
        CommonActions.click(NewButtton);
        return new NewAccountForm(driver);
    }
}
