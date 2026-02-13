package TestCases;
import base_station.setupdriver;
import org.testng.annotations.Test;
import Pages_xpath.Listing_Page_Xpath;
import TestCases.Home_page_test_cases;

public class Listing_page_test_case extends setupdriver{

    @Test(dependsOnMethods = "Test_Home_page")
    public void Listing_page() throws InterruptedException{
        driver.get(ListingURL);

        driver.findElement(Listing_Page_Xpath.close_ads).click();

        driver.findElement(Listing_Page_Xpath.Search_hotel).sendKeys("Spree Hotel Jaipur");
        driver.findElement(Listing_Page_Xpath.Select_hotel).click();

        driver.findElement(Listing_Page_Xpath.click_popularity).click();

        driver.findElement(Listing_Page_Xpath.Click_Last_Minutes_Deals).click();

        driver.findElement(Listing_Page_Xpath.Reset_all_Filter).click();

        driver.findElement(Listing_Page_Xpath.Hotel_name).getText();

        driver.findElement(Listing_Page_Xpath.Hotel_price).getText();

        driver.findElement(Listing_Page_Xpath.View_Rooms).click();
        Thread.sleep(3000);


    }
}
