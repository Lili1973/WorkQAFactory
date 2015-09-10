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
    public void test1() {
        AngelPage.setMaster("masterpass");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test2() {
        AngelPage.setMaster("hello");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test3() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("google.com");
        AngelPage.sendEnter();
        Assert.assertEquals("quSWcvR/lH8G8@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test4() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        Assert.assertEquals("quSWcvR/lH8G8@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test5() {
        AngelPage.setMaster("");
        AngelPage.setSitename("");
        AngelPage.generate();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test6() {
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSitename("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.generate();
        Assert.assertEquals("bBALI0mG3K0AL@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test66() {
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSitename("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        AngelPage.generate();
        Assert.assertEquals("jFljhvDp1Y9yi@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
      public void test7() {
        AngelPage.setMaster(" ");
        AngelPage.setSitename(" ");
        AngelPage.generate();
        Assert.assertEquals("2YQR63Cwft+D6@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test8() {
        AngelPage.setMaster("333");
        AngelPage.setSitename("111");
        AngelPage.generate();
        Assert.assertEquals("CD/iUTsNwzV4v@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test9() {
        AngelPage.setMaster("111");
        AngelPage.setSitename("333");
        AngelPage.generate();
        Assert.assertEquals("A61tAOVfX4wCm@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test10() {
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSitename("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.generate();
        Assert.assertEquals("mWxGz2VYwGgZK@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test11() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("asd");
        AngelPage.generate();
        Assert.assertEquals("agdjoTB4cjI5E@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test12() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("ASD");
        AngelPage.generate();
        Assert.assertEquals("FkfaCm2ddwvDg@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test13() {
        AngelPage.setMaster("QWE123");
        AngelPage.setSitename("asd");
        AngelPage.generate();
        Assert.assertEquals("dhXv5xdpzpsr+@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test14() {
        AngelPage.setMaster("QWE123");
        AngelPage.setSitename("ASD");
        AngelPage.generate();
        Assert.assertEquals("sxrow3yiyKw3h@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test15() {
        AngelPage.setMaster("");
        AngelPage.setSitename("asd");
        AngelPage.generate();
        Assert.assertEquals("/C9kocaflSlHa@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test16() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("");
        AngelPage.generate();
        Assert.assertEquals("sQS6hWP3NA32G@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test17() {
        AngelPage.setMaster("1+1");
        AngelPage.setSitename("");
        AngelPage.generate();
        Assert.assertEquals("BXYuMvgLoT5Ll@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test18() {
        AngelPage.setMaster("2/0");
        AngelPage.setSitename("2/0");
        AngelPage.generate();
        Assert.assertEquals("v3xY97+tXxAS5@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test19() {
        AngelPage.setMaster("\"a\"");
        AngelPage.setSitename("\"a\"");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("vybb/hnwlLYhi@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test20() {
        AngelPage.setMaster("\"([a-zA-Z]+) (\\d+)\"");
        AngelPage.setSitename("\"([a-zA-Z]+) (\\d+)\"");
        TestHelper.slp(5);
        AngelPage.generate();
        Assert.assertEquals("z3Bz38Fe3+Xef@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test21() {
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
    public void test23() {
        AngelPage.setMaster("999.999.999.999");
        AngelPage.setSitename("999.999.999.999");
        AngelPage.generate();
        Assert.assertEquals("GlDQ/PeFN+t2k@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }

    @Test
    public void test24() {
        AngelPage.setMaster("Feb 30, Sept 31");
        AngelPage.setSitename("Feb 30, Sept 31");
        AngelPage.generate();
        Assert.assertEquals("OZ0T2U4X2eX4H@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test25() {
        AngelPage.setMaster("Dog café θλφ 你");
        AngelPage.setSitename("Dog café θλφ 你");
        AngelPage.generate();
        Assert.assertEquals("0mTwK3TQrntx8@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    public void test26() {
        AngelPage.setMaster("‘select * from customer");
        AngelPage.setSitename("‘select * from customer");
        AngelPage.generate();
        Assert.assertEquals("V+pCK9KFLhf7A@1a", AngelPage.getPassword());
        System.out.println(AngelPage.getPassword());
    }
    @Test
    //http://oxogamestudio.com/passwd.current2.htm
    public void test27() {
        AngelPage.setMaster("aaa");
        AngelPage.setSitename("aaa");
        AngelPage.generate();
        Assert.assertEquals("aaa", AngelPage.getMaster());
        System.out.println(AngelPage.getMaster());
    }
    @Test
    //http://oxogamestudio.com/passwd.current2.htm
    public void test28() {
        AngelPage.setMaster("bbb");
        AngelPage.setSitename("bbb");
        AngelPage.generate();
        Assert.assertEquals("bbb", AngelPage.getSiteName());
        System.out.println(AngelPage.getSiteName());
    }
    @Test
    public void test29() {
        AngelPage.setMaster("ccc");
        AngelPage.setSitename("ccc");
        AngelPage.generate();
        TestHelper.slp(5);
        Assert.assertEquals(true, AngelPage.getEnabledMaster());
        System.out.println(AngelPage.getEnabledMaster());
    }
    @Test
    public void test30() {
        AngelPage.setMaster("ddd");
        AngelPage.setSitename("ddd");
        AngelPage.generate();
        TestHelper.slp(5);
        Assert.assertEquals(true, AngelPage.getEnabledSiteName());
        System.out.println(AngelPage.getEnabledSiteName());
    }
    @Test
    public void test31() {
        AngelPage.setMaster("eee");
        AngelPage.setSitename("eee");
        AngelPage.generate();
        TestHelper.slp(5);
        Assert.assertEquals(true, AngelPage.getEnabledPassword());
        System.out.println(AngelPage.getEnabledPassword());
    }
    @After
    public void aftertest(){
        TestHelper.quit();
    }
}
