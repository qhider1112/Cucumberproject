package PomPack.Finaltask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;


public class googlemaps extends Appbase {

    public static void map(String startingPoint, String endingPoint) throws InterruptedException, IOException {

        WebElement maps = driver.findElement(By.xpath("//span[@data-text='Maps']"));
        maps.click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement layout = driver.findElement(By.xpath("//button[@class='yHc72 qk5Wte']"));
        wait.until(ExpectedConditions.elementToBeClickable(layout));
        layout.click();
        Thread.sleep(2000);

        WebElement directions = driver.findElement(By.xpath("//button[@aria-label='Directions']"));
        directions.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@aria-label='Starting point Your location']"))
                .sendKeys(startingPoint, Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']"))
                .sendKeys(endingPoint, Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label='Driving']")).click();
        Thread.sleep(3000);
        printRoutes("CarRoute");

        driver.findElement(By.xpath("//div[@aria-label='Two-wheeler']")).click();
        Thread.sleep(3000);
        printRoutes("BikeRoute");

        driver.findElement(By.xpath("//div[@aria-label='Walking']")).click();
        Thread.sleep(3000);
        printRoutes("WalkingRoute");
    }

    private static void printRoutes(String label) {
        System.out.println("\n=================================================================");
        for (int i = 1; i <= 3; i++) {
            WebElement route = driver.findElement(By.xpath("(//h1[@class='VuCHmb fontHeadlineSmall '])[" + i + "]"));
            WebElement timing = driver.findElement(By.xpath("(//div[@class='XdKEzd'])[" + i + "]"));
            WebElement distance = driver.findElement(By.xpath("(//div[@class='ivN21e tUEI8e fontBodyMedium'])[" + i + "]"));
            System.out.println(label + ": " + route.getText() + "\nTiming: " + timing.getText() + "\nDistance : " + distance.getText());
        }
    }
}
