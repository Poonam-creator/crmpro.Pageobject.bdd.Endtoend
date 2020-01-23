import com.crm.qa.driver.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    BaseClass baseClass = new BaseClass();
    @Before
    public void setup(){
        baseClass.openbrowser();
    }
    //@After
    public void teardown(){
        baseClass.closeBrowser();
    }
}
