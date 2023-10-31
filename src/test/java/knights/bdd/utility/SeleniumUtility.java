package knights.bdd.utility;

import knights.bdd.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {
    private WebDriverWait getWait() {

        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));
    }

    public boolean isElementDisplayed(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.isDisplayed();

    }

    private WebElement waitUntilElementClickable(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void buttonClick(By locator) {
        waitUntilElementClickable(locator).click();

    }
    public String getElementText(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.getText();
    }
    private WebElement waitUntilVisibilityOfElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public void enterValue(By locator, String string) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        //element.sendKeys("value", string);
        element.sendKeys(string);
    }
    public void selectGender(By locator) {

        WebElement genderElement = waitUntilVisibilityOfElement(locator);
        Select gender = new Select(genderElement);
        //gender.getAllSelectedOptions();
        gender.selectByVisibleText("Male");
    }
    public void selectMaritalStatus(By locator) {

        WebElement maritalStatusElement = waitUntilVisibilityOfElement(locator);
        Select maritalStatus = new Select(maritalStatusElement);
        maritalStatus.selectByVisibleText("Single");
}
    public void selectTitle(By locator) {

        WebElement titleElement = waitUntilVisibilityOfElement(locator);
        Select title = new Select(titleElement);
        //gender.getAllSelectedOptions();
        title.selectByVisibleText("Mr.");

    }}
