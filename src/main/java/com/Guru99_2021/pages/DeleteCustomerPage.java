package com.Guru99_2021.pages;

import com.Guru99_2021.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RUTHERFORD on 2/4/2021.
 */
public class DeleteCustomerPage extends BaseClass {
    public DeleteCustomerPage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver,this);
    }
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[4]/a")
    @CacheLookup
    WebElement deleteCustomerButton;

    @FindBy(xpath = "//input[@name='cusid']")
    @CacheLookup
    WebElement customerID;

    @FindBy(xpath = "//input[@name='res']")
    @CacheLookup
    WebElement resetButton;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    @CacheLookup
    WebElement submitButton;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
    @CacheLookup
    WebElement logoutButton;

    public void setDeleteCustomerButton(){
        deleteCustomerButton.click();
    }
    public void setCustomerID(String cids){
        customerID.sendKeys(cids);
    }
    public void setResetButton(){
        resetButton.click();
    }
    public void setSubmitButton(){
        submitButton.click();
    }
    public void setLogoutButton(){
        logoutButton.click();
    }
}
