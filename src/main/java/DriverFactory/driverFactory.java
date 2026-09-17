package DriverFactory;

import Utiles.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class driverFactory {

    public static WebDriver driver;
    public static String url1;
    public  static String url2;
    public static String url3;

    public static void Initializebrowser() throws IOException {

        ConfigFileReader cf = new ConfigFileReader();
        String browser = cf.getbrowser();
         url1 = cf.geturl1();
         url2 = cf.geturl2();
         url3 = cf.geturl3();

        if (browser.equalsIgnoreCase("chrome")){

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();


        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        }

        //driver.get(url1);


    }
}
