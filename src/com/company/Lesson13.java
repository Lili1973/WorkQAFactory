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

public class Lesson13 {
    public WebDriver drv;
    @Before
    public void beforeDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        drv = new ChromeDriver();
        drv.get("http://angel.net/~nic/passwd.current.html");
    }

    @Test
    public void test1() {
        setMaster("masterpass", drv);
        setSitename("google.com", drv);
        generate(drv);
        System.out.println(getPassword(drv));
    }
    @Test
    public void test2() {
        setMaster("hello", drv);
        setSitename("google.com", drv);
        generate(drv);
        System.out.println(getPassword(drv));
    }
    @Test
    public void test3() {
        setMaster("qwe123", drv);
        setSitename("google.com", drv);
        sendEnter(drv);
        Assert.assertEquals("quSWcvR/lH8G8@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test4() {
        setMaster("qwe123", drv);
        setSitename("google.com", drv);
        generate(drv);
        Assert.assertEquals("quSWcvR/lH8G8@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    public void test5() {
        setMaster("", drv);
        setSitename("", drv);
        generate(drv);
        Assert.assertEquals("quSWcvR/lH8G8@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }

    public static void setMaster(String value, WebDriver driver) {
        driver.findElement(By.xpath("//*[@name='master']")).sendKeys(value);
    }
    public static void setSitename(String value, WebDriver driver) {
        driver.findElement(By.xpath("//*[@name='site']")).sendKeys(value);
    }
    public static void generate(WebDriver driver) {
        driver.findElement(By.xpath("//*[@value='Generate']")).click();
    }
    public static void sendEnter(WebDriver driver) {
        driver.findElement(By.xpath("//*[@name='site']")).sendKeys(Keys.ENTER);
    }
    public static String getPassword(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
    }

    @After
    public void afterDriver(){
        drv.quit();
    }

    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
