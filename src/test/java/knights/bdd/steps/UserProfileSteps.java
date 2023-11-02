package knights.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import knights.bdd.pages.UserProfilePage;
import knights.bdd.utility.SeleniumUtility;
import org.junit.Assert;

public class UserProfileSteps extends SeleniumUtility {
    @Then("click on profile button")
    public void click_on_profile_button() throws InterruptedException {
        buttonClick(UserProfilePage.PROFILE_BUTTON);
        Thread.sleep(5000);
    }

    @And("validate {string} is correct")
    public void validate_user_status_is_correct(String expectedStatus) {
        String actualStatus = getElementText(UserProfilePage.USER_STATUS);
        Assert.assertEquals("validate user status", expectedStatus, actualStatus);
    }

    @And("validate {string} is ok")
    public void validate_user_Type_is_correct(String expectedType) {
        String actualType = getElementText(UserProfilePage.USER_TYPE);
        Assert.assertEquals("validate user Type", expectedType, actualType);
    }

    @And("Validate {string} is entered right")
    public void validate_user_Name_is_correct(String expectedName) {
        String actualName = getElementText(UserProfilePage.USER_NAME);
        Assert.assertEquals("validate user Name", expectedName, actualName);
    }

    @And("validate {string} is fine")
    public void validate_user_Username_is_correct(String expectedUsername) {
        String actualUsername = getElementText(UserProfilePage.USER_USERNAME);
        Assert.assertEquals("validate user Username", expectedUsername, actualUsername);
    }

    @And("validate {string} is as expected")
    public void validate_user_Authorities_is_correct(String expectedAuthorities) throws InterruptedException {
        String actualAuthorities = getElementText(UserProfilePage.USER_AUTHORITIES);
        Assert.assertEquals("validate user Authorities", expectedAuthorities, actualAuthorities);
        Thread.sleep(5000);
    }

////////////////////////////////////////////////////////////

            /*@And("validate {string} is correct")
    public void validate_user_information_is_correct( String expectedText) {
        String actualStatus=getElementText(UserProfilePage.USER_STATUS);
        Assert.assertEquals("validate user status",expectedText,actualStatus);
        System.out.println(actualStatus);
        String actualType=getElementText(UserProfilePage.USER_TYPE);
        Assert.assertEquals("validate user status",expectedText,actualType);
        System.out.println(actualType);
        String actualName=getElementText(UserProfilePage.USER_NAME);
        Assert.assertEquals("validate user status",expectedText,actualName);
        System.out.println(actualName);
        String actualUsername=getElementText(UserProfilePage.USER_USERNAME);
        Assert.assertEquals("validate user status",expectedText,actualUsername);
        System.out.println(actualUsername);
        String actualAuthorities=getElementText(UserProfilePage.USER_AUTHORITIES);
        Assert.assertEquals("validate user status",expectedText,actualAuthorities);
        System.out.println(actualAuthorities);
        }*/

    ///////////////////////////////////////////////////////////////////////////


   /* @Then("validate {string} is enabled")
    public void validateLoginButtonDisabledEnabled(String expectedCondition) {
        boolean actualCondition = isElementEnabled(UserProfilePage.LOGOUT_BUTTON);
        if (expectedCondition.equalsIgnoreCase("enabled")) {
            Assert.assertTrue("logout Button should be enabled", actualCondition);
        } else if (expectedCondition.equalsIgnoreCase("disabled")) {
            Assert.assertFalse("logout Button should be disabled", actualCondition);
        }
    }*/

    @And("click on {string}")
    public void clickOnLogoutButton(String string) {
        buttonClick(UserProfilePage.LOGOUT_BUTTON);
    }
}





