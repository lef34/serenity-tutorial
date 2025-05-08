package com.serenitydojo.ecommerce.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageComponent;

public class ShoppingCardComponent extends PageComponent {

    public void showCartSummary() {
        find(".showcart").click();
    }

    public void clickProceedToCheckout(){
        find("#top-cart-btn-checkout").click();
    }
}
