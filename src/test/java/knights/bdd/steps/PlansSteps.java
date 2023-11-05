package knights.bdd.steps;

import io.cucumber.java.en.Then;
import knights.bdd.pages.PlansPage;
import knights.bdd.utility.SeleniumUtility;
import org.junit.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class PlansSteps extends SeleniumUtility {
    @Then("click on Plans button")
    public void click_on_plans_button() throws InterruptedException{
buttonClick(PlansPage.PLANS_BUTTON);
Thread.sleep(5000);
    }

    @Then("Validate {int} row of data is present")
    public void validate_row_of_data_is_present(int expectedRowNumber) {
int actualRowNumber= getListOfElements(PlansPage.TABLE_ROW_LOCATOR).size();
        Assert.assertEquals("validating number of rows in table ", expectedRowNumber, actualRowNumber);
    }
    @Then("Validate DATE CREATED is {}")
    public void validate_date_created_is_today_s(String expectedDate ) {
        Date expextedDate = new Date();
        String actualDate= getElementText(PlansPage.TODAY_DATE);
        String actualDate2= getElementText((PlansPage.TODAY_DATE_2));
        String actualDate3 = getElementText(PlansPage.TODAY_DATE_3);
        String actualDate4= getElementText(PlansPage.TODAY_DATE_4);

        Assert.assertEquals("validating date created column",
                expectedDate, actualDate);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate2);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate3);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate4);

    }
    @Then("Validate DATE EXPIRE is {}")
    public void validate_date_expire_is_day_after(String expectedDate) {
        String actualDate = getElementText(PlansPage.DAY_AFTER_DATE);
        String actualDate2 = getElementText((PlansPage.DAY_AFTER_DATE_2));
        String actualDate3 = getElementText(PlansPage.DAY_AFTER_DATE_3);
        String actualDate4 = getElementText(PlansPage.DAY_AFTER_DATE_4);

        Assert.assertEquals("validating date created column",
                expectedDate, actualDate);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate2);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate3);
        Assert.assertEquals("validating date created column",
                expectedDate, actualDate4);

    }}