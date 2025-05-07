package com.serenitydojo.ecommerce.acceptancetests.Catalog;

import com.serenitydojo.ecommerce.actions.CatalogActions;
import com.serenitydojo.ecommerce.actions.ItemDetailsActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityAfterEachCallback;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.Image;
import net.serenitybdd.screenplay.ui.Link;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(SerenityAfterEachCallback.class)

public class DisplayProductDetails extends UIInteractions {

    NavigationActions navigation;
    CatalogActions selectItem;
    ItemDetailsActions itemDetails;

    @Test
    void displayProductDetails(){
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
            //Ways of clicking on an image or a link
        selectItem.accessItemDetails("Breathe-Easy Tank");
        //find(Link.withText("Breathe-Easy Tank")).click();
        //find(Image.withAltText("Breathe-Easy Tank")).click();

        Ensure.that(itemDetails.itemClass()).isEqualTo("[Breathe-Easy Tank]");
    }
}
