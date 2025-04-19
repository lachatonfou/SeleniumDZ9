package ui;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageObjects.HomePage;
import pageObjects.WebFormPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pageObjects.HomePage.BASE_URL;

@Feature("POM")
public class WebFormWithPOMTest extends BaseTestWithPOM{

//    @BeforeEach
//    void setup() {
//        HomePage homePage = new HomePage(driver);
//        WebFormPage webFormPage = homePage.openWebFormPage();
//    }

    @Test
    void openWebFormTest() {
        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();
        String currentUrl = webFormPage.getCurrentUrl();
        String webFormUrl = webFormPage.getWebFormUrl();

        assertEquals(BASE_URL + webFormUrl, currentUrl);
    }

    @Test
    void proverkaTextInput() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();

        WebElement textInput = webFormPage.getTextInput();
        textInput.sendKeys("Halo");
        String enteredValue = textInput.getAttribute("value");
        Thread.sleep(1000);
        assertEquals("Halo", enteredValue);

        WebElement textInputLabel = webFormPage.getTextInputLabel();
        String textInputText = textInputLabel.getText();
        assertEquals("Text input", textInputText);
    }

    @Test
    void proverkaPassword() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();

        WebElement password = webFormPage.getPassword();
        password.sendKeys("ololo");
        String enteredValue = password.getAttribute("value");
        Thread.sleep(1000);
        assertEquals("ololo", enteredValue);

        WebElement passwordLabel = webFormPage.getPasswordLabel();
        String passwordText = passwordLabel.getText();
        assertEquals("Password", passwordText);
    }

    @Test
    void proverkaTextArea() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();

        WebElement textArea = webFormPage.getTextArea();
        textArea.sendKeys("uwuwu");
        String enteredValue = textArea.getAttribute("value");
        Thread.sleep(1000);
        assertEquals("uwuwu", enteredValue);

        WebElement textAreaLabel = webFormPage.getTextAreaLabel();
        String textAreaText = textAreaLabel.getText();
        assertEquals("Textarea", textAreaText);
    }

    @Test
    void proverkaDisabledInput() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();

        WebElement disabledInput = webFormPage.getDisabledInput();
        Assertions.assertFalse(disabledInput.isEnabled());
        Assertions.assertThrows(ElementNotInteractableException.class, () -> disabledInput.sendKeys("test"));

        String placeholderText = disabledInput.getAttribute("placeholder");
        Thread.sleep(1000);
        assertEquals("Disabled input", placeholderText);

        WebElement disabledInputLabel = webFormPage.getDisabledInputLabel();
        String disabledInputText = disabledInputLabel.getText();
        assertEquals("Disabled input", disabledInputText);

    }

    @Test
    void proverkaReadonlyInput() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();
        WebElement readonlyInput = driver.findElement(By.name("my-readonly"));
        Assertions.assertTrue(readonlyInput.isEnabled());

        String placeholderText = readonlyInput.getAttribute("value");
        Thread.sleep(1000);
        assertEquals("Readonly input", placeholderText);

        WebElement readonlyInputLabel = driver.findElement(By.xpath("//label[normalize-space(.)='Readonly input']"));
        String readonlyInputText = readonlyInputLabel.getText();
        assertEquals("Readonly input", readonlyInputText);

    }

    @Test
    void proverkaDropdownSelect() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();
        WebElement dropdownSelect = driver.findElement(By.name("my-select"));
        Select dropdown = new Select(dropdownSelect);
        dropdown.selectByVisibleText("Two");
        WebElement selectedOption1 = dropdown.getFirstSelectedOption();
        String selectedValue = selectedOption1.getText();
        Thread.sleep(3000);
        assertEquals("Two", selectedValue);

        dropdown.selectByValue("3");
        WebElement selectedOption2 = dropdown.getFirstSelectedOption();
        String selectedValue2 = selectedOption2.getText();
        assertEquals("Three", selectedValue2);
        Thread.sleep(3000);
    }

    @Test
    void proverkaCheckedCheckbox() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();
        WebElement checkedCheckbox = driver.findElement(By.id("my-check-1"));
        checkedCheckbox.click();
        Thread.sleep(1000);
        boolean isChecked = checkedCheckbox.isSelected();
        WebElement checkedCheckboxLabel = driver.findElement(By.xpath("//label[normalize-space(.)='Checked checkbox']"));
        String checkedCheckboxText = checkedCheckboxLabel.getText();
        assertEquals("Checked checkbox", checkedCheckboxText);
        assertEquals(false, isChecked);
    }

    @Test
    void proverkaDefaultCheckbox() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();
        WebElement defaultCheckbox = driver.findElement(By.id("my-check-2"));
        defaultCheckbox.click();
        Thread.sleep(1000);
        boolean isChecked = defaultCheckbox.isSelected();
        WebElement checkedCheckboxLabel = driver.findElement(By.xpath("//label[normalize-space(.)='Default checkbox']"));
        String checkedCheckboxText = checkedCheckboxLabel.getText();
        assertEquals("Default checkbox", checkedCheckboxText);
        assertEquals(true, isChecked);
    }
}
