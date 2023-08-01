package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {




    // Locate The Gender
   public WebElement gendLoc(String GenderType)
   {
       WebElement gender =null;

       if(GenderType.equals("Male")){
           gender=Hooks.driver.findElement(By.id("gender-male"));
       }
       else if(GenderType.equals("Female")){
           gender=Hooks.driver.findElement(By.id("gender-female"));
       }
       return gender;
   }


    // Locate the First Name
    public WebElement firstNameLoc()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    // Locate the Last Name
    public WebElement lastNameLoc()
    {
      return  Hooks.driver.findElement(By.id("LastName"));
    }

    // Locate the DOB_Day
    public WebElement DayLoc()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }

    // Locate the DOB_Month
    public WebElement MonthLoc()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    // Locate the DOB_Year
    public WebElement YearLoc()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }


    // Locate the Email
    public WebElement EmailLoc()
    {
        return  Hooks.driver.findElement(By.cssSelector("[id=\"Email\"]"));
    }

    // Locate the Password
    public WebElement PassLoc()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    // Locate confirm Password
    public WebElement ConfirmPassLoc()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    // Locate RegisterButton
    public WebElement RegButtonLoc()
    {

        return  Hooks.driver.findElement(By.id("register-button"));
    }

    // Locate Success Msg
    public WebElement successMsgLoc()
    {
        return Hooks.driver.findElement(By.className("result"));
    }

    // Locate Invalid Registration Msg
    public WebElement inValidRegMsgLoc()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"message-error validation-summary-errors\"]"));
    }




}
