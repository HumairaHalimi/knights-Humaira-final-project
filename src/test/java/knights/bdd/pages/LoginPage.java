package knights.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {

    public final static By LOGIN_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div/a[2]");
    public final static By LOGIN_PAGE_TITLE =By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2");
    public final static By USER_NAME= By.id("username");
    public final static By PASSWORD= By.id("password");
    public final static By SIGN_IN_BUTTON=By.xpath("//button[@type='submit']");

    public final static By SIGNED_IN_PORTAL_HEADER = By.xpath("/html/body/div[1]/div/div[1]/div/h2");
public final  static By ERROR_MESSAGE = By.xpath("//div[@role='alert']");

}

