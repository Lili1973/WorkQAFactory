package com.company;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.spec.KeySpec;
public class SeleniumTest1 {

    public static void main(String[] arg) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

        ChromeDriver d = new ChromeDriver();
        d.get("http://google.com");
        slp(2);
        Thread.sleep(5000);
        System.out.println(d.getTitle());
        WebElement j=d.findElementByName("q");
        j.sendKeys("котята");
        j.sendKeys(Keys.ENTER);
        slp(2);
        d.findElementByName("btnG").click();
        slp(2);
        d.quit();
    }
    public static void slp(long sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}