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
        element.sendKeys(string);
    }

    public void select(By locator, String text) {

        WebElement element = waitUntilVisibilityOfElement(locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public boolean isElementEnabled(By locator) {

        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.isEnabled();

    }

}
