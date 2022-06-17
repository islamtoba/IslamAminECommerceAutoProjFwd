package org.example.StepDefinition;

import org.example.Pages.Home_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_ChangeCurrency {
    Home_Page home;

    @When("user select “Euro” from currency dropdown list")
    public void user_select_Euro() {
        home = new Home_Page(Hooks.driver);
        home.currency().click();
        home.currencyEuro().click();
    }

    @Then("All $ sign change to € sign")
    public void €_sign() {
        int count = Hooks.driver.findElements(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).size();
        for (int x = 0; x < count; x++){
            String text = home.productPrices().getText();
            Assert.assertTrue(text.contains("€"));
        }
    }
}
