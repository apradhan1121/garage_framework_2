package com.epam.gym.browsers;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class WinAppDriverSetup {
    private static WindowsDriver driver;

    public static WindowsDriver getDriver(String appPath){
        if(driver == null){
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("app", appPath);
            try{
                driver = new WindowsDriver(new URL("http://127.0.0.1:4723"),desiredCapabilities);
                return driver;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

}
