package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.ByteArrayInputStream;
import java.time.Duration;


public class Hooks {

    public static ChromeDriver driver;

    @Before
    public static void openBrowser()
    {

//        ChromeOptions opt = new ChromeOptions();
//        opt.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(opt);

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

    }


    @After
    public static void closeBrowser(Scenario scenario) throws InterruptedException
    {
        Thread.sleep(2000);

        if (scenario.isFailed())
        {
            Allure.addAttachment(scenario.getName(), "image/png", new ByteArrayInputStream(
                    ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)), "png");
        }
        driver.quit();
        }

    }




