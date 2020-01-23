package com.crm.qa.pageObjects;

import com.crm.qa.driver.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ResetPasswordPage extends BaseClass {

    public String validateReset_pswd_page(){
         return driver.getCurrentUrl();
    }

    public void input_box(){
        driver.findElement(By.name("email")).sendKeys("poonam.1999@gmail.com");
    }
    public void submit_btn(){
        driver.findElement(By.name("action")).click();
    }
    public boolean messageValidation(){
       return driver.findElement(By.className("field")).isDisplayed();
    }

}
