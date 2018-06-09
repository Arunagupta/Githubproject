package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import POM_Config.Configuration;

public class FlightFinder
{
   WebDriver driver;
   
   public FlightFinder(WebDriver driver){
      this.driver = driver;
   }
   
   
   @FindBy(xpath=Configuration.tripType)
   public WebElement tripType;
   
      
   public void doFindFlight(){
      tripType.click();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
}
