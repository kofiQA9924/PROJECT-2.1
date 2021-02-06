package com.Guru99_2021.pages;

import com.Guru99_2021.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
    public LoginPage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver,this);
    }
    @FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
    @CacheLookup
    WebElement userIDField;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
    @CacheLookup
    WebElement passwordField;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
    @CacheLookup
    WebElement loginButton;

    public void setUserIDField(String uID){
        userIDField.sendKeys(uID);
    }
    public void setPasswordField(String pswd){
        passwordField.sendKeys(pswd);
    }
    public void setLoginButton(){
        loginButton.click();
    }
}
