package ua.com.stickers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.sql.SQLOutput;
import java.util.Random;

public class FirstTest extends WebDriver {

    @Test
    public void firstTest (){
        driver.get("https://stickers.com.ua/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Stickers – Stickers"));

        WebElement Button = driver.findElement(By.id("nm-menu-account-btn"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nm-menu-account-btn")));
        driver.findElement(By.id("nm-menu-account-btn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nm-show-register-button")));

        driver.findElement(By.id("nm-show-register-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nm-register-wrap")));

        Random rnd = new Random();
        int n = rnd.nextInt(999)+1;
        String email = "Test" + n + "Example" + "@mail.com";
        String pass = "TestExample" + n;

        System.out.println(email);
        System.out.println(pass);

        driver.findElement(By.id("reg_email")).sendKeys(email);
        driver.findElement(By.id("reg_password")).sendKeys(pass);

        driver.findElement(By.name("register")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nm-username")));
    }
    @Test
    public void SecondTest (){
        driver.get("https://stickers.com.ua/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Stickers – Stickers"));

        WebElement Button = driver.findElement(By.id("nm-menu-account-btn"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nm-menu-account-btn")));
        driver.findElement(By.id("nm-menu-account-btn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nm-show-register-button")));

        driver.findElement(By.id("nm-show-register-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nm-register-wrap")));

        driver.findElement(By.name("register")).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"nm-shop-notice woocommerce-error\"]")));
        WebElement name1 = driver.findElement(By.cssSelector("[class=\"nm-shop-notice woocommerce-error\"]"));
        WebElement nameFirstParrent = name1.findElement(By.xpath(".."));

        String nameFE = nameFirstParrent.findElement(By.cssSelector("strong")).getText();
        Assert.assertEquals("Ошибка",nameFE);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nm-username")));
    }

}

