package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SauceScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement TextFieldUser;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement TextFielPass;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement textValidation;

    @AndroidFindBy(xpath ="(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]/android.view.ViewGroup")
    private WebElement cardProductos;

    public void typeUserAndPass(String user ,String pass){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TextFieldUser.click();
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TextFieldUser.sendKeys(user);
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TextFielPass.click();
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TextFielPass.sendKeys(pass);
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        btnLogin.click();
    }

    public  String validarText(){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return  textValidation.getText();
    }

    public int getItemSize(){
        List <WebElement> items = Collections.singletonList(cardProductos);
        return  items.size();
    }


}
