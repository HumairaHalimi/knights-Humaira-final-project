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
import java.util.List;

public class SeleniumUtility extends BaseSetup {
    private WebDriverWait getWait() {

        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));
    }
    private WebElement waitUntilVisibilityOfElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    private List<WebElement> waitUntilVisibilityOfAllElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }
    private WebElement waitUntilElementClickable(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public boolean isElementDisplayed(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.isDisplayed();

    }

    public void buttonClick(By locator) {
        waitUntilElementClickable(locator).click();

    }

    public String getElementText(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.getText();
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
    public List<WebElement> getListOfElements(By locator) {
        List<WebElement> elements = waitUntilVisibilityOfAllElement(locator);
        return elements;
    }

}
