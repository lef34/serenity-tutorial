package com.serenitydojo.ecommerce.acceptancetests.KeyboardTests;

import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.actions.SearchResultPage;
import com.serenitydojo.ecommerce.actions.TypeActions;
import net.serenitybdd.core.steps.UIInteractions;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ClickTest extends UIInteractions {

    NavigationActions navigation;
    TypeActions inputText;
    SearchResultPage searchResultPage;


    //Type item name in Searchbar
    @Test
    public void searchItemByTyping(){
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        inputText.enterMessage("Hero Hoodie");
        String pageTitle = searchResultPage.titleCheck();
        Assertions.assertThat(pageTitle).isEqualTo("Search results for: 'Hero Hoodie'");
    }
}
