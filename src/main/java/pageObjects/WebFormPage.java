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
    By readonlyInput = By.name("my-readonly");
    By readonlyInputLabel = By.xpath("//label[normalize-space(.)='Readonly input']");
    By dropdownSelect = By.name("my-select");
    By checkedCheckbox = By.id("my-check-1");
    By checkedCheckboxLabel = By.xpath("//label[normalize-space(.)='Checked checkbox']");
    By defaultCheckbox = By.id("my-check-2");
    By defaultCheckboxLabel = By.xpath("//label[normalize-space(.)='Default checkbox']");

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

    @Step("Get readonly input field")
    public WebElement getReadonlyInput() {
        return driver.findElement(readonlyInput);
    }

    @Step("Get readonly input label")
    public WebElement getReadonlyInputLabel() {
        return driver.findElement(readonlyInputLabel);
    }

    @Step("Get dropdown select field")
    public WebElement getdropdownSelect() {
        return driver.findElement(dropdownSelect);
    }

    @Step("Get checked checkbox field")
    public WebElement getcheckedCheckbox() {
        return driver.findElement(checkedCheckbox);
    }

    @Step("Get checked checkbox label")
    public WebElement getcheckedCheckboxLabel() {
        return driver.findElement(checkedCheckboxLabel);
    }

    @Step("Get default checkbox field")
    public WebElement getdefaultCheckbox() {
        return driver.findElement(defaultCheckbox);
    }

    @Step("Get default checkbox label")
    public WebElement getdefaultCheckboxLabel() {
        return driver.findElement(defaultCheckboxLabel);
    }
}
