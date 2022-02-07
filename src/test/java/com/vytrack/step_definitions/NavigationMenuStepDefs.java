package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {


    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {

        //seleniun code

        System.out.println("the user navigates to fleet, vehicles");



    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {

        System.out.println("Expected and actual titles are matching");

    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {

        System.out.println("user navigates to Marketing, Campaigns");

    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {

        System.out.println("Titles are matching");

    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {

        System.out.println("user navigates to Acitvities, CE");



    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {

        System.out.println("titles are matching");


    }

}
