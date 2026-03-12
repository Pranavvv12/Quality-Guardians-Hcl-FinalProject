package utils;

import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtils {

    public static String captureScreenshot(WebDriver driver, String testName){

        try{

            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            String path = "src/test/resources/reports/" + testName + ".png";

            FileUtils.copyFile(src, new File(path));

            return path;

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}