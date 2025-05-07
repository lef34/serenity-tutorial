package com.serenitydojo.ecommerce.acceptancetests.navigation;

import com.serenitydojo.ecommerce.actions.CatalogActions;
import com.serenitydojo.ecommerce.actions.ItemDetailsActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)

class ViewItemDetails extends UIInteractions {

    NavigationActions navigation;
    CatalogActions selectItem;
    ItemDetailsActions itemDetails;

    @Test
    void itemDetailsPage(){
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        selectItem.accessItemDetails("Fusion Backpack");
        Assertions.assertThat(itemDetails.itemDetailTitle()).isEqualTo("[Fusion Backpack]");
    }
}
