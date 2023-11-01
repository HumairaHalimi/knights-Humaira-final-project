package knights.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import knights.bdd.pages.LoginPage;
import knights.bdd.utility.SeleniumUtility;
import org.junit.Assert;

public class LoginSteps extends SeleniumUtility {

    @When("Navigate to Login Button and click")
    public void navigate_to_login_button_and_click() {
        buttonClick(LoginPage.LOGIN_BUTTON);

    }
    @Then("Validate the login page title as {string}")
    public void validate_the_login_page_title_as(String expectedLoginPageTitle) {
        String actualLoginPageTitle= getElementText(LoginPage.LOGIN_PAGE_TITLE);
        Assert.assertEquals("validating login page title",
                expectedLoginPageTitle, actualLoginPageTitle);
    }
    @When("enter username as {string}")
    public void enter_username(String string) {
        enterValue(LoginPage.USER_NAME, string);

    }
    @And("enter password as {string}")
    public void enter_password(String string) {
        enterValue(LoginPage.PASSWORD, string);

    }
    @When("Navigate to Sign in button and click")
    public void navigate_to_sign_in_button_and_click() throws InterruptedException{
buttonClick(LoginPage.SIGN_IN_BUTTON);
        Thread.sleep(5000);// to solve the problem of same xpath for two different titles.
    }
    @Then("Validate the signed in portal title as {string}")
    public void validate_the_signed_in_portal_title_as(String expectedHeaderTitle) throws InterruptedException{
        String actualHeaderTitle= getElementText(LoginPage.SIGNED_IN_PORTAL_HEADER);
        Assert.assertEquals("validate sign in portal header",
                expectedHeaderTitle, actualHeaderTitle);
Thread.sleep(5000);
    }
    @Then("Validate error message as {string}")
    public void validate_error_message_as(String expectedErrorMessage) throws InterruptedException{
       String actualErrorMessage= getElementText(LoginPage.ERROR_MESSAGE);
       Assert.assertEquals("validating error message","ERROR\n"+expectedErrorMessage, actualErrorMessage);
        Thread.sleep(5000);
    }


}
