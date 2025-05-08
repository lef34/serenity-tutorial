package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractions;

public class SearchResultPage extends PageObject {

    public String titleCheck(){
        return find(".page-title").getText();
    }
}
