package AppiumStarted;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class LongPressGesture extends BaseTest{


    @Test
    public void longPressGestureDemo(){

        androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
      WebElement element= androidDriver.findElement(AppiumBy.xpath(
                "//android.widget.TextView[@text='People Names']"));
        ((JavascriptExecutor)  androidDriver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));

        

        
    }
}
