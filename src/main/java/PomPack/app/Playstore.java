package PomPack.app;

import BasePack.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Playstore extends baseClass {

    // Locators
     By googleAppsIcon = By.xpath("//a[@aria-label='Google apps']");
    By appFrame = By.xpath("//iframe[@name='app']");
     By playIcon = By.xpath("//span[@data-text='Play']");
     By appsButton = By.xpath("//button[@id='1']");
     By instagramIcon = By.xpath("//img[@alt='Icon image Instagram']");
     By installButton = By.xpath("//div[contains(@data-item-id,'com.instagram.android')]//button[@aria-label='Install']");


    public Playstore() {
        this.driver = driver;
    }

    public void openGoogleHomepage(String url) {
        driver.get(url);
    }


    public void clickGoogleAppsIcon()
    {
        driver.findElement(googleAppsIcon).click();
    }


    public void clickPlayIcon()
    {
        driver.findElement(playIcon).click();
    }

    public void switchToDefaultContent()
    {
        driver.switchTo().defaultContent();
    }

    public void clickAppsButton()
    {
        driver.findElement(appsButton).click();
    }



    public void clickInstagramIcon()
    {
        driver.findElement(instagramIcon).click();
    }

    public void clickInstallButton()
    {
        driver.findElement(installButton).click();
    }


}
