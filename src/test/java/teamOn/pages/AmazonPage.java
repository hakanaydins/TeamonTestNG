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
    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement emailBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElement loginVerify;
    @FindBy(xpath = "//select[@name='url']")
    public WebElement select;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement productMSI;
    @FindBy(linkText = "2")
    public WebElement javaScriptExecuterTwoPage;

    @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement secondProduct;

    @FindBy(xpath = "//input[@id='add-to-wishlist-button-submit']")
    public WebElement favoriekle;

    @FindBy(xpath = "//span[text()='1 ürün şuraya eklendi:']")
    public WebElement wishList;

    @FindBy(linkText = "Listenizi Görüntüleyin")
    public WebElement listDisplayed;

    @FindBy(name = "submit.deleteItem")
    public WebElement deleteButon;

    @FindBy(xpath = "//div[text()='Silindi']")
    public WebElement silindi;

    @FindBy(xpath = "//span[text()='Çıkış Yap']")

    public WebElement exitbutton;

    @FindBy(xpath= "//h1[@class='a-spacing-small']")
    public WebElement girisButon;


}