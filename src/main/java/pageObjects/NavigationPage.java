package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage extends BasePage{

    //locators
    By secondButton = By.xpath("//li[normalize-space(.)='2']");
    By previousButton = By.xpath("//li[normalize-space(.)='Previous']");
    By nextButton = By.xpath("//li[normalize-space(.)='Next']");
    By textSecondPage = By.xpath("//p[@class='lead']");
    By textThirdPage = By.xpath("//p[@class='lead']");
    By textPreviousPage = By.xpath("//p[@class='lead']");

    private static final String NAV_FORM_URL = "navigation1.html";
    public String linkSecondPage = "navigation2.html";
    public String linkThirdPage = "navigation3.html";
    public String secondPageTextContains = "Ut enim ad minim veniam";
    public String thirdPageTextContains = "Excepteur sint occaecat";

    public NavigationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get second button")
    public WebElement getSecondButton() {
        return driver.findElement(secondButton);
    }

    @Step("Get second page text")
    public WebElement getSecondPageText() {
        return driver.findElement(textSecondPage);
    }

    @Step("Get third page text")
    public WebElement getThirdPageText() {
        return driver.findElement(textThirdPage);
    }

    @Step("Get previous page text")
    public WebElement getPreviousPageText() {
        return driver.findElement(textPreviousPage);
    }

    @Step("Get next button")
    public WebElement getNextButton() {
        return driver.findElement(nextButton);
    }

    @Step("Get previous button")
    public WebElement getPreviousButton() {
        return driver.findElement(previousButton);
    }

    @Step("Get subpage url")
    public String getUrl() {
        return NAV_FORM_URL;
    }
}
