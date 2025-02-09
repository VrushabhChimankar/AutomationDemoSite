package ATB8xVrushabh.tests.RegisterTest;

import ATB8xVrushabh.base.CommonToAllTest;
import ATB8xVrushabh.driver.DriverManager;
import ATB8xVrushabh.pages.PageObjectModel.RegisterPage_POM;
import ATB8xVrushabh.utils.PropertyReader;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Register_Test_POM extends CommonToAllTest {


    @Description("Successful register with valid credentials")
    @Test
    public void test_register_pom()
    {

        RegisterPage_POM register = new RegisterPage_POM(DriverManager.getDriver());
        register.regiter_demo_pom(PropertyReader.readKey("name"), PropertyReader.readKey("lname"), PropertyReader.readKey("address"), PropertyReader.readKey("email"), PropertyReader.readKey("phone"), PropertyReader.readKey("pass"), PropertyReader.readKey("cnf_pass"));


    }


}
