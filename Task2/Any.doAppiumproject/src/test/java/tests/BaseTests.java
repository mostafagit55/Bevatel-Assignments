package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTests {

    AndroidDriver driver;

    @BeforeTest
            public void openappindevice() throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("appium:deviceName","PF8HLZTGPJZSSGKB");
            caps.setCapability("appium:app","E:\\Learning\\Assignments & interviews\\AAIB\\Bevatel\\Anydo APK\\Any.do.apk");
            caps.setCapability("platformName", "Android");
            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:appPackage", "com.anydo");
            caps.setCapability("appium:appActivity", "com.anydo.activity.SplashActivity");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }
    @AfterTest
    public void Teardown(){
        driver.quit();
    }
    }


