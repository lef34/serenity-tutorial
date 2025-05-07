package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

import java.util.List;

public class ToolBarAction extends UIInteractions {

   @Step("Toolbar Items Check")
    public List<String> toolBarItems() {
        return findAll("//nav[@class='navigation' and @data-action='navigation']//a[contains(@class, 'level-top ui-corner-all')]").texts();
    }
}
