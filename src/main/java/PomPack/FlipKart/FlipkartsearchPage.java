package PomPack.FlipKart;

import BasePack.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class FlipkartsearchPage extends baseClass {

    By search = By.name("q");
    By product = By.xpath("//div[@class='lWX0_T']//img");
    By closeLoginPopup = By.xpath("//div[contains(@class,'mcO4kT')]//span[@role='button']");

    public FlipkartsearchPage() {
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void closeLoginPopupIfPresent() throws InterruptedException {
        java.util.List<WebElement> closeButton =
                driver.findElements(closeLoginPopup);

        if (!closeButton.isEmpty()) {
            closeButton.get(0).click();
            Thread.sleep(1000);
        }
    }

    public void searchitem(String itemname) throws InterruptedException {
        WebElement searchbar = driver.findElement(search);
        searchbar.sendKeys(itemname, Keys.ENTER);
        Thread.sleep(2000);
    }

    public void selectbrandfilter(String brand) throws InterruptedException {

        java.util.List<WebElement> searchBoxes =
                driver.findElements(By.xpath("//input[contains(@placeholder,'Search Brand')]"));

        if (searchBoxes.isEmpty()) {
            java.util.List<WebElement> brandHeaders =
                    driver.findElements(By.xpath("//div[text()='Brand' or text()='BRAND']"));
            if (!brandHeaders.isEmpty()) {
                brandHeaders.get(0).click();
                Thread.sleep(2000);
            }
            searchBoxes = driver.findElements(By.xpath("//input[contains(@placeholder,'Search Brand')]"));
        }

        if (!searchBoxes.isEmpty()) {
            WebElement searchBox = searchBoxes.get(0);
            searchBox.click();
            searchBox.sendKeys(brand);
            Thread.sleep(2000);
        }

        String lowerBrand = brand.toLowerCase();
        By checkboxLabel = By.xpath(String.format(
                "//div[contains(translate(@title,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'%s')]//label",
                lowerBrand));

        java.util.List<WebElement> found = driver.findElements(checkboxLabel);

        if (found.isEmpty()) {
            throw new org.openqa.selenium.NoSuchElementException("Brand checkbox not found for: " + brand);
        }

        WebElement labelEl = found.get(0);
        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", labelEl);
        Thread.sleep(300);
        js.executeScript("arguments[0].click();", labelEl);   // JS click bypasses the hidden-input issue

        Thread.sleep(2000);
    }

    public void clickthesearchitem() throws InterruptedException {

        Thread.sleep(1000);

        WebElement item = driver.findElement(product);

        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", item);
        Thread.sleep(300);
        js.executeScript("arguments[0].click();", item);
        Thread.sleep(2000);
    }

}