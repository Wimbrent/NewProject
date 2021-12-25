package PositiveTestCases.MyAccount;

import HelpClasses.BaseTest;
import org.testng.annotations.Test;

public class MyWishlistTest extends BaseTest {

    @Test
    public void newWishlist() {
        myAccountPage.linkToMyWishList();
        myWishlistPage.enterWishListName("New wishlist");
        myWishlistPage.save();
    }


}