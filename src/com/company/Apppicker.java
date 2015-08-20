package com.company;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apppicker {

    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//******************************************************//
        ChromeDriver drv = new ChromeDriver();
        drv.get("http://www.apppicker.com");
        slp(2);
        System.out.println(drv.getTitle());
/////////////////////////////
        WebElement j=drv.findElementByXPath("//div/a/i[@class='head-user-bar__icon fa fa-gear']");
        j.click();
        slp(3);
        WebElement j1=drv.findElementByXPath("(//div/div/ul)[2]/li[1]");
        j1.click();
        slp(5);
        WebElement a1=drv.findElementByXPath("//*[@id='User_email']");
        a1.sendKeys("apppicker_developer@ukr.net");
        WebElement a2=drv.findElementByXPath("//input[@id='User_password']");
        a2.sendKeys("apppicker_developer");
        a1.sendKeys(Keys.ENTER);
        //div/div/ul[@class='head-user-dropdown__list']
        //li[@class='head-user-dropdown__item'][1]
       // j.sendKeys(Keys.ENTER);
        slp(5);
        //li[@class='head-user-dropdown__item'][1]

        slp(3);
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
