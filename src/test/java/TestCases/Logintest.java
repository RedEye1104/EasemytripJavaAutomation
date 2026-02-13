package TestCases;
import Pages_xpath.Login_Page_Xpath;
import org.testng.annotations.Test;
import base_station.setupdriver;

public class Logintest extends setupdriver {
    @Test
    public void testLogin_page() throws InterruptedException {

    driver.findElement(Login_Page_Xpath.Login).click();

    driver.findElement(Login_Page_Xpath.customer_login).click();

    driver.findElement(Login_Page_Xpath.Enter_Email).sendKeys("vishuchauhan11042000@gmail.com");

    driver.findElement(Login_Page_Xpath.Continue).click();

    Thread.sleep(2000);

    driver.findElement(Login_Page_Xpath.Enter_password).sendKeys("Tech@2000");

    driver.findElement(Login_Page_Xpath.Complete_Login).click();

    Thread.sleep(5000);

    }
}
