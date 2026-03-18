package TestCases;
import Pages_xpath.Detail_Page_Xpath;
import base_station.setupdriver;
import org.testng.annotations.Test;
import Pages_xpath.Listing_Page_Xpath;
import org.testng.Assert;




public class Detail_Page_test_case extends setupdriver {

    @Test(dependsOnMethods = "Listing_page")
    public void Detail_page() throws InterruptedException {
        driver.get(ListingURL);
        Thread.sleep(2000);

        driver.findElement(Listing_Page_Xpath.Search_hotel).sendKeys("Spree Hotel Jaipur");
        driver.findElement(Listing_Page_Xpath.Select_hotel).click();
        driver.findElement(Listing_Page_Xpath.View_Rooms).click();

        Thread.sleep(5000);




        String parentWindow = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }



        String Hotel_summary = driver.findElement(Detail_Page_Xpath.hotel_summary).getText();
        System.out.println("Hotel Summary: " + Hotel_summary);

        String Hotel_Name = driver.findElement(Detail_Page_Xpath.Hotel_Name).getText();
        System.out.println("Hotel Name: " + Hotel_Name);

        String Price_per_Night = driver.findElement(Detail_Page_Xpath.Price_per_night).getText();
        System.out.println("Per Night Price is : " + Price_per_Night);

        driver.findElement(Detail_Page_Xpath.Select_Room).click();
        Thread.sleep(5000);

        String Room_type = driver.findElement(Detail_Page_Xpath.Room_type).getText();
        System.out.println("Room Type is : " + Room_type);

        String Room_Benefit =  driver.findElement(Detail_Page_Xpath.Benefit).getText();
        System.out.println("Room Benefit is : " + Room_Benefit);

        String Price_type_Section = driver.findElement(Detail_Page_Xpath.Price_per_Night_typeSection).getText();
        System.out.println("Price per Night type section is : " + Price_type_Section);

        Assert.assertEquals(Price_per_Night, Price_type_Section,"Both Price is not Matched..");

        driver.findElement(Detail_Page_Xpath.Click_overview).click();

        driver.findElement(Detail_Page_Xpath.ViewMore_Options).click();

        driver.findElement(Detail_Page_Xpath.Back_In_Rooms).click();

        driver.findElement(Detail_Page_Xpath.Book_Now).click();

        Thread.sleep(5000);






















    }
   }

// assert in Base price and Base price in detail section. Both price should bi match.