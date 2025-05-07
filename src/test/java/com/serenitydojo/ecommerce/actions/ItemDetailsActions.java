package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class ItemDetailsActions extends UIInteractions {

    public String itemDetailTitle(){
       return findAll("//span[@data-ui-id = 'page-title-wrapper']").texts().toString();
    }

    public WebElementState itemImage(String itemDetailName) {
        return find(By.cssSelector(".fotorama__stage__frame  img[alt='" + itemDetailName + "']"));
    }

    @Step("Examine page title via CSS selector")
    public String itemClass(){
        return find(".page-title").getText();
    }
}
