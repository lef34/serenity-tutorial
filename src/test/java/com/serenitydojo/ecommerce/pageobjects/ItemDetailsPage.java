package com.serenitydojo.ecommerce.pageobjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ItemDetailsPage extends PageObject {

    @FindBy(css = "button[title='Add to Cart']")
    WebElementFacade addToCardButton;

    @FindBy(css = ".loader")
    WebElementFacade spinner;

    public void addToCart(){
        addToCardButton.click();
        spinner.waitUntilNotVisible();
    }
}
