package com.serenitydojo.ecommerce.acceptancetests.searchbar;


import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.actions.SearchActions;
import com.serenitydojo.ecommerce.actions.SearchResultPage;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ui.Button;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class SearchTabTest extends UIInteractions {

    @Steps
    NavigationActions navigation;
    SearchActions search;
    SearchResultPage searchResultPage;

    //Purpose of this test is to GET web elements by ID
    @Test()
    void selectingSearchBar(){

        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        //find(By.id("search")).type("Hero Hoodie");
        search.searchProduct("Hero Hoodie");
        search.clickSearch();
        String pageTitle = searchResultPage.titleCheck();
        assertThat(pageTitle).isEqualTo("Search results for: 'Hero Hoodie'");
    }

}
