package com.serenitydojo.ecommerce.acceptancetests.Account;

import com.serenitydojo.ecommerce.actions.AccountActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.Link;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

@ExtendWith(SerenityJUnit5Extension.class)
public class CreateAnAccount extends UIInteractions {

    NavigationActions navigation;
    AccountActions accountactions;

    @Test
    void accountCreation() {
    navigation.openWebPage("https://magento.softwaretestingboard.com/");
    accountactions.createAccount();
    accountactions.addFirstName("John");
    accountactions.addLastName("Doe");
    accountactions.addEmail();
    accountactions.addPassword("ghq34F4ge!", "ghq34F4ge!");
    accountactions.clickCreateAccount();
    Ensure.that(accountactions.successfulRegistration()).isEqualTo("Thank you for registering with Main Website Store.");
    }
}
