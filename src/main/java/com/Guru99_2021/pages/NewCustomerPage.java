package com.Guru99_2021.pages;

import com.Guru99_2021.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewCustomerPage extends BaseClass{

    public NewCustomerPage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver,this);
    }
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
    @CacheLookup
    WebElement newCustomerButton;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
    @CacheLookup
    WebElement customerNameField;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
    @CacheLookup
    WebElement customerGenderM;

    @FindBy(xpath = "//*[@id=\"dob\"]")
    @CacheLookup
    WebElement customerDoB;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
    @CacheLookup
    WebElement customerAddress;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
    @CacheLookup
    WebElement customerCity;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
    @CacheLookup
    WebElement customerState;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
    @CacheLookup
    WebElement customerPin;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
    @CacheLookup
    WebElement customerMobile;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
    @CacheLookup
    WebElement customerEmail;

    @FindBy(xpath = "//input[@name='password']")
    @CacheLookup
    WebElement customerPassword;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
    @CacheLookup
    WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"customer\"]/tbody/tr[14]/td/a")
    @CacheLookup
    WebElement continueButton;


    public void setNewCustomerButton(){
        newCustomerButton.click();
    }
    public void setCustomerNameField(String cname){
        customerNameField.sendKeys(cname);
    }
    public void setCustomerGenderF(){
        customerGenderM.click();
    }
    public void setCustomerDoB(String mm,String dd,String yyyy){
        customerDoB.sendKeys(mm);
        customerDoB.sendKeys(dd);
        customerDoB.sendKeys(yyyy);
    }
    public void setCustomerAddress(String caddress){
        customerAddress.sendKeys(caddress);
    }
    public void setCustomerCity(String ccity){
        customerCity.sendKeys(ccity);
    }
    public void setCustomerState(String cstate){
        customerState.sendKeys(cstate);
    }
    public void setCustomerPin(String cpin){
        customerPin.sendKeys(cpin);
    }
    public void setCustomerMobile(String cmobile){
        customerMobile.sendKeys(cmobile);
    }
    public void setCustomerEmail(String cemail){
        customerEmail.sendKeys(cemail);
    }
    public void setCustomerPassword(String cpswd){
        //wait.until(ExpectedConditions.visibilityOf(customerPassword)).sendKeys(cpwd);
        customerPassword.sendKeys(cpswd);
    }
    public void setSubmitButton(){
        submitButton.click();
    }
    public void setContinueButton(){
        continueButton.click();
    }
}
