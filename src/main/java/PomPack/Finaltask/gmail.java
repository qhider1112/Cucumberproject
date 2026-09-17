package PomPack.Finaltask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static DriverFactory.driverFactory.driver;


public class gmail extends Appbase {

    public static void switchWindow(int index) {
        Set<String> windows = driver.getWindowHandles();
        List<String> list = new ArrayList<>(windows);
        driver.switchTo().window(list.get(index));
    }

    public static void gmaillogin(String email) throws InterruptedException, IOException {

        WebElement gmailIcon = driver.findElement(By.xpath("//span[@data-text='Gmail']"));
        gmailIcon.click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        WebElement signin = driver.findElement(By.xpath("//a[@aria-label='Sign into Gmail']"));
        signin.click();
        switchWindow(1);
        Thread.sleep(2000);

        WebElement emailid = driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));
        emailid.sendKeys(email, Keys.ENTER);
        Thread.sleep(2000);
    }
}