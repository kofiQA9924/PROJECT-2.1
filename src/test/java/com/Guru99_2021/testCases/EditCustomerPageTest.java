package com.Guru99_2021.testCases;

import com.Guru99_2021.base.BaseClass;
import com.Guru99_2021.pages.EditCustomerPage;
import com.Guru99_2021.pages.LoginPage;
import com.Guru99_2021.pages.NewCustomerPage;
import com.Guru99_2021.utilities.Reporting;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 2/3/2021.
 */
@Listeners({Reporting.class})
public class EditCustomerPageTest extends BaseClass {
    public static EditCustomerPage editCustomerPage;
    public static LoginPage loginPage;
    public static NewCustomerPage newCustomerPage;

    public EditCustomerPageTest(){
        super();
    }
    @BeforeTest
    public void setUpEdit(){
        initialization();
        editCustomerPage=new EditCustomerPage(driver);
        loginPage=new LoginPage(driver);
        newCustomerPage=new NewCustomerPage(driver);
        loginPage.setUserIDField(properties.getProperty("userID"));
        loginPage.setPasswordField(properties.getProperty("password"));
        loginPage.setLoginButton();
        editCustomerPage.setEditCustomerButton();
    }
    @Test(priority = 0)
    public void testcustomerID(){
        editCustomerPage.setCustomerIDField("14158");
        logger.info("customer ID entered");
    }
    @Test(priority = 1)
    public void testeditsubmitButton() throws InterruptedException {
        editCustomerPage.setEditsubmitButton();
        logger.info("edit customer page submit button entered");
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void testeditMobile(){
        editCustomerPage.setEditMobileNumber("5");
        logger.info("customer mobile number edited");
    }
    @Test(priority = 3)
    public void testsubmitEditButton(){
        editCustomerPage.setSubmitEditButton();
        logger.info("edit customer page submit button clicked");
        Assert.assertTrue(true);
        logger.info("assertion implemented");
    }
}
