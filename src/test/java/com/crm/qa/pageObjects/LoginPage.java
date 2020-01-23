package com.crm.qa.pageObjects;

import com.crm.qa.driver.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    public void login_page_url(){
        driver.getCurrentUrl();
    }
    public void validateLogin(){
        driver.findElement(By.name("email")).sendKeys("poonamr.1999@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test@123");
    }
    public void clickLoginbtn(){
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
    }

    public void validateforgot_paswd_link(){
        driver.findElement(By.linkText("Forgot your password?")).click();
    }
}
