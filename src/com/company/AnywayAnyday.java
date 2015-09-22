package com.company;

import org.openqa.selenium.By;

public class AnywayAnyday {
    public static String url = "https://www.anywayanyday.com/";

       // TestHelper.drv.findElement(By.xpath("//*[contains(@class,' b-language_section' )]//li[contains(@class)]")).click();

    public static void setLenguage(String value){
        TestHelper.drv.findElement(
                By.xpath("(//*[contains(@class,'b-menu-item-button-text--title' )])[1]")).click();
        //("//*[contains(@class,'j-current_culture')]")).click();
        //("(//*[contains(@class,'b-menu-item-button-text--title' )])[1]")).click();
        TestHelper.drv.findElement(
                By.xpath("//*[contains(@class,'b-language-section')]//li[contains(@class,'b-drop_down_list-item')]//span[text()='"+value+"']")).click();
                //  ("//*[contains(@class,'b-language-section')]//li[contains(@class,'b-drop_down_list-item')]//span[text()='English']")).click();
    }
}
