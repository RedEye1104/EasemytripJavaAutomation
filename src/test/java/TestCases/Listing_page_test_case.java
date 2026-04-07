package TestCases;
import base_station.setupdriver;
import org.testng.annotations.Test;
import Pages_xpath.Listing_Page_Xpath;


public class Listing_page_test_case extends setupdriver{

    @Test(dependsOnMethods = "Test_Home_page")
    public void Listing_page() throws InterruptedException{
        driver.get(ListingURL);

        Thread.sleep(2000);

        driver.findElement(Listing_Page_Xpath.click_popularity).click();

        Thread.sleep(3000);

        driver.findElement(Listing_Page_Xpath.Select_low_to_high).click();

        driver.findElement(Listing_Page_Xpath.Click_Last_Minutes_Deals).click();

        driver.findElement(Listing_Page_Xpath.Reset_all_Filter).click();

        driver.findElement(Listing_Page_Xpath.Search_hotel).sendKeys("Hotel");

        Thread.sleep(2000);

        driver.findElement(Listing_Page_Xpath.Select_hotel).click();

       String Hotel_Name =  driver.findElement(Listing_Page_Xpath.Hotel_name).getText();
       System.out.println("Selected Hotel Name is :-  "+Hotel_Name);

       String Hotel_price =  driver.findElement(Listing_Page_Xpath.Hotel_price).getText();
       System.out.println("Selected Hotel Price is :-  "+Hotel_price);


        driver.findElement(Listing_Page_Xpath.View_Rooms).click();

        Thread.sleep(3000);


        DetailPage_URL = driver.getCurrentUrl();
        System.out.println(" This is The DetailPage URL:-    " + DetailPage_URL);


    }
}
