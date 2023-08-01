package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
           features = "src\\main\\resources\\Features",
           glue =  {"org.example.stepDefs"},
           plugin = {"pretty","html:target/CucumberReport.html",
                        "json:target/CucumberJsonReport.json","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
           tags = "@smoked"
        )



public class Runner extends AbstractTestNGCucumberTests
{


}





