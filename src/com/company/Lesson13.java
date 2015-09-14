package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson13 {
    @Before
    public void beforeDriver(){
        TestHelper.setup(AngelPage.url);
    }

    @Test
    public void test1() throws InterruptedException {
        AngelPage.setMaster("masterpass");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test2() throws InterruptedException {
        AngelPage.setMaster("hello");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test3() throws InterruptedException {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("google.com");
        AngelPage.sendEnter();
        Assert.assertEquals("quSWcvR/lH8G8@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test4() throws InterruptedException {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        Assert.assertEquals("quSWcvR/lH8G8@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test5() throws InterruptedException {
        AngelPage.setMaster("");
        AngelPage.setSitename("");
        AngelPage.generate();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test6() throws InterruptedException {
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSitename("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.generate();
        Assert.assertEquals("bBALI0mG3K0AL@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test66() throws InterruptedException {
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSitename("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        AngelPage.generate();
        Assert.assertEquals("jFljhvDp1Y9yi@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
      public void test7() throws InterruptedException {
        AngelPage.setMaster(" ");
        AngelPage.setSitename(" ");
        AngelPage.generate();
        Assert.assertEquals("2YQR63Cwft+D6@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test8() throws InterruptedException {
        AngelPage.setMaster("333");
        AngelPage.setSitename("111");
        AngelPage.generate();
        Assert.assertEquals("CD/iUTsNwzV4v@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test9() throws InterruptedException {
        AngelPage.setMaster("111");
        AngelPage.setSitename("333");
        AngelPage.generate();
        Assert.assertEquals("A61tAOVfX4wCm@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test10() throws InterruptedException {
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSitename("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.generate();
        Assert.assertEquals("mWxGz2VYwGgZK@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test11() throws InterruptedException {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("asd");
        AngelPage.generate();
        Assert.assertEquals("agdjoTB4cjI5E@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test12() throws InterruptedException {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("ASD");
        AngelPage.generate();
        Assert.assertEquals("FkfaCm2ddwvDg@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test13() throws InterruptedException {
        AngelPage.setMaster("QWE123");
        AngelPage.setSitename("asd");
        AngelPage.generate();
        Assert.assertEquals("dhXv5xdpzpsr+@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test14() throws InterruptedException {
        AngelPage.setMaster("QWE123");
        AngelPage.setSitename("ASD");
        AngelPage.generate();
        Assert.assertEquals("sxrow3yiyKw3h@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test15() throws InterruptedException {
        AngelPage.setMaster("");
        AngelPage.setSitename("asd");
        AngelPage.generate();
        Assert.assertEquals("/C9kocaflSlHa@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test16() throws InterruptedException {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("");
        AngelPage.generate();
        Assert.assertEquals("sQS6hWP3NA32G@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test17() throws InterruptedException {
        AngelPage.setMaster("1+1");
        AngelPage.setSitename("");
        AngelPage.generate();
        Assert.assertEquals("BXYuMvgLoT5Ll@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test18() throws InterruptedException {
        AngelPage.setMaster("2/0");
        AngelPage.setSitename("2/0");
        AngelPage.generate();
        Assert.assertEquals("v3xY97+tXxAS5@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test19() throws InterruptedException {
        AngelPage.setMaster("\"a\"");
        AngelPage.setSitename("\"a\"");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("vybb/hnwlLYhi@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test20() throws InterruptedException {
        AngelPage.setMaster("\"([a-zA-Z]+) (\\d+)\"");
        AngelPage.setSitename("\"([a-zA-Z]+) (\\d+)\"");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("z3Bz38Fe3+Xef@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test21() throws InterruptedException {
        AngelPage.setMaster("àáâãäåçèéêëìíîðñòôõöö");
        AngelPage.setSitename("àáâãäåçèéêëìíîðñòôõöö");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("culYrK2UT7h6E@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
 /*   @Test
    public void test22() {
        AngelPage.setMaster(" \u001F\u001F");
        AngelPage.setSitename(" \u001F\u001F");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("EA8NJx9mClq7M@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test222() {
        AngelPage.setMaster("\\u001F");
        AngelPage.setSitename("\\u001F");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("n0LikKqPx+uJW@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test223() {
        AngelPage.setMaster("\u001F0x0000001F (1f)");
        AngelPage.setSitename("\u001F0x0000001F (1f)");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("YP1eK70YeD1P+@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }*/
    @Test
    public void test23() throws InterruptedException {
        AngelPage.setMaster("999.999.999.999");
        AngelPage.setSitename("999.999.999.999");
        AngelPage.generate();
        Assert.assertEquals("GlDQ/PeFN+t2k@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }

    @Test
    public void test24() throws InterruptedException {
        AngelPage.setMaster("Feb 30, Sept 31");
        AngelPage.setSitename("Feb 30, Sept 31");
        AngelPage.generate();
        Assert.assertEquals("OZ0T2U4X2eX4H@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test25() throws InterruptedException {
        AngelPage.setMaster("Dog café θλφ 你");
        AngelPage.setSitename("Dog café θλφ 你");
        AngelPage.generate();
        Assert.assertEquals("0mTwK3TQrntx8@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test26() throws InterruptedException {
        AngelPage.setMaster("‘select * from customer");
        AngelPage.setSitename("‘select * from customer");
        AngelPage.generate();
        Assert.assertEquals("V+pCK9KFLhf7A@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    //http://oxogamestudio.com/passwd.current2.htm
    public void test27() throws InterruptedException {
        AngelPage.setMaster("aaa");
        AngelPage.setSitename("aaa");
        AngelPage.generate();
        Assert.assertEquals("aaa", AngelPage.getMaster());
        System.out.println(AngelPage.getMaster());
    }
    @Test
    //http://oxogamestudio.com/passwd.current2.htm
    public void test28() throws InterruptedException {
        AngelPage.setMaster("bbb");
        AngelPage.setSitename("bbb");
        AngelPage.generate();
        Assert.assertEquals("bbb", AngelPage.getSiteName());
        System.out.println(AngelPage.getSiteName());
    }
    @Test
    public void test29() throws InterruptedException {
        AngelPage.setMaster("ccc");
        AngelPage.setSitename("ccc");
        AngelPage.generate();
        TestHelper.slp(5);
        Assert.assertEquals(true, AngelPage.getEnabledMaster());
        System.out.println(AngelPage.getEnabledMaster());
    }
    @Test
    public void test30() throws InterruptedException {
        AngelPage.setMaster("ddd");
        AngelPage.setSitename("ddd");
        AngelPage.generate();
        TestHelper.slp(5);
        Assert.assertEquals(true, AngelPage.getEnabledSiteName());
        System.out.println(AngelPage.getEnabledSiteName());
    }
    @Test
    public void test31() throws InterruptedException {
        AngelPage.setMaster("eee");
        AngelPage.setSitename("eee");
        AngelPage.generate();
        TestHelper.slp(5);
        Assert.assertEquals(true, AngelPage.getEnabledPassword());
        System.out.println(AngelPage.getEnabledPassword());
    }
    //http://oxogamestudio.com/passwd.current5.htm
    @Test
    public void test32() {
        Assert.assertEquals("Your master password", AngelPage.nameFieldMaster());
    }
    @Test
    public void test33() {
        Assert.assertEquals("Site name", AngelPage.nameFieldSite());
    }
    @Test
    public void test34() {
        Assert.assertEquals("Generated password", AngelPage.nameGeneratePwd());
    }
    @After
    public void aftertest(){
        TestHelper.quit();
    }
}
