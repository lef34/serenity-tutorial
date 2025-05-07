package com.serenitydojo.ecommerce.acceptancetests.ShoppingCart;

import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityAfterEachCallback;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityAfterEachCallback.class)
public class CheckCart extends UIInteractions {

    NavigationActions navigation;
    //Purpose of this test it to showcase how to locate elements via css classes
    @Test
    void shoppingCartCheck(){
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        //find(By.className("showcart")).click();
        find(".showcart").click();
        waitForTextToAppear("You have no items in your shopping cart.");

    }
}
