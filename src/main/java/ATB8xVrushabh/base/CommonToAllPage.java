package ATB8xVrushabh.base;

import ATB8xVrushabh.driver.DriverManager;
import org.openqa.selenium.By;

import static ATB8xVrushabh.driver.DriverManager.getDriver;

public class CommonToAllPage {

    public void enterInput(By by, String key)
    {

        getDriver().findElement(by).sendKeys(key);

    }

    public void clickElement(By by)
    {
        getDriver().findElement(by).click();
    }


}
