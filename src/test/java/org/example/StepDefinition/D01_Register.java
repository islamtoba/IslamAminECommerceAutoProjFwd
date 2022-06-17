package org.example.StepDefinition;

import org.example.Pages.Home_Page;
import org.example.Pages.Register_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_Register {
    Register_Page register;
    Home_Page home;

    @Given("user navigate to register page")
    public void user_navigate_to_register_page() {
        register = new Register_Page(Hooks.driver);
        home = new Home_Page(Hooks.driver);
        home.Navigate_to_RegisterPage().click();
    }

    @And("user choose male or female")
    public void user_choose_Gender_Option (){
        register.maleGender().click();
}

    @And("user enter valid data")
    public void user_enter_first_name(){
        register.firstName().sendKeys("Islam");

        register.lastName().sendKeys("Amin");

        Select select = new Select(register.birthDay());
        select.selectByIndex(30);

        select = new Select(register.birthMonth());
        select.selectByVisibleText("August");

        select = new Select(register.birthYear());
        select.selectByValue("1992");


        register.email().sendKeys("islamtoba@gmail.com");

        register.companyName().sendKeys("Expleo");

        register.password().sendKeys("Password123");
        register.confirmPassword().sendKeys("Password123");
    }

    @Then("user press on register button")
    public void user_register_successfully(){
        register.registerB().click();
    }

    @And("user could register successfully")
    public void register_successfully() {
        // 1st Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.successfulMsg().isDisplayed(), "Success Message");
        // 2nd Assertion
        String actual = register.successfulMsg().getCssValue("color");
        String expected = "rgba(76, 177, 124, 1)";
        soft.assertEquals(actual, expected, "color is correct");
        // Assert All
        soft.assertAll();
    }
}
