package teamOn.tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import teamOn.pages.AmazonPage;
import teamOn.utilities.ConfigurationReader;
import teamOn.utilities.Driver;
import teamOn.utilities.ReusableMethods;

public class AmazonTest {

    //  https://www.amazon.com.tr/ sitesi açılır.
    //  Ana sayfanın açıldığı kontrol edilir.
    //  Çerez tercihlerinden Çerezleri kabul et seçilir.
    //  Siteye login olunur.
    //  Login işlemi kontrol edilir.
    //  Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
    //  Bilgisayar kategorisi seçildiği kontrol edilir.
    //  Arama alanına MSI yazılır ve arama yapılır.
    //  Arama yapıldığı kontrol edilir.
    //  Arama sonuçları sayfasından 2. sayfa açılır.
    //  2. sayfanın açıldığı kontrol edilir.
    //  Sayfadaki 2. ürün favorilere eklenir.
    //   2. Ürünün favorilere eklendiği kontrol edilir.
    //  Hesabım > Favori Listem sayfasına gidilir.
    //  “Favori Listem” sayfası açıldığı kontrol edilir.
    //  Eklenen ürün favorilerden silinir.
    //  Silme işleminin gerçekleştiği kontrol edilir.
    //  Üye çıkış işlemi yapılır.
    //  Çıkış işleminin yapıldığı kontrol edilir.

    //  https://www.amazon.com.tr/ sitesi açılır.
    @Test
    public void Test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


        String homePageUrl = Driver.getDriver().getCurrentUrl();
        ReusableMethods.pageControl(" https://www.amazon.com.tr/", homePageUrl);

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.cookieAccept.click();

        ReusableMethods.moveToElement(amazonPage.login);

        amazonPage.login.click();

        ReusableMethods.sendKeysInfo(ConfigurationReader.getProperty("emailAdress"), amazonPage.emailBox) ;



    }


}





