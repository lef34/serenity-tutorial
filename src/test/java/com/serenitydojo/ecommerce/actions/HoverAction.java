package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;

public class HoverAction extends UIInteractions {

    @Step("Check Hover action")
    public void checkHoverAction(int number){
        WebElementFacade element = find(".(#ui-id-7)");

    }
}
