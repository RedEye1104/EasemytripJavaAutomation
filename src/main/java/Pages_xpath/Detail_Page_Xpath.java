package Pages_xpath;

import org.openqa.selenium.By;


public class Detail_Page_Xpath {

    // print Hotel information in summary.
    public static By hotel_summary = By.xpath("//*[@class=\"txt-cap ng-tns-c3393003408-1\"]");
    //Print hotel name.
    public static By Hotel_Name = By.xpath("//*[@class=\"headcol mgr15 ng-tns-c1919069590-2\"]");

    //Print Base price per night
    public static By Price_per_night = By.xpath("/html/body/app-root/div/hotel-details/div[1]/div/image-slider/div/div[2]/div[2]/div[1]/div[2]/span[1]");

    // Click on Select Room option
    public static By Select_Room = By.xpath("//*[@class=\"ouline-btn ng-tns-c1919069590-2\"]");

    //print Room Type
    public static By Room_type = By.xpath("//*[@id=\"2\"]/div[2]/div[1]/div/h4");

    //Print Room Benefit
    public static By Benefit = By.xpath("//*[@id=\"2\"]/div[2]/div[2]/div[1]/div[1]/div");

    //Print price per night from room detail section
    public static By Price_per_Night_typeSection = By.xpath("//*[@id=\"prcUserDiv0_0\"]/div[3]/div[2]");

    //Click on Overview
    public static By Click_overview = By.xpath("//*[@id=\"mainNav\"]/li[2]/a");

    //click on Overview ViewMore
    public static By ViewMore_Options = By.xpath("//*[@id=\"hotelDescription\"]/div/div/div/div[2]/button");

    //Click on Rooms
    public static By Back_In_Rooms =  By.xpath("//*[@id=\"mainNav\"]/li[1]/a");

    //Click on Book Now.
    public  static By Book_Now =  By.xpath("/html/body/app-root/div/hotel-details/div[3]/desktop-hotel-room-list/div/div/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/a");




}
