package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

    // Locate Email
     public  WebElement EmailLoc()
     {
         return Hooks.driver.findElement(By.id("Email"));
     }
    // Locate Pass
     public  WebElement PassLoc()
     {
         return Hooks.driver.findElement(By.id("Password"));
     }

    // Locate LoginButton
    public  WebElement LoginButtLoc()
    {
        return Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
    }


    // Locate Invalid Login Msg
    public WebElement InvalidLoginMsgLoc()
    {
      return  Hooks.driver.findElement(By.cssSelector("[class=\"message-error validation-summary-errors\"]"));
    }





}
