package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_Register {

    P03_HomePage HomePageObj = new P03_HomePage();
    P01_Register RegObj = new P01_Register();
    SoftAssert VerifyReg = new SoftAssert();



    @Given("User go to Registration Page")
        public void user_go_to_registration_page()
        {
            HomePageObj.regLink().click();
        }



        @When("user select gender type")
        public void user_select_gender_type()
        {
            RegObj.gendLoc("Male").click();
        }

        @And("user enter first name {string} and last name {string}")
        public void userEnterFirstNameAndLastName(String FirstName, String LastName)
        {
            RegObj.firstNameLoc().sendKeys(FirstName);
            RegObj.lastNameLoc().sendKeys(LastName);
        }

        @And("user enter date of birth")
        public void userEnterDateOfBirth()
        {
            Select selDay = new Select(RegObj.DayLoc());
            selDay.selectByIndex(20);

            Select selMonth = new Select(RegObj.MonthLoc());
            selMonth.selectByVisibleText("October");

            Select selYear = new Select(RegObj.YearLoc());
            selYear.selectByValue("2000");
        }

        @And("user enter email {string} field")
        public void userEnterEmailField(String Email)
        {
            RegObj.EmailLoc().sendKeys(Email);
        }


        @And("user fills Password fields {string} {string}")
        public void userFillsPasswordFields(String Pass, String ConfirmPass)
        {
            RegObj.PassLoc().sendKeys(Pass);
            RegObj.ConfirmPassLoc().sendKeys(ConfirmPass);
        }



        @And("Clicks on Register Button")
        public void clicks_on_register_button() throws InterruptedException
        {
            Thread.sleep(1000);
            RegObj.RegButtonLoc().click();
        }

        @Then("User registered Successfully")
        public void user_registered_successfully()
        {


            VerifyReg.assertEquals(RegObj.successMsgLoc().isDisplayed(),true);

            String ActualColor_PropertyName = RegObj.successMsgLoc().getCssValue("color");
            String ColorConvertedtoHexa = Color.fromString(ActualColor_PropertyName).asHex();
            VerifyReg.assertEquals(ColorConvertedtoHexa,Color.fromString("rgba(76, 177, 124, 1)").asHex());


            VerifyReg.assertAll();

        }


    @Then("user can't register with same email")
    public void userCanTRegisterWithSameData()
    {
        VerifyReg.assertEquals(RegObj.inValidRegMsgLoc().isDisplayed(),true);
        VerifyReg.assertEquals(RegObj.inValidRegMsgLoc().getText().contains("The specified email already exists"),true);
        System.out.println("Msg = "+ RegObj.inValidRegMsgLoc().getText());
        VerifyReg.assertAll();
    }

}
