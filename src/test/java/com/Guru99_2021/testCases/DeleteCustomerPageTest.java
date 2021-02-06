package com.Guru99_2021.testCases;

import com.Guru99_2021.base.BaseClass;
import com.Guru99_2021.pages.DeleteCustomerPage;
import com.Guru99_2021.pages.EditCustomerPage;
import com.Guru99_2021.pages.LoginPage;
import com.Guru99_2021.pages.NewCustomerPage;
import com.Guru99_2021.utilities.Reporting;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by RUTHERFORD on 2/4/2021.
 */
@Listeners({Reporting.class})
public class DeleteCustomerPageTest extends BaseClass {
    public static LoginPage loginPage;
    public static EditCustomerPage editCustomerPage;
    public static NewCustomerPage newCustomerPage;
    public static DeleteCustomerPage deleteCustomerPage;

    public DeleteCustomerPageTest(){
        super();
    }
    @BeforeTest
    public void setUpDelete(){
        initialization();
        loginPage=new LoginPage(driver);
        deleteCustomerPage=new DeleteCustomerPage(driver);
        editCustomerPage=new EditCustomerPage(driver);
        newCustomerPage=new NewCustomerPage(driver);
        loginPage.setUserIDField(properties.getProperty("userID"));
        loginPage.setPasswordField(properties.getProperty("password"));
        loginPage.setLoginButton();
        deleteCustomerPage.setDeleteCustomerButton();
    }
    @Test(priority = 0)
    public void testcustomerID(){
        deleteCustomerPage.setCustomerID("2848");
        logger.info("customer ID entered");
    }
    @Test(priority = 1)
    public void testreset() throws InterruptedException {
        deleteCustomerPage.setResetButton();
        Thread.sleep(5000);
        logger.info("Reset Button clicked");
    }
    @Test(priority = 3)
    public void testcustomerIDS()
    {
        deleteCustomerPage.setCustomerID("6769");
        logger.info("Customer ID re-entered");
    }@Test(priority = 4)
    public void testsubmitButton(){
        deleteCustomerPage.setSubmitButton();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        logger.info("Confirm delete Customer");
        Alert alertfinished=driver.switchTo().alert();
        alertfinished.accept();
        logger.info("Alert accepted");
        logger.info("Customer successfully deleted");
    }
    @Test(priority = 5)
    public void testlogoutButton(){
        deleteCustomerPage.setLogoutButton();
        Alert logoutAlert=driver.switchTo().alert();
        logoutAlert.accept();
        logger.info("Successfully logged out");
    }
}
