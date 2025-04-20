package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    public HomePage(WebDriver driver) {
        super(driver);
        openHome();
    }

    @Step("Open homepage")
    private void openHome() {
        driver.get(BASE_URL);
    }

    @Step("Open Web form page")
    public WebFormPage openWebFormPage() {
        driver.findElement(By.xpath("//a[@href = 'web-form.html']")).click();
        return new WebFormPage(driver);
    }

    @Step("Open Navigation page")
    public NavigationPage openNavigationPage() {
        driver.findElement(By.xpath("//a[@href = 'navigation1.html']")).click();
        return new NavigationPage(driver);
    }

    @Step("Open DropDown menu page")
    public DropDownMenuPage openDropDownMenuPage() {
        driver.findElement(By.xpath("//a[@href = 'dropdown-menu.html']")).click();
        return new DropDownMenuPage(driver);
    }

    @Step("Get web title")
    public String getWebTitle() {
        return driver.getTitle();
    }
}
