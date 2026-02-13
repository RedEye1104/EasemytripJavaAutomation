package TestCases;
import base_station.setupdriver;
import org.testng.annotations.Test;
import Pages_xpath.Home_page_Xpath;


public class Home_page_test_cases extends setupdriver
{

    @Test
    public void Test_Home_page() throws InterruptedException
    {
        driver.findElement(Home_page_Xpath.Click_Location).click();

        driver.findElement(Home_page_Xpath.searchLocation).sendKeys("jaipur");

        Thread.sleep(2000);
        driver.findElement(Home_page_Xpath.select_location).click();
        Thread.sleep(5000);
//---------------------------------------------Check In and Check Out---------------------------------------------------

        driver.findElement(Home_page_Xpath.Open_checkIn_date).click();

        driver.findElement(Home_page_Xpath.Click_Month).click();
        driver.findElement(Home_page_Xpath.Select_Month).click();
        driver.findElement(Home_page_Xpath.select_Date).click();

        driver.findElement(Home_page_Xpath.Select_CheckOut_Date).click();

        Thread.sleep(5000);



//--------------------------------------------------Rooms & Guests------------------------------------------------------
        driver.findElement(Home_page_Xpath.Add_Room).click();
        driver.findElement(Home_page_Xpath.Remove_Room).click();
        driver.findElement(Home_page_Xpath.Done).click();

        Thread.sleep(5000);



//------------------------------------------------------Exit Hotel Search Page------------------------------------------
        driver.findElement(Home_page_Xpath.search).click();
        Thread.sleep(5000);

        ListingURL = driver.getCurrentUrl();
       System.out.println(ListingURL);

    }
}
