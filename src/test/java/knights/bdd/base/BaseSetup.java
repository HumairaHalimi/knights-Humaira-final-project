package knights.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseSetup {

    private static WebDriver driver;
    private final String APP_URL ="https://dev.insurance.tekschool-students.com/";

    public void openBrowser()
    {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(APP_URL);

    }
    public WebDriver getDriver()
    {
        return driver;
    }
    public void quitBrowser()
    {
        if (driver!= null){
        driver.quit();
    }

}}
