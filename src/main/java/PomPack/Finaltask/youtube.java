package PomPack.Finaltask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class youtube extends Appbase {

    public static void Youtube(String searchTerm) throws InterruptedException {

        driver.findElement(By.xpath("//span[@data-text='YouTube']")).click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        driver.findElement(By.name("search_query")).sendKeys(searchTerm, Keys.ENTER);
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);

        WebElement song = null;
        for (int i = 1; i <= 15; i++) {
            Thread.sleep(1000);
            song = driver.findElement(By.xpath("(//div[@id='overlays']/..)[" + i + "]"));
            js.executeScript("arguments[0].scrollIntoView()", song);
        }
        song.click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@class='ytp-volume-icon ytp-button']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@class,'ytp-skip-ad-button')]"))).click();

        try {
            WebElement nothanks = driver.findElement(By.xpath("//span[text()='No thanks']/../.."));
            js.executeScript("arguments[0].click()", nothanks);
            js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(@aria-label,'Unmute (m)')]")));
        } catch (Exception e) {
            driver.findElement(By.xpath("//button[contains(@aria-label,'Unmute (m)')]")).click();
            System.out.println("No thanks is not present");
        }
    }
}