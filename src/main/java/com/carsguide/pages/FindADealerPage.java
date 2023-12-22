package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindADealerPage extends Utility {
   private static final Logger log = LogManager.getLogger(FindADealerPage.class.getName());
    public FindADealerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findADealer;
    @CacheLookup@FindBy(tagName = "p")
    List<WebElement> DealerName;
    public String  gettextForCurrentUrl(){
        return driver.getCurrentUrl().toString();
    }
    public void ClickOnFindADealerTab(){
        clickOnElement(findADealer);
    }
    public void getTExtForDealerName(){
        for (WebElement Dealer : DealerName ) {
            getTextFromElement(Dealer);
        }
    }
}
