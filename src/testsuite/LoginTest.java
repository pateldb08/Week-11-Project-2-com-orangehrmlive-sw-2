package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
    @Test
    public void varifyuserSholdLoginSuccessfullyWithValidCredentials(){
        //Find the Username Field Element
        WebElement username = driver.findElement(By.name("username"));
        // Type the Email address to email field element
        username.sendKeys("Admin");
        //Find the Password Field Element and send password on password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Find the Login btn Element and click
        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        loginBtn.click();
        String expectedMessage = "Dashboard";
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        String actualMessage = actualTextElement.getText();  // Finding Dashboard text element and getting the text

        Assert.assertEquals("Signin Unsuccessful", expectedMessage, actualMessage);
    }


}