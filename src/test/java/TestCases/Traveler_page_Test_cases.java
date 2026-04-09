package TestCases;
import Pages_xpath.Traveler_page_Xpath;
import base_station.setupdriver;
import org.testng.annotations.Test;
import Pages_xpath.Listing_Page_Xpath;
import Pages_xpath.Detail_Page_Xpath;

public class Traveler_page_Test_cases extends setupdriver {

    @Test(dependsOnMethods = "Listing_page")
    public void Traveler_page_Test_cases() throws InterruptedException
    {
//----------------------------------------Listing Page section----------------------------------------------------------
        driver.get(ListingURL);

        driver.findElement(Listing_Page_Xpath.Search_hotel).sendKeys("Hotel");
        Thread.sleep(3000);
        driver.findElement(Listing_Page_Xpath.Select_hotel).click();
        driver.findElement(Listing_Page_Xpath.View_Rooms).click();

//-------------------------------------Switch Window Section------------------------------------------------------------
        String parentWindow = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }


//------------------------------------Detail Page Section---------------------------------------------------------------

        driver.findElement(Detail_Page_Xpath.Back_In_Rooms).click();

        driver.findElement(Detail_Page_Xpath.Book_Now).click();

        Thread.sleep(5000);

//--------------------------------------Traveler Page Section-----------------------------------------------------------

        driver.findElement(Traveler_page_Xpath.Dismiss_ad).click();

        String CheckIn_OUT_Detail = driver.findElement(Traveler_page_Xpath.Check_IN_Out_Detail).getText();
        System.out.println("The CheckIN and Check Out Details:-  "+ CheckIn_OUT_Detail);

        String RoomType = driver.findElement(Traveler_page_Xpath.RoomType).getText();
        System.out.println("The Room Type is :-  "+ RoomType);

        String Room_Detail = driver.findElement(Traveler_page_Xpath.Room_Detail).getText();
        System.out.println("The Room Details with the Cancellation details and other Details :-  "+ Room_Detail);

        String Room_price_Detail = driver.findElement(Traveler_page_Xpath.Room_price_detail).getText();
        System.out.println("Room price details with Taxes and coupon code:-  "+ Room_price_Detail);

    //--------------------------------------------Guest Detail section--------------------------------------------------
        driver.findElement(Traveler_page_Xpath.Title).click();

        driver.findElement(Traveler_page_Xpath.Select_title).click();

        driver.findElement(Traveler_page_Xpath.First_Name).sendKeys("Vishal");

        driver.findElement(Traveler_page_Xpath.Last_Name).sendKeys("Kumar");

        driver.findElement(Traveler_page_Xpath.Email_ID).sendKeys("Abcd@gmail.com");

        driver.findElement(Traveler_page_Xpath.Mobile_Number).sendKeys("1234567890");

        driver.findElement(Traveler_page_Xpath.GST_show).click();
        driver.findElement(Traveler_page_Xpath.GST_less).click();

        driver.findElement(Traveler_page_Xpath.Continue_Booking).click();

        Thread.sleep(5000);

    }

}
