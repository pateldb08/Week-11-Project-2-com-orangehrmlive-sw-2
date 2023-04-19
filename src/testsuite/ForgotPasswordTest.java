package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "= https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

//    @After
//    public void tearDown() {
//        closeBrowser();
//    }

    @Test
    public void varifyuserShouldNavigateToForgotPasswordPageSuccessfully() {
        //Find Forgot your password link and click on it
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//p[text()='Forgot your password?']"));
        forgotPasswordLink.click();
        //Veryfy Forgot your password link
        String expectedMessage="Forgot your password?";
        WebElement actualTextMessage = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
        String actualMessage = actualTextMessage.getText();
        // verify expected message and actual message
        Assert.assertEquals("Can not Verify 'Forgot your password' text " ,expectedMessage,actualMessage);



    }


}
