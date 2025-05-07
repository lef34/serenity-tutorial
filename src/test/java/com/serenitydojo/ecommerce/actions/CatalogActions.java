package com.serenitydojo.ecommerce.actions;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Link;

public class CatalogActions extends UIInteractions {

    @Step("Access item details for '{0}'")
    public void accessItemDetails(String itemName){
        find(Link.withText(itemName)).click();
        //find(By.linkText("Fusion Backpack"));
    }
}
