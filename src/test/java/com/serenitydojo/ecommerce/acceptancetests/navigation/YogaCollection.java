package com.serenitydojo.ecommerce.acceptancetests.navigation;

import com.serenitydojo.ecommerce.actions.MenuActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityAfterEachCallback;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.ui.Button;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SerenityAfterEachCallback.class)
public class YogaCollection extends UIInteractions {

    NavigationActions navigation;
    MenuActions menuActions;

    @Test
    void shopNewYoga(){

        //Open the web page
        navigation.openWebPage("https://magento.softwaretestingboard.com/");

        //Select the button Shop New Yoga
        //find(Button.withText("Shop New Yoga")).click();
        menuActions.clickOnShopNewYoga();

        //Verify that the text is correct
        //Assertions.assertThat(menuActions.checkPageTitle()).isEqualTo("New Luma Yoga Collection");
        String pageTitle = find(By.xpath("//span[contains(text(),'New Luma Yoga Collection')]")).getText();
        assertThat(pageTitle).isEqualTo("New Luma Yoga Collection");
    }
}
