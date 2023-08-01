package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D03_Currencies {

    P03_HomePage HomePageObj = new P03_HomePage();

//    @Given("user go to Home page")
//    public void user_go_to_home_page()
//    {
//        System.out.println("The user is already on the homepage.");
//    }

    @When("user change the currency to Euro")
    public void user_change_the_currency_to_euro()
    {
        Select sel = new Select(HomePageObj.CurrencyListLoc());
        sel.selectByIndex(1);


    }

    @Then("Euro Symbol is shown on the four products displayed in Home page")
    public void euroSymbolIsShownOnTheProductsDisplayedInHomePage() throws InterruptedException
    {
        //Thread.sleep(4000);

        Hooks.driver.executeScript("arguments[0].scrollIntoView();",HomePageObj.ScrollToProductsLoc());

        Thread.sleep(2000);
        for (int i = 0; i < HomePageObj.PricesListLoc().size() ; i++)
        {

            String Result = HomePageObj.PricesListLoc().get(i).getText();
            boolean Actual_Result = Result.contains("€");
            Assert.assertTrue(Actual_Result);


//            System.out.println(Result);
//            System.out.println(Actual_Result);


        }

    }


}
