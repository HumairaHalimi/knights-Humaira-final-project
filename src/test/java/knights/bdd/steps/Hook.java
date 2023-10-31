package knights.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import knights.bdd.utility.SeleniumUtility;

public class Hook extends SeleniumUtility {

        @Before
        public void setUpTests() {
                openBrowser();
        }


        @After

        public void cleanUpTests() {
                quitBrowser();
        }
}

