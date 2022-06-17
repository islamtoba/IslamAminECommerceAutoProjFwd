package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Home_Page {
    WebDriver driver;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement Navigate_to_LoginPage() {
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public WebElement Navigate_to_RegisterPage() {
        return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement currency() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public WebElement currencyEuro() {
        return driver.findElement(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }

    public WebElement productPrices() {
        return driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement currencyDollar() {
        return driver.findElement(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F\"]"));
    }

    public WebElement searchBar(){
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public WebElement slider(String sliderNum){
        return driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }

    public WebElement facebook() {
        return driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitter() {
        return driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rss() {
        return driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }

    public WebElement youtube() {
        return driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

    public WebElement wishList() {
        return driver.findElement(By.cssSelector("div[class=\"header-links\"] [href=\"/wishlist\"]"));
    }

    public List<WebElement> addWishList() {
        return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishSuccessMsg() {
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement closeB() {
        return driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }

    public WebElement computers(){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/computers\"]"));
    }

    public WebElement desktops(){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/desktops\"]"));
    }
}
