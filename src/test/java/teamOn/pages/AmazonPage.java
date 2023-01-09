package teamOn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import teamOn.utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="sp-cc-accept")
    public WebElement cookieAccept;

    @FindBy(id="nav-link-accountList-nav-line-1")
    public WebElement login;








}
