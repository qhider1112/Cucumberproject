package PomPack.FaceBook;

import BasePack.baseClass;
import org.openqa.selenium.By;

public class Facebook extends baseClass {

    By usernameField = By.xpath("//input[@name='email']");
    By passwordField = By.xpath("//input[@name='pass']");
    By loginButton   = By.xpath("//div[@aria-label='Log in']");
    By createaccountbutton = By.xpath("//span[text()='Create new account']");



    public Facebook() {
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickcreateaccountbutton() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(createaccountbutton).click();
    }


}