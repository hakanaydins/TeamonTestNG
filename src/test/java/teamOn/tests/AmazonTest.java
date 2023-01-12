package teamOn.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import teamOn.pages.AmazonPage;
import teamOn.utilities.ConfigReader;
import teamOn.utilities.Driver;
import teamOn.utilities.ReusableMethods;

public class AmazonTest {
    @Test
    public void Test() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        String homePageUrl = Driver.getDriver().getCurrentUrl();
        ReusableMethods.pageControl("https://www.amazon.com.tr/", homePageUrl);
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.cookieAccept.click();


        //  https://www.amazon.com.tr/ sitesi açılır.
        ReusableMethods.moveToElement(amazonPage.login);
        // Siteye login olunur.
        amazonPage.login.click();

        ReusableMethods.sendKeysInfo(ConfigReader.getProperty("emailAdres"), amazonPage.emailBox);

        ReusableMethods.sendKeysInfo(ConfigReader.getProperty("sifre"), amazonPage.passwordBox);
        // Login işlemi kontrol edilir.

        ReusableMethods.assertAssertTrue("gülsüm", amazonPage.loginVerify);

        // Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
        ReusableMethods.dropDown(amazonPage.select).selectByVisibleText("Bilgisayarlar");

        //Bilgisayar kategorisi seçildiği kontrol edilir.
        ReusableMethods.assertAssertTrue("Bilgisayarlar", ReusableMethods.dropDown(amazonPage.select).getFirstSelectedOption());
        //Arama alanına MSI yazılır ve arama yapılır.
        ReusableMethods.sendKeysInfo("MSI", amazonPage.searchBox);

        //Arama yapıldığı kontrol edilir.

        ReusableMethods.assertAssertTrue("MSI", amazonPage.productMSI);
        //Arama sonuçları sayfasından 2. sayfa açılır.

        ReusableMethods.javaScriptExecuter(amazonPage.javaScriptExecuterTwoPage);

        // 2. sayfanın açıldığı kontrol edilir.
        String homepageUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(homepageUrl.contains("page=2"));

        // Sayfadaki 2. ürün favorilere eklenir.
        amazonPage.secondProduct.click();
        amazonPage.favoriekle.click();

        //2. Ürünün favorilere eklendiği kontrol edilir.
        ReusableMethods.assertAssertTrue("1 ürün şuraya eklendi:", amazonPage.wishList);


        //Hesabım > Favori Listem sayfasına gidilir.
        amazonPage.listDisplayed.click();


        //“Favori Listem” sayfası açıldığı kontrol edilir.
        String homepageUrl1 = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(homepageUrl1.contains("wishlist"));


        //Eklenen ürün favorilerden silinir.
        amazonPage.deleteButon.click();

        //Silme işleminin gerçekleştiği kontrol edilir.
        Assert.assertTrue(amazonPage.silindi.isDisplayed());
        //Üye çıkış işlemi yapılır.
        ReusableMethods.moveToElement(amazonPage.login);
        amazonPage.exitbutton.click();

        //Çıkış işleminin yapıldığı kontrol edilir.
        Assert.assertTrue(amazonPage.girisButon.isDisplayed());


    }
}