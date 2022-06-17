package org.example.StepDefinition;

import org.example.Pages.Home_Page;
import org.example.Pages.Search_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class D04_Search {
    Home_Page home;
    Search_Page search;

    @Given("user click on search bar")
    public void user_click_on_searchbar() {
        home = new Home_Page(Hooks.driver);
        search = new Search_Page(Hooks.driver);
        home.searchBar().click();
    }

    @When("user search for product like \"(.*)\"$")
    public void user_search_for_product(String search) {
        home.searchBar().sendKeys(search);
    }

    @And("user click on search Button")
    public void user_click_on_searchButton() {
        home.searchButton().click();
    }

    @Then("user could search successfully and go to search page")
    public void search_successfully() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=Nokia"), "search URL");
        // Second Assertion
        int size = search.productsList();
        soft.assertTrue(size > 0,"Search Result");
        // Assert All
        soft.assertAll();
    }

    @Then("user could search successfully with SKU")
    public void search_with_sku_successfully() {
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"), "URL after search");
        // Second Assertion
        int size = search.productsList();
        soft.assertTrue(size > 0,"Search Result");
        // Assert All
        soft.assertAll();
    }

    @Then("user could not search")
    public void no_products_found() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(search.noProducts().isDisplayed(), "No products");
    }
}
