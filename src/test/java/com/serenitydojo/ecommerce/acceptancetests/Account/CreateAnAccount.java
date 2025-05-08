package com.serenitydojo.ecommerce.acceptancetests.Account;

import com.serenitydojo.ecommerce.actions.AccountActions;
import com.serenitydojo.ecommerce.actions.NavigationActions;
import com.serenitydojo.ecommerce.actions.SignInActions;
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
    SignInActions signInActions;

    @Test
    void accountCreation() {
    navigation.openWebPage("https://magento.softwaretestingboard.com/");
    accountactions.createAccount();
    accountactions.addFirstName("Raclaw");
    accountactions.addLastName("Gorwski");
    accountactions.addEmail("Raclaw@gmail.com");
    accountactions.addPassword("ghq34F4ge!", "ghq34F4ge!");
    accountactions.clickCreateAccount();
    Ensure.that(accountactions.successfulRegistration()).isEqualTo("Thank you for registering with Main Website Store.");
    }

    @Test
    void LogIn(){
        navigation.openWebPage("https://magento.softwaretestingboard.com/");
        signInActions.signIn();
        signInActions.signInEmail("Raclaw@gmail.com");
        signInActions.signInPassword("ghq34F4ge!");
        signInActions.clickSignInButton();
        signInActions.signOut();
    }
}
