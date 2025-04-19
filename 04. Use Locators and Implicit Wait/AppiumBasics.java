package Appium;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTest{

	@Test
	public void WifiSettingsName() throws MalformedURLException, URISyntaxException
	{
		// Locate using accessibilityId
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();	
		
		// Locate using Xpath
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		
		// Locate using ID
		driver.findElement(By.id("android:id/checkbox")).click();
	
		// Locate using Xpath
		driver.findElement(By.xpath("(//android.widget.RelativeLayout) [2]")).click();
	
		// Locate using ID
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		
		// Locate using ID
		driver.findElement(By.id("android:id/edit")).sendKeys("Abdallah");
	
		// Locate using ClassName
		// Recommended: use AppiumBy with ClassName
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
