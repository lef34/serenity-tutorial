package com.serenitydojo.ecommerce.acceptancetests.searchbar;


import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ui.Button;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import java.awt.*;

@ExtendWith(SerenityJUnit5Extension.class)
class SearchTabTest extends UIInteractions {

    NavigationActions navigation;
    //Purpose of this test is to GET web elements by ID
    @Test()
    void selectingSearchBar(){

        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        //find(By.id("search")).type("Hero Hoodie");
        find("#search").type("Hero Hoodie");
        find(Button.withText("Search")).click();
    }

}
