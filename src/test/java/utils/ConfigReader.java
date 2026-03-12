package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() {

        try {

            prop = new Properties();
<<<<<<< HEAD
            FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
=======
            FileInputStream fis = new FileInputStream("src/main/resources/config/config.properties");
>>>>>>> origin/main

            prop.load(fis);

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getProperty(String key){
        return prop.getProperty(key);
    }
}