package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Link;
import org.openqa.selenium.By;

public class SignInActions extends UIInteractions {

    @Step("Click Sign In button")
    public void signIn(){
        //Click Sign In
        find(By.xpath("//li[@data-label='or']//a")).click();
    }

    public void signInEmail(String email){
        //Add Email
        find(By.xpath("//input[@id='email']")).type(email);
    }

    public void signInPassword(String password){
        //Add Password
        find(By.xpath("//input[@name='login[password]']")).type(password);
    }

    public void clickSignInButton(){
        //Click Sign In
        find(By.xpath("*//button[@class='action login primary']")).click();
    }

    public void signOut(){
        //Sign Out
        find(By.xpath("//button[@data-action='customer-menu-toggle']")).click();
        $(Link.withText("Sign Out")).click();
    }
}
