package PomPack.FlipKart;

import BasePack.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipkartaddtocartPage extends baseClass {



    By addtocart = By.xpath("//div[@class='CTTtEa']//div[@class='OmE16y']//div[@class='asbjxx']//div[@style='transform: translateY(0px) scale(1);']");

    public FlipkartaddtocartPage() {
        this.driver = driver;
    }


    public void addtocartbtn() throws InterruptedException {

        WebElement cart = driver.findElement(addtocart);

        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", cart);
        Thread.sleep(300);
        js.executeScript("arguments[0].click();", cart);

        Thread.sleep(2000);
    }

}