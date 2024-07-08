package AppiumStarted;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AppiumBasics extends BaseTest{


    @Test
    public void AppiumTest()  {



//        AppiumDriverLocalService service =new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\HP\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
//
//
//        service.start();


            androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
            androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
            androidDriver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
            androidDriver.findElement(AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id='android:id/title' and @text='WiFi settings']")).click();
          String alertTitle=  androidDriver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle,"WiFi settings");
            androidDriver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Asish");
            androidDriver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();



           // androidDriver.findElement(AppiumBy.xpath())
       // androidDriver.quit();
       // service.stop();


    }
}
