package knights.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {

    private static WebDriver driver;
    private final String APP_URL ="https://dev.insurance.tekschool-students.com/";

    public void openBrowser()
    {
        String configFilePath = System.getProperty("user.dir") + "/src/test/resources/configs/dev_env_config.properties";

        //Step 2) Create Object from Properties Class in Java Library
        Properties properties = new Properties();

        //Step 3) Load config file to properties object.
        // we also need FileInputStream file Java
        try {
            FileInputStream configFile = new FileInputStream(configFilePath);
            properties.load(configFile);
        }catch (IOException e) {
            e.printStackTrace();
        }

        //Step 4) read a value from property file using the property key.
        String baseUrl = properties.getProperty("ui.url");
        String browserType = properties.getProperty("ui.browser.type");

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
