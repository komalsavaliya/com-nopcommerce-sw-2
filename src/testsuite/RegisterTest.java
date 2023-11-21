package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 5. Write down the following test into ‘RegisterTest’ class
 * 1. userShouldNavigateToRegisterPageSuccessfully
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * *  Enter Confirm password
 * * Verify the text 'Your registration completed’
 */

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Find the  Navigate To Register page and click on the ‘Navigate To Register  page’ Tab
        driver.findElement(By.className("ico-register")).click();
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        driver.findElement(By.className("ico-register")).click();//Click on Register link
        driver.findElement(By.xpath("//input[@id = 'gender-female']")).click();//Select gender radio button
        driver.findElement(By.xpath("//input[@id  = 'FirstName']")).sendKeys("Mary");//Enter First name
        driver.findElement(By.xpath("//input[@id  = 'LastName']")).sendKeys("John");//Enter Last name
        //Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("6");
        //driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']//option[text() = '6']")).click();
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("June");
        // driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']//option[text() = 'June']")).click();
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1966");
        //driver.findElement(By.xpath("//select[@name ='DateOfBirthYear']//option[text() = '1966']")).click();
        driver.findElement(By.id("Email")).sendKeys("maryjohn@gmail.com");//Enter Email address
       // driver.findElement(By.xpath("//input[@id ='Email']")).sendKeys("maryjohn@gmail.com");
       driver.findElement(By.id("Password")).sendKeys("123456");// Enter Password
        //driver.findElement(By.xpath("//input[@id ='Password']")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");// Enter Confirm password
        //driver.findElement(By.xpath("//input[@id ='ConfirmPassword']")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();// Verify the text 'Your registration completed’
        //driver.findElement(By.xpath("//button[@id = 'register-button']")).click();

    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}


