package appium;

import java.net.MalformedURLException;
import java.net.URL;

import javax.management.DescriptorRead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestConnection {
	
	@Test
	public void SampleTest() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("fullReset", "false");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("platformVersion", "8.0.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		WebDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.get("https://www.wikipedia.org/");
	}

}
