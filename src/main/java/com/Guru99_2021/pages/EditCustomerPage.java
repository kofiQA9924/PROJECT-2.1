package com.Guru99_2021.pages;

import com.Guru99_2021.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RUTHERFORD on 2/3/2021.
 */
public class EditCustomerPage extends BaseClass {
    public EditCustomerPage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver,this);
    }

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[3]/a")
    @CacheLookup
    WebElement editCustomerButton;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
    @CacheLookup
    WebElement customerIDField;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    @CacheLookup
    WebElement editsubmitButton;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
    @CacheLookup
    WebElement editMobileNumber;

    @FindBy(xpath = "//input[@name='sub']")
    @CacheLookup
    WebElement submitEditButton;

    public void setEditCustomerButton(){
        editCustomerButton.click();
    }
    public void setCustomerIDField(String cid){
        customerIDField.sendKeys(cid);
    }
    public void setEditsubmitButton() throws InterruptedException {
        editsubmitButton.click();
        Thread.sleep(3000);
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("scrollBy(0,500)");
        Thread.sleep(3000);
    }
    public void setEditMobileNumber(String cMobile){
        editMobileNumber.sendKeys(cMobile);
    }
    public void setSubmitEditButton(){
        submitEditButton.click();
    }
}
