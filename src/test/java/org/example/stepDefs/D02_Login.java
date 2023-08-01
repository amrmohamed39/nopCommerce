package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.example.pages.P02_Login;
import org.example.pages.P04_LoginAssertion;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_Login {

    P03_HomePage HomePageObj = new P03_HomePage();
    P02_Login LoginObj = new P02_Login();
    P04_LoginAssertion LoginAssertion = new P04_LoginAssertion();
    SoftAssert LoginAssert = new SoftAssert();


    @Given("user go to login page")
    public void user_go_to_login_page()
    {
        HomePageObj.loginLink().click();
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidData(String Email, String Pass)
    {
        LoginObj.EmailLoc().sendKeys(Email);
        LoginObj.PassLoc().sendKeys(Pass);

    }

    @And("user press on login button")
    public void userPressOnLoginButton()
    {
        LoginObj.LoginButtLoc().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully()
    {


        // Validate the Login Via Current URL As a String
        String ActRes =  "https://demo.nopcommerce.com/";
        LoginAssert.assertEquals(ActRes,Hooks.driver.getCurrentUrl());

        // Validate the Login Via Current URL As Boolean Value
        boolean ActualResult1 = Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/");
        LoginAssert.assertEquals(ActualResult1,true);

        boolean ActualRes_2 = LoginAssertion.MyAccountLoc().isDisplayed();
        LoginAssert.assertEquals(ActualRes_2,true,"MyAccount Assertion Is Failed");

        LoginAssert.assertAll();

    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInValidData(String Email, String Pass)
    {
        LoginObj.EmailLoc().sendKeys(Email);
        LoginObj.PassLoc().sendKeys(Pass);
    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem()
    {

        boolean ActualResult_2 = LoginObj.InvalidLoginMsgLoc().getText().contains("Login was unsuccessful");
        LoginAssert.assertEquals(ActualResult_2,true);

        String expectedColor = "#e4434b";
        LoginAssert.assertEquals(Color.fromString("rgba(228, 67, 75, 1)").asHex(),expectedColor);
        LoginAssert.assertAll();


    }


}
