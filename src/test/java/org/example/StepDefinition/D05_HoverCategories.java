package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.Category_Page;
import org.example.Pages.Home_Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_HoverCategories {
    Home_Page home;
    Category_Page category;
    String subCategoryName;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {
        home = new Home_Page(Hooks.driver);
        category = new Category_Page(Hooks.driver);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(home.computers()).perform();
        action.moveToElement(home.computers()).perform();

        subCategoryName = home.desktops().getText().toLowerCase();

        Thread.sleep(1000);
    }

    @And("user click on subcategory")
    public void user_clicks_subcategory(){
        home.desktops().click();
    }

    @Then("user go to relative product page")
    public void relative_subcategory(){
        Assert.assertEquals(category.categoryList().getText().toLowerCase(),subCategoryName,"subcategory");
    }
}
