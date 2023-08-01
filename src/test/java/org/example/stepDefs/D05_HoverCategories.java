package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;


public class D05_HoverCategories {
    P03_HomePage HomePageObj = new P03_HomePage();
    SoftAssert softAssert = new SoftAssert();



    @When("user select computer category and select sub category from Desktops ,Notebooks and Software")
    public void userSelectAnyComputerCategoryAndContainsSubCategoriesDesktopsNotebooksAndSoftware() throws InterruptedException
    {
        Actions act = new Actions(Hooks.driver);
        act.moveToElement(HomePageObj.mainCategoryCompsLoc()).perform();
        String DesktopsSubCategoryTitle = HomePageObj.DesktopsSubCategoryLoc().getText().toLowerCase();
        Thread.sleep(1000);
        HomePageObj.DesktopsSubCategoryLoc().click();

        Hooks.driver.executeScript("arguments[0].scrollIntoView(0,0);",HomePageObj.manufacturersTitleLoc());

        Thread.sleep(1000);

        String PageTitle = HomePageObj.PageTitleLoc().getText().toLowerCase();
        softAssert.assertEquals(DesktopsSubCategoryTitle,PageTitle);

        System.out.println("The Selected sub Category  is : " + DesktopsSubCategoryTitle );
        System.out.println("Page Title for selected Sub Category is : " + PageTitle);


    }

    @And("user select Main Category Gift Cards without subList")
    public  void userSelectMainCategoryGiftCardsWithoutSubList() throws InterruptedException
    {

        String mainCategoryGiftTitle = HomePageObj.mainCategoryGiftCardsLoc().getText().toLowerCase();
        Thread.sleep(1000);
        HomePageObj.mainCategoryGiftCardsLoc().click();
        Hooks.driver.executeScript("arguments[0].scrollIntoView(0,0);",HomePageObj.manufacturersTitleLoc());
        String PageTitle = HomePageObj.PageTitleLoc().getText().toLowerCase();

        softAssert.assertEquals(mainCategoryGiftTitle,PageTitle);
        softAssert.assertAll();

        System.out.println("The Selected Main Category  is : : " + mainCategoryGiftTitle );
        System.out.println("Page Title for Selected Main Category is : " + PageTitle);

    }


    @Then("category page title is \\(equal or contains) the one user get it while selecting category")
    public void categoryPageTitleIsEqualOrContainsTheOneUserGetItWhileSelectingCategory()
    {
       System.out.println("category page title is equals to the one user get it while selecting random category");
    }


}

