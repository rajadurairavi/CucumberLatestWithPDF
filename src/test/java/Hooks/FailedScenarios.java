package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import CommonFunctions.BaseTest;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class FailedScenarios extends BaseTest {
	
	@AfterStep
	public void attachScreenshot(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
		byte[] screenshotTaken = 	((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			
		scenario.attach(screenshotTaken, "image/png", "errorscreen");
		}
		
		
	}

}
