package com.intern.base;

import com.intern.util.TestUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase2 {

    public static Properties prop;
    public static AppiumDriver driver;
    private static String cwd = System.getProperty("user.dir");


    public TestBase2(){
        try{
            prop = new Properties();
            FileInputStream ip = new FileInputStream(cwd+"/src/main/java/com"
                    + "/intern/config/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() throws IOException, InterruptedException {
        String device = prop.getProperty("deviceName");
        String platform = prop.getProperty("platformName");
        String serverLoc = prop.getProperty("server");
        String portNumber = prop.getProperty("port");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", device);
        caps.setCapability("platformName", platform);
        caps.setCapability("app", cwd+"\\src\\app\\new-app-debug.apk");
        caps.setCapability("automationName","UiAutomator2");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }
}