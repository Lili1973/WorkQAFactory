package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Rusya on 20.08.2015.
 */
public class XpathHWork2 {
    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

/*
1. Открьій сайт https://stage.tether.to
2. Заполнить в логин пустую строку, и в пароль пустую строку
3. Напечатать в консоль сообщение об ошибке от логина
4. Нажать TAB в поле пароля
5. Напечатать в консоль сообщение об ошибке от пароля
6. Заполнить пароль строкой "asd"
7. Напечатать в консоль сообщение об ошибке от пароля (должно бьіть другое)
8. Дописать в пароль еще "fff"
9. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 5 и 7. (findElements .... .size())
10. Заполнить в логин "a"
11. Напечатать в консоль сообщение об ошибке от логина
12. Дописать в логин "qwe"
13. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 3 и 11. (findElements .... .size())
14. Нажать Log In
 */
//******************************************************//
        ChromeDriver drv = new ChromeDriver();
        drv.get("https://stage.tether.to");
        slp(2);
        System.out.println(drv.getTitle());


//  2. Заполнить в логин пустую строку, и в пароль пустую строку
//  3. Напечатать в консоль сообщение об ошибке от логина
//  4. Нажать TAB в поле пароля
//  5. Напечатать в консоль сообщение об ошибке от пароля

        WebElement a1 = drv.findElementByXPath("//input[@name='username']");
       // "//*[@id='login']"
        a1.sendKeys("");
        a1.sendKeys(Keys.TAB);
        slp(8);

        WebElement a2 = drv.findElementByXPath("//input[@name='password']");
        //"//*[@id='password']"
        a2.sendKeys("");
        a2.sendKeys(Keys.TAB);
        slp(7);

        WebElement err1 = drv.findElementByXPath("//div[@ng-message]");
        //"//div[@ng-messages='loginForm.username.$error']/div[1]"
        System.out.println("3.Error: " + err1.getText());
        slp(7);
        //WebElement err2 = drv.findElementByXPath("//div[@ng-message]");
        System.out.println("5.Error: " + err1.getText());
        slp(7);

//6. Заполнить пароль строкой "asd"
//7. Напечатать в консоль сообщение об ошибке от пароля (должно бьіть другое)

        WebElement a3 = drv.findElementByXPath("//input[@name='password']");
        a3.sendKeys("asd");
        slp(8);
        WebElement err3 = drv.findElementByXPath("(//div[@ng-message])[2]");
        System.out.println("7.Error: " + err3.getText());
        slp(7);

//8. Дописать в пароль еще "fff"

        a3.sendKeys("fff");
        slp(7);
        System.out.println(a3.getAttribute("value"));

//9. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 5 и 7. (findElements .... .size())
        List<WebElement> d2=drv.findElementsByXPath("//div[@ng-message]");
        for (int i=0;i<d2.size();i++) {
            WebElement res1 = d2.get(i);
            System.out.println((i+1)+". "+res1.getText()+ " size " +d2.size());
        }
        System.out.println("9.Count of path: "+ d2.size());

// 10. Заполнить в логин "a"
// 11. Напечатать в консоль сообщение об ошибке от логина
// 12. Дописать в логин "qwe"
        WebElement a5 = drv.findElementByXPath("//input[@name='username']");
        a5.clear();
        a5.sendKeys("a");
        a5.sendKeys(Keys.TAB);
        slp(9);
        WebElement err4 = drv.findElementByXPath("//*[@ng-message='minlength'][1]");
        System.out.println("Error: " + err4.getText());
        slp(7);
        WebElement a6 = drv.findElementByXPath("//input[@name='username']");
        a5.sendKeys("qve");
        a5.sendKeys(Keys.TAB);
        slp(7);
        System.out.println(a5.getAttribute("value"));
        slp(7);
// 13. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 3 и 11. (findElements .... .size())

        List<WebElement> d3=drv.findElementsByXPath("//div[@ng-message]");
        for (int i=0;i<d3.size();i++) {
            WebElement res2 = d3.get(i);
            System.out.println((i+1)+". "+res2.getText()+ " size " +d3.size());
        }
        System.out.println("13.Count of path: "+ d3.size());
// 14. Нажать Log In
        slp(7);
        WebElement j2=drv.findElementByXPath("//button/span[@class='ng-binding ng-scope']");
        slp(7);
        j2.click();
        drv.quit();
    }

  /*  public static WebElement findElement(String targetXPath, WebDriver wdr) {
        for (int i = 0; i < 600; i++)
        {
            if (wdr.findElements(By.xpath(targetXPath)).size() > 0)
            {
                break;
            }
            slp(100);
        }
        return wdr.findElement(By.xpath(targetXPath));
    }*/
  public static void slp(long sec){
      try {
          Thread.sleep(sec*1000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }

  public static WebElement findElement(String targetXPath, WebDriver wdr) {
      for (int i = 0; i < 600; i++)    {
          if (wdr.findElements(By.xpath(targetXPath)).size() > 0)
          {
              break;
          }
          slp(100);
      }
      return wdr.findElement(By.xpath(targetXPath));
    }
}
//button/span[text()='Log in']

/*WebElement gmailLink = dvr.findElement
        (By.linkText("Gmail")).findElement(By.tagName("a"));
Assert.assertEquals("https://mail.google.com/", gmailLink.getAttribute("href"));*/

/* pwd.sendKeys("asd");
       slp(1);
       error = findElement(pPwdError,drv);
       System.out.println(error.getText());*/

/*System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        ChromeDriver dvr = new ChromeDriver();
        dvr.get("https://stage.tether.to");
        WebElement logn = dvr.findElement(By.xpath("//*[@id='login']"));
        WebElement passw = dvr.findElement(By.xpath("//*[@id='password']"));
        logn.sendKeys("");
        passw.sendKeys("");
        WebElement logerr = dvr.findElement(By.xpath("//div[@ng-messages='loginForm.username.$error']/div[1]"));
        System.out.println("Login message: " + logerr.getText());
        passw.sendKeys(Keys.TAB);
        WebElement passer = dvr.findElement(By.xpath("//div[@ng-messages='loginForm.password.$error']/div[1]"));
        System.out.println("Password message: " + passer.getText());
        passw.sendKeys("asd");
        System.out.println("Password message: " + passer.getText());
        passw.sendKeys("fff");
        System.out.println(dvr.findElements(By.xpath("//div[@ng-messages='loginForm.password.$error']/div[1]")).size());
        logn.sendKeys("a");
        System.out.println("Login message: " + logerr.getText());
        logn.sendKeys("qwe");
        System.out.println(dvr.findElements(By.xpath("//div[@ng-messages='loginForm.username.$error']/div[1]")).size());
        WebElement submit = dvr.findElement(By.xpath("//button[@class='submit-btn md-raised md-primary md-button md-default-theme']/span[1]"));
        submit.click();*/