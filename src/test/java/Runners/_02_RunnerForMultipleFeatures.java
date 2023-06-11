package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature","src/test/java/FeatureFiles/_02_Country.feature"},
        glue = {"StepDefinitions"},
        dryRun = false   // DEFAULT VALUE IS FALSE -> it runs everything regularly
                        // TRUE -> ONLY CHECKS IF ALL STEPS ARE DEFINED IN STEP DEFINITIONS CLASS

)
public class _02_RunnerForMultipleFeatures extends AbstractTestNGCucumberTests {

}
