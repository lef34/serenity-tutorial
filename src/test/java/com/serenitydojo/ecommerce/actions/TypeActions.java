package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;

public class TypeActions extends PageObject {
    public void enterMessage(String message){
        find("#search").sendKeys(message, Keys.ENTER);
    }
}
