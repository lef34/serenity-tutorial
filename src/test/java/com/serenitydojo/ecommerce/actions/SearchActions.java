package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Button;

public class SearchActions extends UIInteractions {

    @Step("Search for item {0}")
    public void searchProduct(String productName){
        find("#search").type(productName);
    }

    @Step("Click search button")
    public void clickSearch(){
        find(Button.withText("Search")).click();
    }
}
