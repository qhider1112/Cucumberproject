package Utiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    Properties pro;

    public ConfigFileReader() throws IOException {

        FileInputStream Fi = new FileInputStream("src/test/resources/config.properties");
        pro = new Properties();
        pro.load(Fi);
    }

    public String getbrowser(){

        return pro.getProperty("browser");

    }

    public String geturl1(){

        return pro.getProperty("URL1");

    }
    public String geturl2(){

        return pro.getProperty("URL2");

    }

    public String geturl3(){

        return pro.getProperty("URL3");

    }
}
