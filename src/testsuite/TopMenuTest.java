package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Write down the following test into ‘TopMenuTest’ class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * 4.userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5.userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */


public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Find the computer link and click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//a[@href = '/computers']")).click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Find the Electronics link and click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//a[@href = '/electronics']")).click();
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Find the Apparel page and click on the ‘Apparel page’ Tab
        driver.findElement(By.xpath("//a[@href = '/apparel']")).click();
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Find the  Digital Downloads page and click on the ‘Digital Downloads page’ Tab
        driver.findElement(By.xpath("//a[@href = '/digital-downloads']")).click();
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Find the  Navigate To Books page and click on the ‘Navigate To Books page’ Tab
        driver.findElement(By.xpath("//a[@href = '/books']")).click();
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // Find the  Navigate To Jewelry page and click on the ‘Navigate To Jewelry page’ Tab
        driver.findElement(By.xpath("//a[@href = '/jewelry']")).click();
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // Find the  Navigate To GiftCards page and click on the ‘Navigate To GiftCards  page’ Tab
        driver.findElement(By.xpath("//a[@href = '/jewelry']")).click();
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals( expectedText, actualText);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}


