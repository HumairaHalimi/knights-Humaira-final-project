package knights.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import knights.bdd.pages.CreateAccountPage;
import knights.bdd.pages.HomePage;
import knights.bdd.utility.SeleniumUtility;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateAccountSteps extends SeleniumUtility {
    @And("Click on {string}")
    public void clickOnPrimaryAccountButton(String expectedCreateButton) {
        buttonClick(HomePage.PRIMARY_ACCOUNT_BUTTON);
    }

    @Then("Validate Form Title is {string}")
    public void validateCreatePrimaryAccountFormTitle(String expectedFormTitle) {
        String actualFormTitle =
                getElementText(CreateAccountPage.CREATE_ACCOUNT_FORM_TITLE);
        Assert.assertEquals("Create Account Form Title Validation",
                expectedFormTitle
                , actualFormTitle);
    }


    @When("user enters credentials")
    public void enterCredentials(DataTable dataTable) throws Exception {
        List<List<String>> credentials = dataTable.cells();
        String emailAddress = credentials.get(0).get(0);
        enterValue(CreateAccountPage.EMAIL_ADDRESS, emailAddress);
        String firstName = credentials.get(0).get(1);
        enterValue(CreateAccountPage.FIRST_NAME, firstName);
        String lastName = credentials.get(0).get(2);
        enterValue(CreateAccountPage.LAST_NAME, lastName);
        String employmentStatus = credentials.get(0).get(3);
        enterValue(CreateAccountPage.EMPLOYMENT_STATUS, employmentStatus);
        Thread.sleep(4000);
    }

    @When("user select  {string} as Gender")
    public void selectUserGender(String string) {
     selectGender(CreateAccountPage.SELECT_GENDER);

    }
    @When("user select {string} as Title")
    public void selectUserTitle(String string) {
        selectTitle(CreateAccountPage.SELECT_TITLE);
    }
    @When("user select {string} as Marital Status")
    public void selectUserMaritalStatus(String string) {
        selectMaritalStatus(CreateAccountPage.SELECT_MARITAL_STATUS);
    }
    @When("user enters {string} as Date Of Birth")
    public void enterDateOfBirth(String string) throws Exception {
        enterValue(CreateAccountPage.DATE_OF_BIRTH, string);
        Thread.sleep(4000);
    }
    @When("clicks on Create Account button and navigate to sign up page")
    public void clickCreateAccountButton() {
        buttonClick(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }

    @Then("validate {string}is as expected")
   public void validateUserEmailAddressAsExpected(String expectedEmailAddress) {
       String actualEmailAddress = getElementText(CreateAccountPage.EMAIL_ADD_INPUT);
        Assert.assertEquals("userEmailAddress validation", expectedEmailAddress, actualEmailAddress );
        System.out.println((actualEmailAddress));

    }

}
