package TestCases;
import Pages_xpath.Login_Page_Xpath;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import base_station.setupdriver;
import utilities.ConfigReader;


public class Logintest extends setupdriver {

    private static final Logger log =
            LogManager.getLogger(Logintest.class);

    @Test
    public void testLogin_page() throws InterruptedException {

    driver.findElement(Login_Page_Xpath.Login).click();
    log.info("clicking on Login page");

    driver.findElement(Login_Page_Xpath.customer_login).click();

    driver.findElement(Login_Page_Xpath.Enter_Email).sendKeys(ConfigReader.getProperty("email"));

    driver.findElement(Login_Page_Xpath.Continue).click();

    Thread.sleep(2000);

    driver.findElement(Login_Page_Xpath.Enter_password).sendKeys(ConfigReader.getProperty("password"));

    driver.findElement(Login_Page_Xpath.Complete_Login).click();

    Thread.sleep(5000);

    }
}
