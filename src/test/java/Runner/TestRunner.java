package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",glue = "StepDefenitions",monochrome = true,
                  dryRun = false,
                  plugin = {"html:test-output/Webreport.html",
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner {

}
