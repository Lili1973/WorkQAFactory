package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson13 {
    public WebDriver drv;
    @Before
    public void beforeDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        drv = new ChromeDriver();
        drv.get("http://angel.net/~nic/passwd.current.html");
    }

    @Test
    public void test1() {
        setMaster("masterpass", drv);
        setSitename("google.com", drv);
        generate(drv);
        System.out.println(getPassword(drv));
    }
    @Test
    public void test2() {
        setMaster("hello", drv);
        setSitename("google.com", drv);
        generate(drv);
        System.out.println(getPassword(drv));
    }
    @Test
    public void test3() {
        setMaster("qwe123", drv);
        setSitename("google.com", drv);
        sendEnter(drv);
        Assert.assertEquals("quSWcvR/lH8G8@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test4() {
        setMaster("qwe123", drv);
        setSitename("google.com", drv);
        generate(drv);
        Assert.assertEquals("quSWcvR/lH8G8@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test5() {
        setMaster("", drv);
        setSitename("", drv);
        generate(drv);
        Assert.assertEquals("BaefBs8/Z/cm2@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test6() {
        setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", drv);
        setSitename("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", drv);
        generate(drv);
        Assert.assertEquals("bBALI0mG3K0AL@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test66() {
        setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", drv);
        setSitename("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", drv);
        generate(drv);
        Assert.assertEquals("jFljhvDp1Y9yi@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
      public void test7() {
        setMaster(" ", drv);
        setSitename(" ", drv);
        generate(drv);
        Assert.assertEquals("2YQR63Cwft+D6@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test8() {
        setMaster("333", drv);
        setSitename("111", drv);
        generate(drv);
        Assert.assertEquals("CD/iUTsNwzV4v@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test9() {
        setMaster("111", drv);
        setSitename("333", drv);
        generate(drv);
        Assert.assertEquals("A61tAOVfX4wCm@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test10() {
        setMaster("~!@#$%^&*()_+{}|\":?></\\", drv);
        setSitename("~!@#$%^&*()_+{}|\":?></\\", drv);
        generate(drv);
        Assert.assertEquals("mWxGz2VYwGgZK@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test11() {
        setMaster("qwe123", drv);
        setSitename("asd", drv);
        generate(drv);
        Assert.assertEquals("agdjoTB4cjI5E@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test12() {
        setMaster("qwe123", drv);
        setSitename("ASD", drv);
        generate(drv);
        Assert.assertEquals("FkfaCm2ddwvDg@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test13() {
        setMaster("QWE123", drv);
        setSitename("asd", drv);
        generate(drv);
        Assert.assertEquals("dhXv5xdpzpsr+@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test14() {
        setMaster("QWE123", drv);
        setSitename("ASD", drv);
        generate(drv);
        Assert.assertEquals("sxrow3yiyKw3h@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test15() {
        setMaster("", drv);
        setSitename("asd", drv);
        generate(drv);
        Assert.assertEquals("/C9kocaflSlHa@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test16() {
        setMaster("qwe123", drv);
        setSitename("", drv);
        generate(drv);
        Assert.assertEquals("sQS6hWP3NA32G@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test17() {
        setMaster("1+1", drv);
        setSitename("", drv);
        generate(drv);
        Assert.assertEquals("BXYuMvgLoT5Ll@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test18() {
        setMaster("2/0", drv);
        setSitename("2/0", drv);
        generate(drv);
        Assert.assertEquals("v3xY97+tXxAS5@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test19() {
        setMaster("\"a\"", drv);
        setSitename("\"a\"", drv);
        slp(5);
        generate(drv);
        Assert.assertEquals("vybb/hnwlLYhi@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test20() {
        setMaster("\"([a-zA-Z]+) (\\d+)\"", drv);
        setSitename("\"([a-zA-Z]+) (\\d+)\"", drv);
        slp(5);
        generate(drv);
        Assert.assertEquals("z3Bz38Fe3+Xef@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test21() {
        setMaster("àáâãäåçèéêëìíîðñòôõöö", drv);
        setSitename("àáâãäåçèéêëìíîðñòôõöö", drv);
        slp(5);
        generate(drv);
        Assert.assertEquals("culYrK2UT7h6E@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test22() {
        setMaster(" \u001F\u001F", drv);
        setSitename(" \u001F\u001F", drv);
        slp(5);
        generate(drv);
        Assert.assertEquals("EA8NJx9mClq7M@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test222() {
        setMaster("\\u001F", drv);
        setSitename("\\u001F", drv);
        slp(5);
        generate(drv);
        Assert.assertEquals("n0LikKqPx+uJW@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test223() {
        setMaster("\u001F0x0000001F (1f)", drv);
        setSitename("\u001F0x0000001F (1f)", drv);
        slp(5);
        generate(drv);
        Assert.assertEquals("YP1eK70YeD1P+@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test23() {
        setMaster("999.999.999.999", drv);
        setSitename("999.999.999.999", drv);
        generate(drv);
        Assert.assertEquals("GlDQ/PeFN+t2k@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }

    @Test
    public void test24() {
        setMaster("Feb 30, Sept 31", drv);
        setSitename("Feb 30, Sept 31", drv);
        generate(drv);
        Assert.assertEquals("OZ0T2U4X2eX4H@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test25() {
        setMaster("Dog café θλφ 你", drv);
        setSitename("Dog café θλφ 你", drv);
        generate(drv);
        Assert.assertEquals("0mTwK3TQrntx8@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    @Test
    public void test26() {
        setMaster("‘select * from customer", drv);
        setSitename("‘select * from customer", drv);
        generate(drv);
        Assert.assertEquals("V+pCK9KFLhf7A@1a", getPassword(drv));
        System.out.println(getPassword(drv));
    }
    public static void setMaster(String value, WebDriver driver) {
        driver.findElement(By.xpath("//*[@name='master']")).sendKeys(value);
    }
    public static void setSitename(String value, WebDriver driver) {
        driver.findElement(By.xpath("//*[@name='site']")).sendKeys(value);
    }
    public static void generate(WebDriver driver) {
        driver.findElement(By.xpath("//*[@value='Generate']")).click();
    }
    public static void sendEnter(WebDriver driver) {
        driver.findElement(By.xpath("//*[@name='site']")).sendKeys(Keys.ENTER);
    }
    public static String getPassword(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
    }

    @After
    public void afterDriver(){
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
