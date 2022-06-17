package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
    WebDriver driver;

    public Search_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public int productsList(){
        int size = driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        return size;
    }

    public WebElement noProducts(){
        return driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
    }
}
