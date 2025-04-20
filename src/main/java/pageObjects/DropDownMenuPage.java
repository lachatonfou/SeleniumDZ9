package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropDownMenuPage extends BasePage{

    private static final String DROP_DOWN_URL = "dropdown-menu.html";

    //locators
    By leftclick = By.id("my-dropdown-1");
    By rightclick = By.id("my-dropdown-2");
    By doubleclick = By.id("my-dropdown-3");


    public DropDownMenuPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get subpage Url")
    public String getUrl() {
        return DROP_DOWN_URL;
    }

    @Step("Get left click menu")
    public WebElement getLeftClickMenu() {
        return driver.findElement(leftclick);
    }

    @Step("Get right click menu")
    public WebElement getRightClickMenu() {
        return driver.findElement(rightclick);
    }

    @Step("Get double click menu")
    public WebElement getDoubleClickMenu() {
        return driver.findElement(doubleclick);
    }

}
