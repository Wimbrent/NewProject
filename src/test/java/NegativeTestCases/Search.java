package NegativeTestCases;

import HelpClasses.BaseTest;
import org.testng.annotations.Test;

public class Search extends BaseTest {

    @Test
    public void notEnteredKeyword() {
        element.enterKeywordInSearch("");
        element.submitSearch();
        alert.warning();
    }
}
