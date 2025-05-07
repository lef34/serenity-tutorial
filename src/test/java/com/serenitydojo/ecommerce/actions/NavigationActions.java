package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class NavigationActions extends UIInteractions {

    @Step("Open Web Browser")
    public void openWebPage(String url) {
        openUrl(url);
    }

}
