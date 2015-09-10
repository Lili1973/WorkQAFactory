package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AngelPage {

    public static String url= "http://oxogamestudio.com/passwd.current6.htm";
        //"http://angel.net/~nic/passwd.current.html";

    public static void setMaster(String value) {
        //TestHelper.drv.findElement(By.xpath("//*[@name='master']")).sendKeys(value);
        //6
        TestHelper.drv.findElement(By.xpath("//*[@type='password']")).sendKeys(value);
    }

    public static void setSitename(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@name='site']")).sendKeys(value);
    }

    public static void generate() {
        TestHelper.drv.findElement(By.xpath("//*[@value='Generate']")).click();
    }

    public static void sendEnter() {
        TestHelper.drv.findElement(By.xpath("//*[@name='site']")).sendKeys(Keys.ENTER);
    }

    public static String getPassword() {
        return TestHelper.drv.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
    }
    public static String getMaster() {
        return TestHelper.drv.findElement(By.xpath("//*[@name='master']")).getAttribute("value");
    }
    public static String getSiteName() {
        return TestHelper.drv.findElement(By.xpath("//*[@name='site']")).getAttribute("value");
    }
    public static boolean getEnabledMaster() {
        return TestHelper.drv.findElement(By.xpath("//*[@name='master']")).isEnabled();
        //return TestHelper.drv.findElement(By.xpath("//*[@name='master']")).getAttribute("disabled") == "disabled";
    }
    public static boolean getEnabledSiteName() {
        return TestHelper.drv.findElement(By.xpath("//*[@name='site']")).isEnabled();
        //return TestHelper.drv.findElement(By.xpath("//*[@name='site']")).getAttribute("disabled") == "disabled";
    }
    public static boolean getEnabledPassword() {
        return TestHelper.drv.findElement(By.xpath("//input[@name='password']")).isEnabled();
    }
}
