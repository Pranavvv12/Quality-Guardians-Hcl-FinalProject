package tests;

import base.BaseTest;
import pages.*;
import org.apache.logging.log4j.Logger;
import utils.LoggerUtil;
import org.testng.annotations.Test;
import org.testng.Assert;

public class FlipkartCheckoutTest extends BaseTest {

    Logger log = LoggerUtil.getLogger(FlipkartCheckoutTest.class);

    @Test
    public void flipkartCheckoutFlow(){

        log.info("Test Started");

        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);

        home.closeLoginPopup();

        log.info("Searching product");
        home.searchProduct("Samsung Galaxy");

        product.selectFirstProduct();
        product.switchToProductWindow();

        String price = product.getProductPrice();
        // log.info("Product Page Price: {}", price);

        log.info("Adding product to cart");
        product.addToCart();

        CartPage cart = new CartPage(driver);
        String cartPrice = cart.getCartPrice();

        log.info("Product search completed");

        log.info("Product Page Price: {}", price);
        log.info("Cart Page Price: {}", cartPrice);

        log.info("Price validation completed");
    }
}