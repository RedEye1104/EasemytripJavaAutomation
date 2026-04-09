package Pages_xpath;
import org.openqa.selenium.By;

public class Traveler_page_Xpath {

//----------------------------------------------------Hotel Detail Section----------------------------------------------

    public static By Dismiss_ad =By.xpath("/html/body/app-root/div/app-hotel-traveller/div[3]/div/div[1]");

    public static By Check_IN_Out_Detail = By.xpath("//*[@id=\"divHotelDetails\"]/form/div/div[1]/div/div/div[1]/review-hotel-itinerary-desktop/div/div[4]/div[1]");

    public static By RoomType = By.xpath("//*[@id=\"divHotelDetails\"]/form/div/div[1]/div/div/div[1]/review-hotel-itinerary-desktop/div/div[4]/div[2]/div[1]/div[1]/h5");

    public static By Room_Detail = By.xpath("//*[@id=\"divHotelDetails\"]/form/div/div[1]/div/div/div[1]/review-hotel-itinerary-desktop/div/div[4]/div[2]/div[1]");

   // public static By cancellation_policy = By.xpath("");

    public static By Room_price_detail = By.xpath("//*[@id=\"sidebar\"]/div/div/review-price-summary-desktop/div");

//----------------------------------------------------Guest Details Section---------------------------------------------

    public static By Title = By.xpath("//*[@id=\"guestDetails\"]/div[3]/div[2]/div[2]/div[2]/span/select");

    public static By Select_title = By.xpath("//*[@id=\"guestDetails\"]/div[3]/div[2]/div[2]/div[2]/span/select/option[1]");

    public static By First_Name = By.xpath("//*[@id=\"guestDetails\"]/div[3]/div[2]/div[2]/div[3]/input");

    //public static By Enter_first_Name = By.xpath("//*[@id=\"guestDetails\"]/div[3]/div[2]/div[2]/div[3]/input");

    public static By Last_Name = By.xpath("//*[@id=\"guestDetails\"]/div[3]/div[2]/div[2]/div[4]/input");

    public static By Email_ID = By.xpath("//*[@id=\"guestDetails\"]/div[3]/div[3]/div[1]/input");

    public static By Mobile_Number = By.xpath("//*[@id=\"guestDetails\"]/div[3]/div[3]/div[2]/input[1]");

    public static By GST_show = By.xpath("//*[@id=\"divHotelDetails\"]/form/div/review-gst-details-desktop/div/div");

    public static By GST_less = By.xpath("//*[@id=\"divHotelDetails\"]/form/div/review-gst-details-desktop/div/div");

    public static By Continue_Booking =  By.xpath("//*[@id=\"divHotelDetails\"]/form/div/div[8]/button");


    
}
