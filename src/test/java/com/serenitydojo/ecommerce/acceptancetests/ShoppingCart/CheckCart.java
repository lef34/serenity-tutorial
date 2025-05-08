package com.serenitydojo.ecommerce.acceptancetests.ShoppingCart;

import com.serenitydojo.ecommerce.actions.CatalogActions;
import com.serenitydojo.ecommerce.actions.ItemDetailsActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
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

    //Purpose of this test it to showcase how to locate elements via css classes
    @Test
    void shoppingCartCheck(){
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        //find(".showcart").click();
        selectItem.accessItemDetails("Breathe-Easy Tank");
        itemDetails.clickOnSizeNumber();
        itemDetails.clickOnColor();
        itemDetails.clickAddToCartButton();
        shopppingCart.showCartSummary();
        shopppingCart.clickProceedToCheckout();

        //waitForTextToAppear("You have no items in your shopping cart.");

    }
}
