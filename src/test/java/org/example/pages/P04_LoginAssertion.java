package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_LoginAssertion
{

    // Locate MyAccount After Successful Login
    public WebElement MyAccountLoc()
    {
        return  Hooks.driver.findElement(By.className("ico-account"));
    }


}
