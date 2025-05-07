package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class MenuActions extends UIInteractions {
    
    @Step("Check page title")
    public String checkPageTitle(){
        return getTitle();
    }

    @Step("Click Shop New Yoga option")
    public void clickOnShopNewYoga(){
        elementWithText("Shop New Yoga").click();
    }

    private WebElementFacade elementWithText(String text) {
        return findBy("//span[.='{0}']", text);
    }
}
