package com.company;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHelper {

    public static WebDriver drv;
    public static String master="//tr[1]/td[2]/input";
    public static String siteName="//tr[2]/td[2]/input";
    public static String buttonGenerate="//*[@value='Generate']";


    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        drv = new ChromeDriver();
    }
    public static void setup(String url){
        setup();
        get(url);
    }
    public static void get(String url){
        drv.get(url);
    }

 /*   public static void afterDriver(){
        drv.quit();
    }*/
    public static WebElement cyclicElementSearchByXpath(String target) {
     for (int i = 0; i < 250; i++)    {
         if (drv.findElements(By.xpath(target)).size() > 0) {
             break;
         }
         slp(1);
     }
     return drv.findElement(By.xpath(target));
 }
    public static void quit(){
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
