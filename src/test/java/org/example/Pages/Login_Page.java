package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    WebDriver driver;

    public Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement emailE()
    {
        return driver.findElement(By.id("Email"));
    }

    public WebElement passwordE()
    {
        return driver.findElement(By.id("Password"));
    }

    public void LoginSteps(String email ,String password)
    {
        emailE().clear();
        passwordE().clear();

        emailE().sendKeys( email );
        passwordE().sendKeys( password );
    }

    public WebElement myAccount() {
       return driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

    public WebElement wrongMsg() {
        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
