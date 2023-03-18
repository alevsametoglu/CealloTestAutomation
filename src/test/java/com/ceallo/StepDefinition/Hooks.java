package com.ceallo.StepDefinition;

import com.ceallo.Pages.LoginPage;
import com.ceallo.Utilities.ConfigurationReader;
import com.ceallo.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("====setting up browser using cucumber @before");


    }

    //    @After
    public void teardownScenario(Scenario scenario) {

//        System.out.println("=======closing browser");

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

    }

    //    @BeforeStep
    public void setUpStep() {

    }

}
