package teamOn.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ReusableMethods {

    public static void pageControl(String expectedUrl, String actualUrl) {
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public static void moveToElement(WebElement login){

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(login).perform();
    }


}
