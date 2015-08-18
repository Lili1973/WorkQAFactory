package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.spec.KeySpec;
import java.util.List;

public class SeleniumTest1 {

      public static void main(String[] arg){
          System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
          ChromeDriver drv = new ChromeDriver();
            //get link
          drv.get("http://www.apppicker.com/apps/search");
                 //drv.get("http://google.com");
          slp(2);

          System.out.println(drv.getTitle());

            // create object and find field to enter string for search
          WebElement j=drv.findElementByName("//*[@id=\"wdd\"]text");
        //  WebElement j=drv.findElementByName("q");

          //text that we want to search
          j.sendKeys("angry birds");
          //j.sendKeys("котята");

          j.sendKeys(Keys.ENTER);
          drv.findElementByClassName("search-form__button_submit").click();
        //  drv.findElementByName("btnG").click();
         //drv.findElementByClassName("sbico").click();
       System.out.println(j.getAttribute("value"));

       slp(3);

          WebElement d=drv.findElementByClassName("srg");
       //WebElement d=drv.findElementByClassName("srg");
       List<WebElement> res=d.findElements(By.tagName("a"));
       WebElement res1=res.get(0);
       System.out.println(res1.getText());
       res1.click();
       slp(2);
       System.out.println(drv.getTitle());
       drv.navigate().back();
       slp(2);
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