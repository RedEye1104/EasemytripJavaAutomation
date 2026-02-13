package Pages_xpath;
import org.openqa.selenium.By;

public class Listing_Page_Xpath {
    // closing the Upcoming Ads.
    public static By close_ads = By.xpath("//*[@class=\"trmn ng-tns-c1899363251-1\"]");

    //Enter the hotel name and select the first one hotel.(Spree Hotel Jaipur)
    public static By Search_hotel = By.xpath("//*[@id=\"filterPanel\"]/filter-panel/div/div[1]/div[1]/div[1]/input");
    public static By Select_hotel = By.xpath("//*[@id=\"hotelAutosuggest\"]/li[1]");


    // Select the popularity of the Hotels. (Low to High)
    public static By click_popularity = By.xpath("//*[@class=\"drp-bx uparr ng-tns-c1899363251-1\"]");

    // Select Lowest price from filter
    public static By Click_Last_Minutes_Deals = By.xpath("//*[@id=\"filterPanel\"]/filter-panel/div/div[1]/div[2]/div/div/label[2]/div[2]/span");

    // Reset all filter
    public static By Reset_all_Filter = By.xpath("//*[@id=\"filterPanel\"]/filter-panel/div/div[1]/div[1]/div[2]/div[1]/small");

    // Taking hotel Name
    public static By Hotel_name = By.xpath("/html/body/app-root/div/hotel-srp/div[3]/div[2]/result-tupple/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div");

    // Taking Hotel Price
    public static By Hotel_price = By.xpath("/html/body/app-root/div/hotel-srp/div[3]/div[2]/result-tupple/div[1]/div/div[1]/div[2]/div[2]");

    // View Hotel
    public static By View_Rooms = By.xpath("/html/body/app-root/div/hotel-srp/div[3]/div[2]/result-tupple/div[1]/div/div[1]/div[2]/div[2]/a/button");










}
