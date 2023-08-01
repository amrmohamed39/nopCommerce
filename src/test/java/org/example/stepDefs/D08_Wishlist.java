package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_Wishlist

{
    P03_HomePage HomePageObj = new P03_HomePage();
    SoftAssert soft = new SoftAssert();

    @When("user clicks on wishlist button on a product")
    public void userClicksOnWishlistButtonOnAProduct()
    {
        HomePageObj.WishListButsLoc().get(2).click();

    }

    @Then("get a msg That product added to the wishlist successfully")
    public void getAMsgThatProductAddedToTheWishlistSuccessfully()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(HomePageObj.successMsgLoc()));
        soft.assertEquals(HomePageObj.successMsgLoc().isDisplayed(),true);

        String ActualColor = HomePageObj.successMsgLoc().getCssValue("background-color");
        String BK_groundColor_Hexa = Color.fromString(ActualColor).asHex();

        soft.assertEquals(BK_groundColor_Hexa,"#4bb07a");
        soft.assertAll();


    }


    @And("user clicks on wishlist Tab")
    public void userClicksOnWishlistTab()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofMillis(6000));
        wait.until(ExpectedConditions.invisibilityOf(HomePageObj.successMsgLoc()));
        HomePageObj.WishListLink().click();
    }

    @Then("the product added to the wishlist and Quantity greater than zero")
    public void theProductAddedToTheWishlistAndQuantityGreaterThanZero()
    {
        String Quantity = HomePageObj.Quantity_Loc().getAttribute("value");
        int Quantity_Num = Integer.parseInt(Quantity);
        System.out.println("The Quantity is : " + Quantity_Num );
        soft.assertEquals((Quantity_Num>0),true);
        soft.assertAll();

    }


}
