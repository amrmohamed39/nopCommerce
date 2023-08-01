package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_HomePage {



    //RegLink Locator
    public WebElement regLink() {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    //LoginLink Locator
    public WebElement loginLink() {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    //CurrencyList Locator
    public WebElement CurrencyListLoc() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    //PricesList Locator
    public List<WebElement> PricesListLoc() {
        return Hooks.driver.findElements(By.cssSelector("[class=\"price actual-price\"]"));
    }

    //Products title Locator
    public WebElement ScrollToProductsLoc()
    {
        return Hooks.driver.findElement(By.cssSelector("div.product-grid div.title"));
    }

    //Search box Locator
    public WebElement Search_Box_Loc() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    //Search box button Locator
    public WebElement Search_Button_Loc() {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }


    //Search text word Locator
    public WebElement SearchTxt_keyword_Loc() {
        return Hooks.driver.findElement(By.cssSelector("div.inputs input.search-text"));
    }

    //Products titles list Locator
    public List<WebElement> Products_List_titles_Loc() {
        return Hooks.driver.findElements(By.className("product-title"));
    }

    //Product title Locator
    public WebElement Product_title_Loc() {
        return Hooks.driver.findElement(By.cssSelector("div.details a"));
    }


    //SKU Locator
    public WebElement SKU_Loc() {
        return Hooks.driver.findElement(By.cssSelector("div.sku span.value"));
    }


    // Main Category (Computers) locator
    public WebElement mainCategoryCompsLoc()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
    }

    // Sub Category (Desktops) from Main Category (Computers) locator
    public WebElement DesktopsSubCategoryLoc()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] ul[class=\"sublist first-level\"] a[href=\"/desktops\"]"));
    }

    // Main Category (GiftCards) locator
    public WebElement mainCategoryGiftCardsLoc()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/gift-cards\"]"));
    }

    // Manufacturers title Locator
    public WebElement manufacturersTitleLoc()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"block block-manufacturer-navigation\"]"));
    }


    // Page title link Locator
    public WebElement PageTitleLoc()
    {
        return Hooks.driver.findElement(By.className("page-title"));
    }


    // FaceBook link Locator
    public WebElement Facebook_Link_Loc() {
        return Hooks.driver.findElement(By.className("facebook"));
    }

    //Twitter link Locator
    public WebElement Twitter_Link_Loc() {
        return Hooks.driver.findElement(By.className("twitter"));
    }

    //Rss link Locator
    public WebElement Rss_Link_Loc() {
        return Hooks.driver.findElement(By.className("rss"));
    }

    //YouTube link Locator
    public WebElement Youtube_Link_Loc() {
        return Hooks.driver.findElement(By.className("youtube"));
    }


    //SuccessMsg for adding product to wish list Locator
    public List<WebElement> WishListButsLoc()
    {
        return Hooks.driver.findElements(By.cssSelector("[title=\"Add to wishlist\"]"));
    }

    //SuccessMsg for adding product to wish list Locator
    public WebElement successMsgLoc()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"bar-notification success\"]"));
    }


    //Wish list link Locator
    public WebElement WishListLink()
    {
        return Hooks.driver.findElement(By.className("ico-wishlist"));
    }

    //Quantity value Locator
    public WebElement Quantity_Loc() {
        return Hooks.driver.findElement(By.className("qty-input"));
    }

    public WebElement scroll_element() {
        return Hooks.driver.findElement(By.className("product-sorting"));
    }

    //HomePage sliders Locator
    public List<WebElement> HomeSliders()
    {
        return Hooks.driver.findElements(By.className("nivo-imageLink"));
    }





}