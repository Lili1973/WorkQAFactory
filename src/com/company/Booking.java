package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class Booking {
    public static String url = "http://booking.uz.gov.ua/ru/";
    public static String train01 = "//tbody//a[contains(text(),'043 К')]";
    public static String train02 = "//tbody//a[contains(text(),'143 К')]";
    public static String wagon = "//*[@class='coaches']/a[1]";
    public static String sit = "//span[text()='27']/..";

    public static void setFrom(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='station_from']/input")).sendKeys(value);
        TestHelper.slp(3);
        TestHelper.drv.findElement(
                By.xpath("//*[@id='stations_from']/div[@title='" + value + "']")).click();
    }

    public static void setDestination(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='station_till']/input")).sendKeys(value);
        TestHelper.slp(3);
        TestHelper.drv.findElement(
                By.xpath("//*[@id='stations_till']/div[@title='" + value + "']")).click();
    }

    public static void dateDeparture(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).clear();
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).sendKeys(value);
        TestHelper.drv.findElement(By.xpath("//*[@id='date_dep']")).sendKeys(Keys.ENTER);
        TestHelper.slp(3);
    }

    public static void search() {
        TestHelper.drv.findElement(By.xpath("//button[@name='search']")).click();
        TestHelper.slp(3);
    }

    public static void selectTrain(String value) {
        TestHelper.drv.findElement(By.xpath("//*[@class='num']/a[text()='"+value+"']")).click();
        TestHelper.slp(5);
    }
    public static String getRouteWindowTitle () {
        return TestHelper.drv.findElement(By.xpath("//*[@class='vToolsPopupHeader']/span")).getText();
    }
    public static void closeRouteWindow() {
        TestHelper.drv.findElement(By.xpath("//button[text()='Ok']")).click();
        TestHelper.slp(5);
    }
    public static String checkNumberOfTrain01() {
        return TestHelper.cyclicElementSearchByXpath(train01).getText();
    }
    public static String checkNumberOfTrain02() {
        return TestHelper.cyclicElementSearchByXpath(train02).getText();
    }

    public static void selectButtonPlace() {
        TestHelper.drv.findElement(By.xpath("//*[@id='ts_res_tbl']/tbody/tr[2]/td[6]/div[2]/button")).click();
        TestHelper.slp(5);
    }

    public static boolean checkNumberWagon() {
        return TestHelper.cyclicElementSearchByXpath(wagon).isEnabled();
    }

    public static boolean checkNumberSit() {
        return TestHelper.cyclicElementSearchByXpath(sit).isEnabled();
    }
    //*[@id="ts_res_tbl"]/tbody/tr[2]/td[6]/div[2]/button


   // public static void selectVagon(String value) {
   //     TestHelper.drv.findElement(By.xpath("//*[@class='num']/a[text()='"+value+"']")).click();
   //     TestHelper.slp(5);
  //  }
}