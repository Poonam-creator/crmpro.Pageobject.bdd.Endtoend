package com.crm.qa.pageObjects;

import com.crm.qa.driver.BaseClass;
import org.openqa.selenium.By;

public class HomePage extends BaseClass {

    public void homepagevalidation(){
        driver.findElement(By.xpath("//div[@class='header item']")).isDisplayed();
    }
        public void validate_calender_function(){
         driver.findElement(By.cssSelector("#main-nav > a:nth-child(2) > span")).click();
        }

        public void validate_setting_icon(){
        driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/i")).click();
        }
        public void validate_logout(){
            driver.findElement(By.linkText("Log Out")).click();

        }
}
