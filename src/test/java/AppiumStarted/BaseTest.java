package AppiumStarted;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class BaseTest {

   public  AndroidDriver androidDriver;

   @BeforeClass
    public void configureDriver() throws URISyntaxException, MalformedURLException {
        UiAutomator2Options uiAutomator2Options=new UiAutomator2Options();
        //  DesiredCapabilities capabilities=new DesiredCapabilities().android();

        uiAutomator2Options.setDeviceName("Asish");
        uiAutomator2Options.setApp("E:\\AppiumLearning\\AppiumStarted\\src\\test\\java\\resources\\ApiDemos-debug.apk");

         androidDriver=new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),uiAutomator2Options);
         androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }
}
