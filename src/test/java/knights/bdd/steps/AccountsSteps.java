package knights.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import knights.bdd.pages.AccountsPage;
import knights.bdd.utility.SeleniumUtility;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountsSteps extends SeleniumUtility {
    @When("Click on {string} Link")
    public void click_on_link(String string)throws InterruptedException {
        buttonClick(AccountsPage.ACCOUNTS_BUTTON);

    }
   // @When("Wait {int} Second")
    //public void wait_second(Integer int1) {

    //}
    @Then("Validate accounts table have {int} rows")
    public void validate_accounts_table_have_rows_by_default(int expectedNumberOfRpw) throws InterruptedException{
    List<WebElement> actualNumberOfRow=getListOfElements(AccountsPage.TABLE_ROWS);
        Assert.assertEquals("validating Number of accountsTable rows",
                expectedNumberOfRpw,actualNumberOfRow.size());
        Thread.sleep(2000);
    }
    @When("change item per page to {string}")
    public void click_on_accounts_rows_selector(String itemPerPage) throws Exception{
        buttonClick(AccountsPage.ROW_PER_PAGE_SELECTOR);
        List<WebElement> itemPerPageOptions = getListOfElements(AccountsPage.ROW_PER_PAGE_options);
        for (WebElement element : itemPerPageOptions) {
            if (element.getText().contains(itemPerPage)) {
                element.click();
            }
            Thread.sleep(3000);
        }
    }
}
