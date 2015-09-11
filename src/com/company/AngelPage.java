package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AngelPage {

    public static String url= "http://oxogamestudio.com/passwd.current6.htm";
        //"http://angel.net/~nic/passwd.current.html";

    public static void setMaster(String value) {
        TestHelper.drv.findElement(By.xpath("//tr[1]/td[2]/input")).sendKeys(value);
        //By.xpath("//*[@name='master']"
    }

    public static void setSitename(String value) {
        TestHelper.drv.findElement(By.xpath("//tr[2]/td[2]/input")).sendKeys(value);
        //By.xpath("//*[@name='site']"
    }

    public static void generate() {
        TestHelper.drv.findElement(By.xpath("//*[@value='Generate']")).click();
    }

    public static void sendEnter() {
        TestHelper.drv.findElement(By.xpath("//tr[2]/td[2]/input")).sendKeys(Keys.ENTER);
        //*[@name='site']
    }
    public static String getPassword() {
        return TestHelper.drv.findElement(By.xpath("//tr[4]/td[2]/input")).getAttribute("value");
        //input[@name='password']
    }
    public static String getMaster() {
        return TestHelper.drv.findElement(By.xpath("//tr[1]/td[2]/input")).getAttribute("value");
        //*[@name='master']
    }
    public static String getSiteName() {
        return TestHelper.drv.findElement(By.xpath("//tr[2]/td[2]/input")).getAttribute("value");
        //*[@name='site']
    }
    public static boolean getEnabledMaster() {
        return TestHelper.drv.findElement(By.xpath("//tr[1]/td[2]/input")).isEnabled();
        //*[@name='master']
        //return TestHelper.drv.findElement(By.xpath("//*[@name='master']")).getAttribute("disabled") == "disabled";
    }
    public static boolean getEnabledSiteName() {
        return TestHelper.drv.findElement(By.xpath("//tr[2]/td[2]/input")).isEnabled();
        //*[@name='site']
        //return TestHelper.drv.findElement(By.xpath("//*[@name='site']")).getAttribute("disabled") == "disabled";
    }
    public static boolean getEnabledPassword() {
        return TestHelper.drv.findElement(By.xpath("//tr[4]/td[2]/input")).isEnabled();
        //input[@name='password']
    }
    public static String nameFieldMaster() {
        return TestHelper.drv.findElement(By.xpath("//tr[1]/td[1]")).getText();
    }
    public static String nameFieldSite() {
        return TestHelper.drv.findElement(By.xpath("//tr[2]/td[1]")).getText();
    }
    public static String nameGeneratePwd() {
        return TestHelper.drv.findElement(By.xpath("//tr[4]/td[1]")).getText();
    }
  /*  public static WebElement findElement(String targetXPath) {
        if (drv.findElements(By.xpath(targetXPath)).size() > 0)
        {
            break;
        }
        TestHelper.slp(100);
    }
    return drv.findElement(By.xpath(targetXPath));
}
}*/
   /*
    http://bugscatcher.net/archives/1232
   driver.Url = "http://URL"; //or other actions with delays loading
    WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
    IWebElement myDynamicElement = wait.Until<IWebElement>((d) =>
            {
    return d.FindElement(By.Id("someDynamicElement"));
});*/
public void waitForVisible(String locator) {
        for (int second = 0;;  second++) {
        if (second >= 60) { throw new  AssertionError("timeout"); }
        try { if (selenium.isVisible(locator))  break; } catch (Exception e) {}
        try { Thread.sleep(1000); } catch  (InterruptedException e) { throw new AssertionError(e); }
        }
        }
}
