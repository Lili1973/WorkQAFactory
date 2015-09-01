package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestHW2 {
    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

    }

    @Test
    public void test1() {
        ChromeDriver drv = new ChromeDriver();
        drv.get("https://stage.tether.to");
        WebElement a1 = drv.findElementByXPath("//input[@name='username']");
        // "//*[@id='login']"
        a1.sendKeys("");
        a1.sendKeys(Keys.TAB);
        slp(8);
        WebElement err1 = drv.findElementByXPath("//div[@ng-message]");
        //"//div[@ng-messages='loginForm.username.$error']/div[1]"
        String text1=err1.getText();
        System.out.println("3.Error: " + text1);
        slp(7);


        Assert.assertEquals("This field is required",err1);
    }

    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
