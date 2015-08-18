package com.company;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathHWork {
    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

//**********************************//
        /*1. Открьіть сайт https://stage.tether.to
        2. Напечатать в консоль заголовок сайта.
        3. Нажать на ссьілку Request access.
        4. Напечатать в консоль заголовок единственного поля для ввода на открьівшейся странице.
        5. Нажать на ссьілку Already have an invite code?
        6. Напечатать в консоль заголовки всех полей кроме вьібора страньі.
        7. Заполнить первьіе 3 поля.
        8. Напечатать в консоль ошибку которая появилась возле первого поля.*/
//******************************************************//
        ChromeDriver drv = new ChromeDriver();
        drv.get("https://stage.tether.to");
        slp(2);
        System.out.println(drv.getTitle());

//3 4-----------

        WebElement j=drv.findElementByXPath("//div/a[text()='Request access']");
        j.click();
        WebElement j1=drv.findElementByXPath("//label");
        System.out.println(j1.getText());

//5 Нажать на ссьілку Already have an invite code? --------------

        WebElement j2=drv.findElementByXPath("//div/a[text()='Already have an invite code?']");
        j2.click();

//6 Напечатать в консоль заголовки всех полей кроме вьібора страньі.-------------

        List<WebElement> d=drv.findElementsByXPath("//md-input-container/label");
        for (int i=0;i<d.size();i++) {
            WebElement res1 = d.get(i);
            System.out.println((i+1)+". "+res1.getText());
        }

//7 Заполнить первьіе 3 поля.

        WebElement a1=drv.findElementByXPath("//input[@name='inviteCode']");
        a1.sendKeys("fgh");
        WebElement a2=drv.findElementByXPath("//input[@name='firstname']");
        a2.sendKeys("mysite");
        WebElement a3=drv.findElementByXPath("//input[@name='lastname']");
        a3.sendKeys("mypass");

        System.out.println(a1.getAttribute("value"));
        System.out.println(a2.getAttribute("value"));
        System.out.println(a3.getAttribute("value"));
        slp(5);

        WebElement err1=drv.findElementByXPath("//div[@ng-message]");
                //div[@ng-message='valid-invite-code']");

        System.out.println("Error: " + err1.getText());

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
