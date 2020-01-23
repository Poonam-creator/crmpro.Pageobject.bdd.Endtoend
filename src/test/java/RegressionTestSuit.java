import com.crm.qa.driver.BaseClass;
import com.crm.qa.pageObjects.HomePage;
import com.crm.qa.pageObjects.LoginPage;
import com.crm.qa.pageObjects.ResetPasswordPage;
import org.junit.Assert;
import org.junit.Test;

public class RegressionTestSuit extends BaseClass {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();

    @Test
    public void fogotPaswdLinkTest(){
        loginPage.validateforgot_paswd_link();
        String url =resetPasswordPage.validateReset_pswd_page();
        Assert.assertEquals("https://register.cogmento.com/password/reset/request/",url);
        resetPasswordPage.input_box();
        resetPasswordPage.submit_btn();
        boolean flag =resetPasswordPage.messageValidation();
        Assert.assertTrue(flag);
    }
    @Test
    public void calenderTest(){
        loginPage.validateLogin();
        loginPage.clickLoginbtn();
        homePage.homepagevalidation();
        homePage.validate_calender_function();
    }


    }
