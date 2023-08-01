package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class D07_followUs
{
        P03_HomePage HomePageObj = new P03_HomePage();
        String ActualCurrentURL;


    @When("user opens facebook link")
        public void userOpensFacebookLink() throws InterruptedException
        {

         Thread.sleep(2000);

         HomePageObj.Facebook_Link_Loc().click();
         Thread.sleep(2000);
         ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
         Hooks.driver.switchTo().window(Tabs.get(1));

         // Print HomePage Url and Facebook Url
//         String Current_Url_Tab_0 = 	Hooks.driver.switchTo().window(Tabs.get(0)).getCurrentUrl();
//         String Current_Url_Tab_1 = 	Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
//         System.out.println(("The first URL = " + Current_Url_Tab_0 ));
//         System.out.println(("The second URL = " + Current_Url_Tab_1));

         ActualCurrentURL = Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
         Thread.sleep(2000);
         Hooks.driver.close();
         Hooks.driver.switchTo().window(Tabs.get(0));




            Thread.sleep(2000);


        }

        @Then("Facebook Link is opened in new tab")
        public void Link_isOpenedInNewTab()
        {
            Assert.assertEquals(ActualCurrentURL,"https://www.facebook.com/nopCommerce");

        }


        @When("user opens twitter link")
        public void user_opens_twitter_link() throws InterruptedException
        {

            Thread.sleep(2000);

            HomePageObj.Twitter_Link_Loc().click();
            Thread.sleep(2000);
            ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
            Hooks.driver.switchTo().window(Tabs.get(1));

            // Print HomePage Url and Twitter Url
//            String Current_Url_Tab_0 = 	Hooks.driver.switchTo().window(Tabs.get(0)).getCurrentUrl();
//            String Current_Url_Tab_1 = 	Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
//            System.out.println(("The first URL = " + Current_Url_Tab_0 ));
//            System.out.println(("The second URL = " + Current_Url_Tab_1));

            ActualCurrentURL = Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
            Thread.sleep(2000);
            Hooks.driver.close();
            Hooks.driver.switchTo().window(Tabs.get(0));


        }

        @Then("Twitter Link is opened in new tab")
        public void twitter_link_is_opened_in_new_tab()
        {
            Assert.assertEquals(ActualCurrentURL,"https://twitter.com/nopCommerce");

        }

        @When("user opens rss link")
        public void user_opens_rss_link() throws InterruptedException , AWTException
        {

            Actions actRightClick = new Actions(Hooks.driver);
            actRightClick.contextClick(HomePageObj.Rss_Link_Loc()).perform();


            //After Right Click select option from Context Menu
            Robot myrobot = new Robot();
            // Simulate Arrow-Down Press
            myrobot.keyPress(KeyEvent.VK_DOWN);
            myrobot.keyRelease(KeyEvent.VK_DOWN);

            Thread.sleep(3000);

            // Simulate Enter Press
            myrobot.keyPress(KeyEvent.VK_ENTER);
            myrobot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(3000);
            ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
            ActualCurrentURL = Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();

            Hooks.driver.switchTo().window(Tabs.get(1));

        }

        @Then("New-online-store-is-open is opened in new tab")
        public void new_online_store_is_open_is_opened_in_new_tab()
        {
            //This Assertion will Fail
            Assert.assertEquals(ActualCurrentURL,"https://demo.nopcommerce.com/new-online-store-is-open","Please Note that This Assertion will Fail");
        }

        @When("user opens youtube link")
        public void user_opens_youtube_link() throws InterruptedException
        {

            Thread.sleep(2000);
            HomePageObj.Youtube_Link_Loc().click();
            Thread.sleep(2000);
            ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
            Hooks.driver.switchTo().window(Tabs.get(1));


            // Print HomePage Url and YouTube Url
//            String Current_Url_Tab_0 = 	Hooks.driver.switchTo().window(Tabs.get(0)).getCurrentUrl();
//            String Current_Url_Tab_1 = 	Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
//            System.out.println(("The first URL = " + Current_Url_Tab_0 ));
//            System.out.println(("The second URL = " + Current_Url_Tab_1));


            ActualCurrentURL = Hooks.driver.switchTo().window(Tabs.get(1)).getCurrentUrl();
            Thread.sleep(2000);
            Hooks.driver.close();
            Hooks.driver.switchTo().window(Tabs.get(0));




       }

        @Then("youtube Link is opened in new tab")
        public void youtube_link_is_opened_in_new_tab()
        {
            Assert.assertEquals(ActualCurrentURL,"https://www.youtube.com/user/nopCommerce");
        }


}
