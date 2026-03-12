package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    By cartProductName = By.xpath("//a[@class='_2Kn22P gBNbID']");
    By cartPrice = By.xpath("//*[contains(text(),'₹')]");
    By placeOrder = By.xpath("//div[contains(text(),'Place Order')]");

    public String getCartProductName(){
        return driver.findElement(cartProductName).getText();
    }

    public String getCartPrice(){
        return driver.findElement(cartPrice).getText();
    }

    public void clickPlaceOrder(){
        driver.findElement(placeOrder).click();
    }
}