package PomPack.Finaltask;

import BasePack.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Appbase  extends baseClass {

    public static void openGoogleAppsMenu() throws InterruptedException {

        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        WebElement googleapps = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
        googleapps.click();
        Thread.sleep(2000);

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='app']"));
        driver.switchTo().frame(frame1);
        Thread.sleep(2000);
    }
}
