package PositiveTestCases;

import HelpClasses.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    @Parameters("keyword")
    public void searchOnKeyword(String keyword) {
        element.enterKeywordInSearch(keyword);
        element.submitSearch();
        screenshot("searchOnKeyword");
    }
}
