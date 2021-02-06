package com.Guru99_2021.testCases;

import com.Guru99_2021.base.BaseClass;
import com.Guru99_2021.pages.LoginPage;
import com.Guru99_2021.utilities.Reporting;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Reporting.class})
public class LoginPageTest extends BaseClass {
    public static LoginPage loginPage;
    public static WebDriver driver;
    public  LoginPageTest(){
        super();
    }
    @BeforeTest
    public void setUp(){
        initialization();
        loginPage=new LoginPage(driver);
    }
    @Test(priority = 0)
    public void testuserIDField(){
        loginPage.setUserIDField(properties.getProperty("userID"));
        logger.info("userID entered");
    }
    @Test(priority = 1)
    public void testpasswordField(){
        loginPage.setPasswordField(properties.getProperty("password"));
        logger.info("password entered");
    }
    @Test(priority = 2)
    public void testloginButton(){
        loginPage.setLoginButton();
        logger.info("login Button successfully clicked");
    }
}
