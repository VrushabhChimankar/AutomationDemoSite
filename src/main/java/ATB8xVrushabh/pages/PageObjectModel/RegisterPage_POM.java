package ATB8xVrushabh.pages.PageObjectModel;

import ATB8xVrushabh.base.CommonToAllPage;
import ATB8xVrushabh.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class RegisterPage_POM extends CommonToAllPage {

    //This class will have 3 things
    // one is param constructor, 2nd one is page locators, 3rd one is page actions

    WebDriver driver;

 //param constructor
 public  RegisterPage_POM(WebDriver driver){
     this.driver = driver;
 }

   //page locators

   private By firstname = By.xpath("//input[@placeholder='First Name']");
   private By lastname = By.xpath("//input[@placeholder='Last Name']");
   private By add = By.xpath("//textarea[@ng-model='Adress']");
   private By mail = By.xpath("//input[@ng-model='EmailAdress']");
   private By phe = By.xpath("//input[@ng-model='Phone']");
   private By male = By.xpath("//input[@value='Male']");
   private By cricket = By.id("checkbox1");
   private By language = By.id("msdd");
   private By skills = By.xpath("//select[@id='Skills']");

   private By country = By.xpath("//span[@class='select2-selection__arrow']");
   private By year = By.id("yearbox");
   private By month = By.xpath("//select[@placeholder='Month']");
   private By day = By.id("daybox");
   private By pwd = By.xpath("//input[@id='firstpassword']");
   private By c_pwd = By.xpath("//input[@id='secondpassword']");

   private By refresh = By.xpath("//button[@id='Button1']");
   private By submit = By.id("submitbtn");

   //list elements
   private By list_lang = By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li");
   private By list_country = By.xpath("//ul[@id='select2-country-results']//li");


   //file element
    private By file_upload = By.xpath("//input[@type='file']");



    //Page actions


    public void regiter_demo_pom(String name, String lname, String address, String email, String phone, String pass, String cnf_pass)
    {

        driver.get(PropertyReader.readKey("url"));

        enterInput(firstname, name);
        enterInput(lastname, lname);
        enterInput(add, address);
        enterInput(mail, email);
        enterInput(phe, phone);


        clickElement(male);
        clickElement(cricket);
        clickElement(language);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //select Hindi

         List<WebElement> lang =  driver.findElements(list_lang);

        for (WebElement el : lang){

            if (el.getText().contains("Hindi")){
                el.click();
                break;
            }

        }

        //Use select class
        Select select = new Select(driver.findElement(skills));
        select.selectByVisibleText("Java");

        clickElement(country);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //select India
        List<WebElement> select_country = driver.findElements(list_country);

        for (WebElement el2 : select_country){
            if (el2.getText().contains("India")){
                el2.click();
                break;
            }
        }

        Select select_year = new Select(driver.findElement(year));
        select_year.selectByVisibleText("2000");

        Select select_month = new Select(driver.findElement(month));
        select_month.selectByVisibleText("July");

        Select select_day = new Select(driver.findElement(day));
        select_day.selectByVisibleText("1");

        enterInput(pwd, pass);
        enterInput(c_pwd, cnf_pass);

        clickElement(submit);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }






    }











}
