package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.LoggerUtil;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Set;
import org.apache.logging.log4j.Logger;
public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;
      Logger log = LoggerUtil.getLogger(ProductPage.class);
    public ProductPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
  
    By firstProduct = By.xpath("(//a[contains(@href,'/p/')])[1]");
    By addToCart = By.cssSelector("div.css-175oi2r[style*=\"height:44px\"][style*=\"width:44px\"]");
   By productprice = By.xpath("//div[contains(text(),'₹')]");
    public String getProductPrice(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productprice));
        String price = driver.findElement(productprice).getText();
      
        return price;
    }

    public void selectFirstProduct(){
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();
    }

    public void switchToProductWindow(){

        wait.until(driver -> driver.getWindowHandles().size() > 1);

        String parent = driver.getWindowHandle();

        for(String window : driver.getWindowHandles()){
            if(!window.equals(parent)){
                driver.switchTo().window(window);
                break;
            }
        }
    }

    public void addToCart(){
         log.info("Clicking Add to Cart button");
   
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    }
}