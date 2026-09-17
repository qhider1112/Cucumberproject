package BasePack;

import DriverFactory.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class baseClass extends driverFactory {

    public static void exit() {
        driver.quit();
    }

    public static void refresh() {
        driver.navigate().refresh();
    }

    public static void maximize() {
        driver.manage().window().maximize();
    }

    public static void implicitwait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void scrollPage(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }

    public void switchToAppFrame() {
        By appFrame = By.xpath("//iframe[@name='app']");
        WebElement frame = driver.findElement(appFrame);
        driver.switchTo().frame(frame);
    }

    public static void switchWindow(int index) {
        Set<String> windows = driver.getWindowHandles();

        List<String> list = new ArrayList<>(windows);

        driver.switchTo().window(list.get(index));
    }





}