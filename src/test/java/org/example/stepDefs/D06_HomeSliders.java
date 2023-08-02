package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class D06_HomeSliders
{

    P03_HomePage HomePageObj = new P03_HomePage();
    Actions actions = new Actions(Hooks.driver);

    SoftAssert soft = new SoftAssert();

    @When("user clicks on first slider")
    public void userClicksOnFirstSlider() throws InterruptedException {


        actions.moveToElement(HomePageObj.HomeSliders().get(0)).click().build().perform();
        Thread.sleep(3000);
    }

    @Then("direct user to first slider url {string}")
    public void directUserToThisUrl(String firstSliderUrl)
    {
        soft.assertEquals(Hooks.driver.getCurrentUrl(),firstSliderUrl,"firstSlider Assertion will fail");
        soft.assertAll();
    }

    @When("user clicks on second slider")
    public void userClicksOnSecondSlider() throws InterruptedException
    {
        Thread.sleep(4000);
        actions.moveToElement(HomePageObj.HomeSliders().get(1)).click().build().perform();
    }

    @Then("direct user to second slider url {string}")
    public void directUserToSecondSliderUrl(String secondSliderUrl) throws InterruptedException
    {
        //Expected condition will fail and driver will wait until condition appears but nothing happens
//        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofMillis(5000));
//        wait.until(ExpectedConditions.urlContains(secondSliderUrl));

        Thread.sleep(3000);
        soft.assertEquals(Hooks.driver.getCurrentUrl(),secondSliderUrl,"secondSlider Assertion will fail");
        soft.assertAll();
    }
}
