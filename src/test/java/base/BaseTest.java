package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

import io.qameta.allure.Step;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        ConfigReader prop = new ConfigReader();
        String browser = prop.getProperty("browser");

        if(browser.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } 
        else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else{
            throw new RuntimeException("Browser not supported: " + browser);
        }

        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

        logLoginStep(); 
    }

    @Step("Logged into Flipkart webpage")
    public void logLoginStep() {
    }

    @AfterMethod
    public void tearDown() {

        if(driver != null){
            driver.quit();
        }
    }
}