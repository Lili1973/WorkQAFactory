package com.company;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHelper {

    public static WebDriver drv;

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
