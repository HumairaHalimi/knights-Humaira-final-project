package knights.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import knights.bdd.pages.HomePage;
import knights.bdd.utility.SeleniumUtility;
import org.junit.Assert;

public class HomePageSteps extends SeleniumUtility {

    @Then("Validate Application Title is {string}")
    public void applicationTitle(String expectedAppTitle) {
String actualAppTitle = getDriver().getTitle();
        Assert.assertEquals(" App Title Validation", expectedAppTitle,
                actualAppTitle);
    }

    @Then("Validate {string} should be existed")
    public void existenceOfPrimaryAccountButton(String expectedPrimaryAccountButton){
    boolean actualPrimaryAccountButton= isElementDisplayed(HomePage.CREATE_PRIMARY_ACCOUNT);
    Assert.assertTrue("Primary Account Button Existence", actualPrimaryAccountButton);

    }

}
