package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class DropDownActions extends UIInteractions {

    @Step("Select drop down button")
    public void selectDropDown(){
        find(By.xpath("//div[contains(text(), 'Style')]")).click();
    }

    @Step("Check subcategory is present")
    public String checkSubCategory() {
        return find(By.xpath("//a[contains(text(), 'Duffel')]")).getText();
    }
}
