package PositiveTestCases;

import HelpClasses.BaseTest;
import org.testng.annotations.Test;

public class ItemLocation extends BaseTest {

    @Test
    public void viewList() {
        categoriesMenu.linkToWomanPage();
        categoriesPage.viewList();
        screenshot("viewGrid");
    }

    @Test
    public void viewGrid() {
        categoriesPage.viewGrid();
        screenshot("viewGrid");
    }
}
