package org.example.StepDefinition;

import org.example.Pages.Home_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_HomeSliders {
    Home_Page home;

    @When("user clicks on first slider")
    public void click_on_first_slider(){
        home = new Home_Page(Hooks.driver);
        Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).click();
        home.slider("1").click();
    }

    @Then("relative product for first slider is displayed")
    public void first_slide_displayed() throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","URL of First Slide");
    }

    @When("user clicks on second slider")
    public void click_on_second_slider() throws InterruptedException {
        home = new Home_Page(Hooks.driver);
//        Thread.sleep(2000);
        Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).click();
        home.slider("2").click();
    }

    @Then("relative product for second slider is displayed")
    public void second_slide_displayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6","URL of Second Slide");
    }
}
