package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());

    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);
    }
@CacheLookup@FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
WebElement TextForNewAndUsedCarSearch;
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makesName;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='models'])[1]")
    WebElement modelName;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement locationType;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement pricemax;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarTab;

    public String getTextForNewAndUsedCar(){
        log.info("navigatedto Used Car page "+TextForNewAndUsedCarSearch.toString());
        return getTextFromElement(TextForNewAndUsedCarSearch);

    }

    public void selectMakeName(String make) {
        selectByValueFromDropDown(makesName, make);
    }

    public void selectModelNameFromDropDown(String model) {
        selectByValueFromDropDown(modelName, model);
    }

    public void setLocationType(String location) {
        selectByValueFromDropDown(locationType, location);
    }

    public void selectPrice(String price) {
        selectByValueFromDropDown(pricemax, price);
    }

    public void clickOnFindMyNextCar() {
        clickOnElement(findMyNextCarTab);
    }
    public void getTextForcurrentUrl(){
        driver.getCurrentUrl();
    }
}
