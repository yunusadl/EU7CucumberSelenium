package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashBoardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {

        String url = ConfigurationReader.get("url");

        Driver.get().get(url);

    }


    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() throws InterruptedException {

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();

        loginPage.login(username,password);


    }


    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {

       String actualTitle = Driver.get().getTitle();

        Assert.assertEquals("Dashboard",actualTitle);

    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {

        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");

        LoginPage loginPage = new LoginPage();

        loginPage.login(username,password);


    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {

        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        LoginPage loginPage = new LoginPage();

        loginPage.login(username,password);





    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

        LoginPage loginPage = new LoginPage();

        loginPage.login(username,password);



    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {

        BrowserUtils.waitFor(2);

        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }

    @When("the user navigates to {string} {string}")

    public void the_user_navigates_to(String tab, String module) {

        BrowserUtils.waitFor(2);

        new DashBoardPage().navigateToModule(tab,module);



    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {



        ContactsPage contactsPage = new ContactsPage();


        contactsPage.waitUntilLoaderScreenDisappear();

        BrowserUtils.waitFor(10);


        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNumber,actualNumber);

    }







}
