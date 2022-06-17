package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
    WebDriver driver;

    public Register_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement Navigate_to_RegisterPage() {
        return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement maleGender()
    {
        return driver.findElement(By.id("gender-male"));
    }

    public WebElement firstName()
    {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName()
    {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay()
    {
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement birthMonth()
    {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthYear()
    {
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email()
    {
        return driver.findElement(By.id("Email"));
    }

    public WebElement companyName()
    {
        return driver.findElement(By.id("Company"));
    }

    public WebElement password()
    {
        return driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword()
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerB()
    {
        return driver.findElement(By.id("register-button"));
    }

    public WebElement successfulMsg()
    {
        return driver.findElement(By.xpath("//div[@class=\"result\"]"));
    }


}
