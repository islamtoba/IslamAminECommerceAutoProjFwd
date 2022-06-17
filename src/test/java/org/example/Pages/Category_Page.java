package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Category_Page {
    WebDriver driver;

    public Category_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement categoryList(){
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
}
