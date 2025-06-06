package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics {

	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException
	{
	    
			
		// Start Appium Server
		AppiumDriverLocalService service = new AppiumServiceBuilder()
			.withAppiumJS(new File("C:\\Users\\Abdallah\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
			.withIPAddress("127.0.0.1")
			.usingPort(4723)
			.build();	
		
		service.start();
		
		
		// AndroidDriver, IOSDriver
		// Appium Code -> Appium Server -> Mobile 
		UiAutomator2Options options = new UiAutomator2Options();
		options.setAutomationName("UiAutomator2");
		options.setDeviceName("emulator-5554");
		options.setApp("D:\\Testing Career\\Learn Selenium with Java, Cucumber & Frameworks\\Practicing Testing Automation\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
		// Actual Automation
		// Locators: Xpath, id, accessibilityId, classname, androidUIAutomator
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();		
		
		
		
		driver.quit();
		
		// Stop Appium Server
		service.stop();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
