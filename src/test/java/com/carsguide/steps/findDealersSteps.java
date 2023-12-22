package com.carsguide.steps;

import com.carsguide.pages.FindADealerPage;
import com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class findDealersSteps{
    @Given("^i am on HomePage$")
    public void iAmOnHomePage() {
    }
    @When("^I mouse hover on buy/sale Tab$")
    public void iMouseHoverOnBuySaleTab() {
        new HomePage().mouseHoverToBuySellTab();
    }

    @And("^I click on find a'Dealer'$")
    public void iClickOnFindADealer() {
        new FindADealerPage().ClickOnFindADealerTab();
    }

    @Then("^I navigate to 'car-dealers' page$")
    public void iNavigateToCarDealersPage() {
        new FindADealerPage().gettextForCurrentUrl();
        Assert.assertEquals("Both URL not equal", new FindADealerPage().gettextForCurrentUrl(),"Find a Car Dealership Near You");
    }


    @And("^I should see the dealer names \"([^\"]*)\"$")
    public void iShouldSeeTheDealerNames(String dealerName) throws Throwable {
        new FindADealerPage().getTExtForDealerName();

    }
}

