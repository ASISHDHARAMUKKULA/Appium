package AppiumStarted;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeGesture extends BaseTest {

    @Test
    public void swipeGestureDemo(){

        androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        WebElement element=androidDriver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]"));
        Assert.assertEquals(element.getAttribute("focusable"),"true");

        ((JavascriptExecutor) androidDriver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)element).getId(),
                "direction", "left",
                "percent", 0.75
        ));

        Assert.assertEquals(element.getAttribute("focusable"),"false");

    }
}
