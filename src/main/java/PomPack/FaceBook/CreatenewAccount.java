package PomPack.FaceBook;

import BasePack.baseClass;
import CSVreader.CsvReader;
import org.openqa.selenium.By;

import java.io.IOException;

public class CreatenewAccount extends baseClass {

    CsvReader cr = new CsvReader();


    By firstname = By.xpath("//label[text()='First name']/../input");
    By surname = By.xpath("//label[text()='Surname']/../input");
    By Date = By.xpath("//div[@aria-label='Select day']");
    By date = By.xpath(  "//div[text()='5']");
    By Month = By.xpath("//div[@aria-label='Select month']");
    By month = By.xpath("//div[text()='April']");
    By Year = By.xpath("//div[@aria-label='Select year']");
    By year = By.xpath("//div[text()='2000']");
    By selectgender = By.xpath("//span[text()='Select your gender']/../..");
    By gender = By.xpath("//div[text()='Male']");
    By emailaddress = By.xpath("//label[text()='Mobile number or email address']/../input");
    By password = By.xpath( "//label[text()='Password']/../input");
    By show_password = By.xpath("//div[@aria-label='Show password']");
    By alreadyhaveaccount = By.xpath("//span[text()='I already have an account']/../../../../..");



    public void accountdetails(String data) throws IOException, InterruptedException {

        Thread.sleep(2000);
        CsvReader.csvFileReader(data);
        Thread.sleep(2000);
        driver.findElement(firstname).sendKeys(CsvReader.firstname);
        Thread.sleep(2000);
        driver.findElement(surname).sendKeys(CsvReader.surname);
        Thread.sleep(2000);
        driver.findElement(Date).click();
        Thread.sleep(2000);
        driver.findElement(date).click();
        Thread.sleep(2000);
        driver.findElement(Month).click();
        Thread.sleep(2000);
        driver.findElement(month).click();
        Thread.sleep(2000);
        driver.findElement(Year).click();
        Thread.sleep(2000);
        driver.findElement(year).click();
        Thread.sleep(2000);
        driver.findElement(selectgender).click();
        Thread.sleep(2000);
        driver.findElement(gender).click();
        Thread.sleep(2000);
        driver.findElement(emailaddress).sendKeys(CsvReader.emailid);
        Thread.sleep(2000);
        driver.findElement(password).sendKeys(CsvReader.password);
        Thread.sleep(2000);
        driver.findElement(show_password).click();
        Thread.sleep(2000);
        driver.findElement(alreadyhaveaccount).click();
        Thread.sleep(2000);


    }


}
