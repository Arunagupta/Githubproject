package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_Config.Configuration;

public class LoginPage
{
   WebDriver driver;
   
   public LoginPage(WebDriver driver){
      this.driver = driver;
   }
   
   
   @FindBy(xpath=Configuration.username)
   public WebElement username;
   
   @FindBy(xpath=Configuration.password)
   public WebElement password;
   
   
   public FlightFinder doLogin(String myusername,String mypassword){
      username.sendKeys(myusername);
      password.sendKeys(mypassword);
      //login.click
      
      return PageFactory.initElements(driver, FlightFinder.class);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
}
