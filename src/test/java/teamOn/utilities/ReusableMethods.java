package teamOn.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ReusableMethods {
    public static void pageControl(String expectedUrl, String actualUrl) {
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public static void moveToElement(WebElement login) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(login).perform();
    }

    public static void sendKeysInfo(String key, WebElement locator) {

        locator.sendKeys(key + Keys.ENTER);
    }

    public static void assertAssertTrue(String text, WebElement locator) {
        Assert.assertTrue(locator.getText().contains(text));

    }

    public static Select dropDown(WebElement locator) {
        Select select = new Select(locator);

        return select;
    }

    public static void javaScriptExecuter(WebElement locator) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", locator);


    }
}