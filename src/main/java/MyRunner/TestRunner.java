package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = "C:\\Users\\avkin\\Downloads\\confused.com\\src\\main\\java\\Features\\add.feature",
        glue={"StepDefinitions"}, //the path of the step definition files
        plugin= {"pretty",
                "html:test-outout",
                "json:json_output/cucumber.json",
                "junit:junit_xml/cucumber.xml"},
        monochrome = true, //display the console output in a proper readable format
        strict = true, //it will check if any step is not defined in step definition file
        dryRun = false //to check the mapping is proper between feature file and step def file
        //tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
