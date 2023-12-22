package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(tagName = "ul")
    List<WebElement> menuList;
    @CacheLookup
    @FindBy(linkText = "buy + sell")
    WebElement buyselltab;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCarLink;
    @CacheLookup@FindBy(xpath = "//a[@href='//www.carsguide.com.au/buy-a-car/used-car-search']")
    WebElement usedCarLink;

    public void selectFromMenu(String Tab) {
        for (WebElement menu: menuList){
            if(menu.getText().contains(Tab)){
                clickOnElement(menu);
                break;
            }
        }
        }
        public void mouseHoverToBuySellTab(){
        mouseHoverToElement(buyselltab);
        }
        public void clickOnSearchCarLink(){
        clickOnElement(searchCarLink);
        }
        public void clickOnUsedCarLink(){
        clickOnElement(usedCarLink);
        }

}