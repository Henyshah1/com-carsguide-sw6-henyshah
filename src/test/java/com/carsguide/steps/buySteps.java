package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarPage;
import com.carsguide.pages.UsedCarPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class buySteps {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage(){}

    @When("^I  hover mouse on buy/sale tab$")
    public void iHoverMouseOnBuySaleTab() {
        new HomePage().mouseHoverToBuySellTab();
    }

    @And("^I click on 'Search Cars' link$")
    public void iClickOnSearchCarsLink() {
        new HomePage().clickOnSearchCarLink();
    }

    @Then("^I navigate to 'new and used car search' page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        new  NewAndUsedCarPage().getTextForNewAndUsedCar();

    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) throws Throwable {
        new NewAndUsedCarPage().selectMakeName(make);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) throws Throwable {
        new NewAndUsedCarPage().selectModelNameFromDropDown(model);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select location \"<location>(\\d+)$")
    public void iSelectLocationLocation(String location) throws Throwable {
        new NewAndUsedCarPage().setLocationType(location);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) throws Throwable  {
        new NewAndUsedCarPage().selectPrice(price);
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarPage().clickOnFindMyNextCar();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make ) throws Throwable {
        new NewAndUsedCarPage().getTextForNewAndUsedCar();
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click 'Used' link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarLink();
    }

    @And("^I navigate to 'Used Cars For Sale' page$")
    public void iNavigateToUsedCarsForSalePage() {
        new UsedCarPage().textUsedCarForSale();
    }
    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String loation) throws Throwable {
        new UsedCarPage().selectUsedCarLocation(loation);
    }



}
