package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apppicker {
    public WebDriver drv;

    @Before
    public void beforeDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        drv = new ChromeDriver();
        drv.get("http://www.apppicker.com");
    }

    @Test
    public void testTitle() {
        Assert.assertEquals("iPhone and iPad apps news and reviews", drv.getTitle());
        //System.out.println(drv.getTitle());
    }
    @Test
    public void testSignInDeveloper() {
        slp(2);
        startTest(drv);
        emailField("apppicker_developer@ukr.net", drv);
        passwordField("apppicker_developer", drv);

    }

   /* slp(5);
    WebElement a1 = drv.findElementByXPath("//*[@id='User_email']");
    a1.sendKeys("apppicker_developer@ukr.net");
    WebElement a2 = drv.findElementByXPath("//input[@id='User_password']");
    a2.sendKeys("apppicker_developer");
    a1.sendKeys(Keys.ENTER);
    //div/div/ul[@class='head-user-dropdown__list']
    //li[@class='head-user-dropdown__item'][1]
    // j.sendKeys(Keys.ENTER);
    slp(5);
    //li[@class='head-user-dropdown__item'][1]

    slp(3);

    }*/
   public static void startTest(WebDriver driver) {
       driver.findElement(By.xpath("//*[@class='head-user-bar__icon fa fa-gear']")).click();
       slp(4);
       driver.findElement(By.xpath("(//div/div/ul)[2]/li[1]")).click();
       slp(4);
   }
    public static void emailField(String value, WebDriver driver) {
        driver.findElement(By.xpath("//*[@name='master']")).sendKeys(value);
    }
    public static void passwordField(String value, WebDriver driver) {
        driver.findElement(By.xpath("//*[@name='site']")).sendKeys(value);
    }

    @After
    public void afterDriver(){
        drv.quit();
    }
    public static WebElement findElement(String targetXPath, WebDriver wdr) {
        for (int i = 0; i < 600; i++)
        {
            if (wdr.findElements(By.xpath(targetXPath)).size() > 0)
            {
                break;
            }
            slp(100);
        }
        return wdr.findElement(By.xpath(targetXPath));
    }
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
