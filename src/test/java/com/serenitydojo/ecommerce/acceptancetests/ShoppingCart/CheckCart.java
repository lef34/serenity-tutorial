package com.serenitydojo.ecommerce.acceptancetests.ShoppingCart;

import com.serenitydojo.ecommerce.actions.CatalogActions;
import com.serenitydojo.ecommerce.actions.ItemDetailsActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.pageobjects.ItemDetailsPage;
import com.serenitydojo.ecommerce.pageobjects.ShoppingCardComponent;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityAfterEachCallback;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityAfterEachCallback.class)
public class CheckCart extends UIInteractions {

    NavigationActions navigation;
    ShoppingCardComponent shopppingCart;
    CatalogActions selectItem;
    ItemDetailsActions itemDetails;
    ItemDetailsPage itemDetailsPage;

    //Shopping Cart check by adding one item to the cart
    @Test
    void shoppingCartCheck(){
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        selectItem.accessItemDetails("Breathe-Easy Tank");
        itemDetails.clickOnSizeNumber();
        itemDetails.clickOnColor();
        //itemDetails.clickAddToCartButton();
        itemDetailsPage.addToCart();
        shopppingCart.showCartSummary();
        shopppingCart.clickProceedToCheckout();

        //waitForTextToAppear("You have no items in your shopping cart.");

    }

    //Add two items in the cart
    @Test
    void addTwoItemsInTheCart(){
        //Adding first item
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        selectItem.accessItemDetails("Breathe-Easy Tank");
        itemDetails.clickOnSizeNumber();
        itemDetails.clickOnColor();
        itemDetailsPage.addToCart();

        //Adding second item
        //navigation.openWebPage("https://magento.softwaretestingboard.com/");
        //selectItem.accessItemDetails("Radiant Tee");
        //itemDetails.clickOnSizeNumber();
        //itemDetails.clickOnColor();
        //itemDetailsPage.addToCart();


        //Select the shopping cart button
        shopppingCart.showCartSummary();

    }
}
