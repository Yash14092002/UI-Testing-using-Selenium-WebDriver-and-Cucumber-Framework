package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\NEW\\eclipse-workspace\\Selenium\\Features\\user.feature",glue="StepDifinitions")

public class UserTestRunner {

}
 