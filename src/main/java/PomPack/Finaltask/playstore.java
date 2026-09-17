package PomPack.Finaltask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class playstore extends Appbase {

    public static void Googleplaystore(String appName) throws InterruptedException, IOException {

        WebElement playIcon = driver.findElement(By.xpath("//span[@data-text='Play']"));
        playIcon.click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@id='1']")).click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        WebElement appIcon = driver.findElement(By.xpath("//img[@alt='Icon image " + appName + "']"));
        appIcon.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);

        WebElement install = driver.findElement(By.xpath(
                "//div[contains(@data-item-id,'com." + appName.toLowerCase() + ".android')]//button[@aria-label='Install']"));
        install.click();
        Thread.sleep(2000);
    }
}