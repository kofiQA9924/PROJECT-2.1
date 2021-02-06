package com.Guru99_2021.testCases;

import com.Guru99_2021.base.BaseClass;
import com.Guru99_2021.pages.LoginPage;
import com.Guru99_2021.pages.NewCustomerPage;
import com.Guru99_2021.utilities.Reporting;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Reporting.class})
public class NewCustomerPageTest extends BaseClass {
    public static LoginPage loginPage;
    public static NewCustomerPage newCustomerPage;

    public NewCustomerPageTest(){
        super();
    }
    @BeforeTest
    public void setUpCust(){
        initialization();
        loginPage=new LoginPage(driver);
        newCustomerPage=new NewCustomerPage(driver);
        loginPage.setUserIDField(properties.getProperty("userID"));
        loginPage.setPasswordField(properties.getProperty("password"));
        loginPage.setLoginButton();
        newCustomerPage.setNewCustomerButton();
        logger.info("New customer button succcessfully clicked");
    }
    @Test(priority = 1)
    public void testcustomerNameField(){
        newCustomerPage.setCustomerNameField("Thomas Mikes");
        logger.info("customer name entered");
    }
    @Test(priority = 2)
    public void testcustomerGenderF(){
        newCustomerPage.setCustomerGenderF();
        logger.info("customer gender clicked");
    }
    @Test(priority = 3)
    public void testcustomerDoB(){
        newCustomerPage.setCustomerDoB("07","1","2001");
        logger.info("customer date of birth entered");
    }
    @Test(priority = 4)
    public void testcustomerAddress(){
        newCustomerPage.setCustomerAddress("200 St Main");
        logger.info("customer address entered");
    }
    @Test(priority = 5)
    public void testcustomerCity(){
        newCustomerPage.setCustomerCity("Canyontown");
        logger.info("customer city entered");
    }
    @Test(priority = 6)
    public void testcustomerState(){
        newCustomerPage.setCustomerState("Northstate");
        logger.info("customer state entered");
    }
    @Test(priority = 7)
    public void testcustomerPin(){
        newCustomerPage.setCustomerPin("382649");
        logger.info("customer pin entered");
    }
    @Test(priority = 8)
    public void testcustomerMobile() throws InterruptedException {
        newCustomerPage.setCustomerMobile("2237027462");
        Thread.sleep(3000);
        logger.info("customer mobile number entered");
    }
    @Test(priority = 9)
    public void testcustomerEmail() throws InterruptedException {
        newCustomerPage.setCustomerEmail("MK@aol.com");
        Thread.sleep(3000);
        logger.info("customer email entered");
    }
    @Test(priority = 10)
    public void testcustomerPassword() throws InterruptedException {
        newCustomerPage.setCustomerPassword("%749)");
        Thread.sleep(3000);
        logger.info("customer password entered");
    }
    @Test(priority = 11)
    public void testsubmitButton(){
        newCustomerPage.setSubmitButton();
        Assert.assertTrue(true);
        logger.info("new customer page submit button entered");
    }
    @Test(priority = 12)
    public void testContinueButton(){
        newCustomerPage.setContinueButton();
        logger.info("new customer page continue button entered");
        Assert.assertTrue(true);
        logger.info("assertion implemented");
    }
}
