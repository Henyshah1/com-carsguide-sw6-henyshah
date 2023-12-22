package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarPage.class.getName());
    public UsedCarPage() {
        PageFactory.initElements(driver, this);
    }@CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement usedCarMake;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement usedCarModel;
    @CacheLookup@FindBy(xpath = "//select[@id='locations']")
    WebElement usedCarLocation;
    @CacheLookup@FindBy(xpath = "//select[@id='priceTo']")
    WebElement usedCarPrice;
    @CacheLookup@FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement usedCarForSale;
    public void selectCarMake(String carMake){
        selectByVisibleTextFromDropDown(usedCarMake,carMake);
    }
    public void selectCarModel(String carModel){
        selectByVisibleTextFromDropDown(usedCarModel,carModel);
    }
    public void selectUsedCarLocation(String location){
        selectByValueFromDropDown(usedCarLocation,location);
    }
    public void selectUsedCarPrice(String price){
        selectByVisibleTextFromDropDown(usedCarPrice,price);
    }
public String textUsedCarForSale(){
        log.info("navigatedto Used Car page "+usedCarForSale.toString());
        return getTextFromElement(usedCarForSale);
}
}

