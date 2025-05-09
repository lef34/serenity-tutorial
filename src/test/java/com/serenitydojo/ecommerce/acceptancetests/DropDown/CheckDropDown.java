package com.serenitydojo.ecommerce.acceptancetests.DropDown;

import com.serenitydojo.ecommerce.actions.DropDownActions;
import com.serenitydojo.ecommerce.actions.MenuActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.core.steps.UIInteractions;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckDropDown extends UIInteractions {

    MenuActions menuActions;
    NavigationActions navigation;
    DropDownActions dropDown;

    @Test
    public void clickDropDown(){

        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        menuActions.clickOnShopNewYoga();
        dropDown.selectDropDown();
        String subCategory = dropDown.checkSubCategory();
        Assertions.assertThat(subCategory).contains("Duffel");
    }
}
