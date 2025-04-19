package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    public HomePage(WebDriver driver) {
        super(driver);
        openHomePage();
    }

    @Step("Open homepage")
    public void openHomePage() {
        driver.get(BASE_URL);
    }

    @Step("Open Web form page")
    public void openWebFormPage() {
        //webFormButton.click();

    }

    @Step("Open Navigation page")
    public void openNavigationPage() {
        driver.get(BASE_URL);
    }

    @Step("Open DropDown menu page")
    public void openDropDownMenuPage() {
        driver.get(BASE_URL);
    }

    @Step("Get web title")
    public String getWebTitle() {
        return driver.getTitle();
    }
}
