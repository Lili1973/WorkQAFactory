package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AnywayAnydayTest {
    @Before
    public void beforeDriver(){
        TestHelper.setup(AnywayAnyday.url);
    }

    @Test
    public void test1() {
        AnywayAnyday.setLenguage("English");
        TestHelper.slp(3);
        //AnywayAnyday.setLenguage("Русский");
        TestHelper.slp(3);
        AnywayAnyday.setLenguage("Deutsch");
        TestHelper.slp(3);
    }
    @Test
       public void test2() {
        AnywayAnyday.setLenguage("Русский");
        TestHelper.slp(3);
    }
    @Test
    public void test3() {
        AnywayAnyday.setLenguage("Deutsch");
        TestHelper.slp(3);
    }
    @After
    public void aftertest(){
        TestHelper.quit();
    }
}