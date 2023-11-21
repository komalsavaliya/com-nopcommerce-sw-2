package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Create the package ‘testsuite’ and create the following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. TopMenuTest
 * 3. RegisterTest
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

public class LoginTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //Find The login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        //Find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Not redirected to Login page", expectedText, actualText);
    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {
        //Click on Login Button
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Enter the Email Field Type the Email address to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("maryjohn@gmail.com");

        //Find the password field and type the password to password field
        driver.findElement(By.name("Password")).sendKeys("123456");

        //Find the login button element and click
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

        //Verify the logout text is display
        String expectedText = "Log out";
        String actualText = driver.findElement(By.className("ico-logout")).getText();
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);
    }

    @Test
    public void verifyErrorMessage() {
        //Find the login link and click on login link
        driver.findElement(By.linkText("Log in")).click();


        //Find the email field type the email address to email field
        driver.findElement(By.id("Email")).sendKeys("johnmarry@gmail.com");


        //Find the password field and type the password to password field
        driver.findElement(By.name("Password")).sendKeys("245563");

        //Find the login button element and click
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again." +
                "No customer account found1";
        //Find the errorMessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }
    @After
    public void tearDown(){
        closeBrowser();
   }


}






