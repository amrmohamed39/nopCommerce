package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.example.pages.P03_HomePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D04_Search {

    P03_HomePage HomePageObject = new P03_HomePage();
    SoftAssert softAssertion = new SoftAssert();



    @When("user Search for a product with Name {string}")
    public void userSearchForAProductWithProductName(String productName)
    {
        HomePageObject.Search_Box_Loc().sendKeys(productName);
    }

    @And("user clicks on Search button")
    public void userClickOnSearchButton() throws InterruptedException
    {
        HomePageObject.Search_Button_Loc().click();
        Hooks.driver.executeScript("arguments[0].scrollIntoView();",HomePageObject.scroll_element());
        Thread.sleep(2000);

    }

    @Then("url contains {string} and search shows relevant results")
    public void urlContainsTargetedUrl_showRelevantResults(String theTargetedUrl) throws InterruptedException {

        boolean  Actual_Result_URL = Hooks.driver.getCurrentUrl().contains(theTargetedUrl);
        softAssertion.assertEquals(Actual_Result_URL,true);

        System.out.println("Url is : " + Hooks.driver.getCurrentUrl());


        int Num_of_Result = HomePageObject.Products_List_titles_Loc().size();
        int count = 0;


        for ( int i = 0; i < HomePageObject.Products_List_titles_Loc().size(); i++)
        {
             String Product_Names = HomePageObject.Products_List_titles_Loc().get(i).getText();
             count++;

            String Search_txt_Value = HomePageObject.SearchTxt_keyword_Loc().getAttribute("value").toLowerCase();

            boolean Actual_Result_Product_Name = Product_Names.toLowerCase().contains(Search_txt_Value);
            softAssertion.assertEquals(Actual_Result_Product_Name,true);

        }

        softAssertion.assertEquals(Num_of_Result,count);
        softAssertion.assertAll();

        // Print All Names of all products contains the input text inside the search bar
//            System.out.println("All Products Names =  ");
//        for ( int i = 0; i < HomePageObject.Product_titles_Loc().size(); i++)
//        {
//           String Product_Names = HomePageObject.Product_titles_Loc().get(i).getText().toLowerCase();
//           System.out.println(Product_Names);
//        }
    }

    @When("user Search for a product with SKU {string}")
    public void userSearchForAProductWithSKU(String SKU)
    {
        HomePageObject.Search_Box_Loc().sendKeys(SKU);

    }




    @Then("SKU in product page contains SKU used in search box")
    public void skuInPageContainsSkuUsedInSearchBox() throws InterruptedException
    {


        String Search_txt_Value_SKU = HomePageObject.SearchTxt_keyword_Loc().getAttribute("value");

        HomePageObject.Product_title_Loc().click();

        Assert.assertTrue(HomePageObject.SKU_Loc().getText().contains(Search_txt_Value_SKU));

        System.out.println("The search value : " + Search_txt_Value_SKU );
        System.out.println("The SKU appears in page  =  " + HomePageObject.SKU_Loc().getText());

    }


}



