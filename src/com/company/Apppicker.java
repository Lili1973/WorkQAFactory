package com.company;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apppicker {

    @Test
    public void testSigninDev() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//******************************************************//
        ChromeDriver drv = new ChromeDriver();
        drv.get("http://www.apppicker.com");
        slp(2);
        System.out.println(drv.getTitle());
/////////////////////////////
        WebElement j = drv.findElementByXPath("//*[@class='head-user-bar__icon fa fa-gear']");
        j.click();
        slp(3);
        WebElement j1 = drv.findElementByXPath("(//div/div/ul)[2]/li[1]");
        j1.click();
        /html/body/div[2]/div/div[2]/div/div/ul/li[1]/a
        slp(5);
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
        drv.quit();
    }

    @Test
    public void testTitle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver drv = new ChromeDriver();
        drv.get("http://www.apppicker.com");
        slp(2);
        Assert.assertEquals("iPhone and iPad apps news and reviews1", drv.getTitle());
        drv.quit();

    }
    public static ChromeDriver getSite(WebDriver wdr) {
        ChromeDriver drv = new ChromeDriver();
        drv.get("http://www.apppicker.com");
        return drv;
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
