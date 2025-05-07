package com.serenitydojo.ecommerce.acceptancetests.MessengerBag;

import com.serenitydojo.ecommerce.actions.CatalogActions;
import com.serenitydojo.ecommerce.actions.ItemDetailsActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityAfterEachCallback;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(SerenityAfterEachCallback.class)

public class ImageCheck extends UIInteractions {

    NavigationActions navigation;
    CatalogActions selectItem;
    ItemDetailsActions itemDetails;

    //Purpose of this test is to use ccs to locate web elements
    @Test
    void imageValidation(){

        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        selectItem.accessItemDetails("Push It Messenger Bag");
        Ensure.that(itemDetails.itemDetailTitle()).isEqualTo("[Push It Messenger Bag]");
        //Assertions.assertThat(itemDetails.itemDetailTitle()).isEqualTo("[Push It Messenger Bag]");
        itemDetails.itemImage("Image").shouldBeVisible();
    }
}
