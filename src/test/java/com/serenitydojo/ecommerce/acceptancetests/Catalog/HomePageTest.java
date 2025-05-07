package com.serenitydojo.ecommerce.acceptancetests.Catalog;

import com.serenitydojo.ecommerce.actions.MenuActions;
import com.serenitydojo.ecommerce.actions.ToolBarAction;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.serenitydojo.ecommerce.actions.NavigationActions;

@ExtendWith(SerenityJUnit5Extension.class)

class HomePageTest extends UIInteractions {

    MenuActions menuActions;
    ToolBarAction menuItems;
    NavigationActions navigation;

    @Test
    void TitleDisplayCheck() {
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        Assertions.assertThat(menuActions.checkPageTitle()).isEqualTo("Home Page");
    }

    @Test
    void ToolBarItemsCheck(){
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
    //Maybe make the xPath more specific (currently it identifies 6 out of 6 of the necessary values)?
        Assertions.assertThat(menuItems.toolBarItems()).contains("What's New", "Women", "Men", "Gear", "Training", "Sale");
    }
}
