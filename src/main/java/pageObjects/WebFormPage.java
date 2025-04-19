package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebFormPage extends BasePage{
    private static final String WEB_FORM_URL = "web-form.html";

    //locators

    By textInput = By.id("my-text-id");
    By textInputLabel = By.xpath("//label[normalize-space(.)='Text input']");
    By password = By.name("my-password");
    By passwordLabel = By.xpath("//label[normalize-space(.)='Password']");
    By textArea = By.name("my-textarea");
    By textAreaLabel = By.xpath("//label[normalize-space(.)='Textarea']");
    By disabledInput = By.name("my-disabled");
    By disabledInputLabel = By.xpath("//label[normalize-space(.)='Disabled input']");

    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get subpage Url")
    public String getWebFormUrl() {
        return WEB_FORM_URL;
    }

    @Step("Get textInput field")
    public WebElement getTextInput() {
        return driver.findElement(textInput);
    }

    @Step("Get textInput label")
    public WebElement getTextInputLabel() {
        return driver.findElement(textInputLabel);
    }

    @Step("Get password field")
    public WebElement getPassword() {
        return driver.findElement(password);
    }

    @Step("Get password label")
    public WebElement getPasswordLabel() {
        return driver.findElement(passwordLabel);
    }

    @Step("Get text area field")
    public WebElement getTextArea() {
        return driver.findElement(textArea);
    }

    @Step("Get text area label")
    public WebElement getTextAreaLabel() {
        return driver.findElement(textAreaLabel);
    }

    @Step("Get disabled input field")
    public WebElement getDisabledInput() {
        return driver.findElement(disabledInput);
    }

    @Step("Get disabled input label")
    public WebElement getDisabledInputLabel() {
        return driver.findElement(disabledInputLabel);
    }
}
