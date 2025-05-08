package com.serenitydojo.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.ui.Link;
import org.openqa.selenium.By;

public class AccountActions extends PageObject {

    @Step("Click on Create an Account option")
    public void createAccount(){
        find(Link.withText("Create an Account")).click();
    }

    @Step("Add First Name")
    public void addFirstName(String firstname){
        find(InputField.withLabel("First Name")).type(firstname);
    }

    @Step("Add Last Name")
    public void addLastName(String lastname){
        find(InputField.withLabel("Last Name")).type(lastname);
    }

    @Step("Add Email")
    public void addEmail(String email){
        //String email = randomEmail();
        find(InputField.withLabel("Email")).type(email);
    }

    private String randomEmail(){
        return "joeDon.test" + System.currentTimeMillis() + "@example.com";
    }

    @Step("Add Password")
    public void addPassword(String password, String confirmedpassword){
        find(InputField.withLabel("Password")).type(password);
        if (confirmedpassword != password){
            throw new IllegalArgumentException("Please enter the same value in fields password and confirmed password.");
        }
        find(InputField.withLabel("Confirm Password")).type(confirmedpassword);
    }

    @Step("Click on Create Account button")
    public void clickCreateAccount(){
        find(Button.withText("Create an Account")).click();
    }

    public String successfulRegistration(){
        return find(By.xpath("//div[contains(text(),'Thank you for registering with Main Website Store.')]")).getText();
    }
}
