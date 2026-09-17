package Step_Definition;

import BasePack.baseClass;
import CSVreader.AppCsvReader;
import CSVreader.FlipkartcsvReader;
import PomPack.FaceBook.CreatenewAccount;
import PomPack.FaceBook.Facebook;
import PomPack.Finaltask.*;
import PomPack.FlipKart.FlipkartaddtocartPage;
import PomPack.FlipKart.FlipkartsearchPage;
import PomPack.app.Playstore;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class stepDef extends baseClass {

    WebDriver driver;
    Playstore app = new Playstore();
    Facebook facebook = new Facebook();
    CreatenewAccount cna = new CreatenewAccount();
    FlipkartsearchPage Flipkartsearchpage = new FlipkartsearchPage();
    FlipkartaddtocartPage FlipkartAddtocart = new FlipkartaddtocartPage();
    Appbase AppBase = new Appbase();

    @Given("the browser window is maximized")
    public void the_browser_window_is_maximized() throws InterruptedException {

    }

    @When("the user navigates to the Google homepage")
    public void the_user_navigates_to_the_google_homepage() throws InterruptedException {
        app.openGoogleHomepage(url1);
        maximize();
        Thread.sleep(2000);
    }

    @When("the user clicks on the Google apps icon")
    public void the_user_clicks_on_the_google_apps_icon() throws InterruptedException {
        app.clickGoogleAppsIcon();
        Thread.sleep(2000);
    }

    @Then("the user should be able to switch to the app iframe")
    public void the_user_should_be_able_to_switch_to_the_app_iframe() throws InterruptedException {
        app.switchToAppFrame();
        Thread.sleep(2000);
    }

    @When("the user clicks on the Play icon")
    public void the_user_clicks_on_the_play_icon() throws InterruptedException {
        app.clickPlayIcon();
        Thread.sleep(2000);
    }

    @When("the user switches back to default content")
    public void the_user_switches_back_to_default_content() throws InterruptedException {
        app.switchToDefaultContent();
        Thread.sleep(5000);
    }

    @When("the user clicks on the Apps button")
    public void the_user_clicks_on_the_apps_button() throws InterruptedException {
        app.clickAppsButton();
        Thread.sleep(2000);
    }

    @When("the user scrolls down the page")
    public void the_user_scrolls_down_the_page() throws InterruptedException {
        app.scrollPage(500);
        Thread.sleep(2000);
    }

    @When("the user clicks on the Instagram icon")
    public void the_user_clicks_on_the_instagram_icon() throws InterruptedException {
        app.clickInstagramIcon();
        Thread.sleep(2000);
    }

    @When("the user scrolls down again")
    public void the_user_scrolls_down_again() throws InterruptedException {
        app.scrollPage(300);
        Thread.sleep(2000);
    }

    @Then("the user clicks the Install button")
    public void the_user_clicks_the_install_button() throws InterruptedException {
        app.clickInstallButton();
        Thread.sleep(2000);

    }


    @Given("user opens the facebook browser")
    public void user_opens_the_facebook_browser() throws Exception {
        facebook.navigateToUrl(url3);
        baseClass.maximize();
        Thread.sleep(2000);
    }

    @Then("user navigates to the Facebook url")
    public void user_navigates_to_the_facebook_url() {

    }

    @Then("enter {string} in the fb username field")
    public void enter_fb_username(String username) throws InterruptedException {
        facebook.enterUsername(username);
        Thread.sleep(2000);
    }

    @And("enter {string} in the fb password field")
    public void enter_fb_password(String password) throws InterruptedException {
        facebook.enterPassword(password);
        Thread.sleep(2000);
    }


    @Then("click on create an account {string}")
    public void clickOnCreateAnAccount(String serialnumber) throws InterruptedException, IOException {
        facebook.clickcreateaccountbutton();
        Thread.sleep(2000);
        cna.accountdetails(serialnumber);
    }

    @Then("click the fb login button")
    public void click_fb_login_button() throws InterruptedException {
        facebook.clickLoginButton();
        Thread.sleep(4000);
    }

    @Then("exit fb webpage")
    public void exit_fb_webpage() {
        baseClass.exit();
    }

    @Given("User open the browser and open flipkart url")
    public void user_open_the_browser_and_open_flipkart_url() throws InterruptedException {
        Flipkartsearchpage.navigateToUrl(url2);
        maximize();
        Thread.sleep(2000);
        Flipkartsearchpage.closeLoginPopupIfPresent();
        Thread.sleep(2000);
    }

    @Then("search for an {string} in the search bar")
    public void search_for_an_in_the_search_bar(String key) throws IOException, InterruptedException {
        FlipkartcsvReader.csvFileReader(key);
        Flipkartsearchpage.searchitem(FlipkartcsvReader.product);
        Thread.sleep(2000);
    }

    @Then("select the brand filter")
    public void select_the_brand_filter() throws InterruptedException {
        Flipkartsearchpage.selectbrandfilter(FlipkartcsvReader.brand);
    }

    @Then("click an item to go into the item page")
    public void click_an_item_to_go_into_the_item_page() throws InterruptedException {
        Flipkartsearchpage.clickthesearchitem();
        Thread.sleep(2000);
        switchWindow(1);
    }

    @And("click the add to cart button")
    public void click_the_add_to_cart_button() throws InterruptedException {
        Thread.sleep(4000);
        FlipkartAddtocart.addtocartbtn();
        Thread.sleep(2000);
    }


    @Given("User open the browser and open google apps menu")
    public void user_open_the_browser_and_open_google_apps_menu() throws InterruptedException {
        maximize();
        Appbase.openGoogleAppsMenu();
    }

    @When("User select the {string} app option from csv")
    public void user_select_the_app_option_from_csv(String key) throws IOException {
        AppCsvReader.csvFileReader(key);
    }

    @Then("perform the action for that app")
    public void perform_the_action_for_that_app() throws InterruptedException, IOException {

        switch (AppCsvReader.app.trim().toLowerCase()) {
            case "gmail":
                gmail.gmaillogin(AppCsvReader.data1);
                break;
            case "maps":
                googlemaps.map(AppCsvReader.data1, AppCsvReader.data2);
                break;
            case "playstore":
                playstore.Googleplaystore(AppCsvReader.data1);
                break;
            case "youtube":
                youtube.Youtube(AppCsvReader.data1);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + AppCsvReader.app.trim().toLowerCase());
        }
    }
    
}

