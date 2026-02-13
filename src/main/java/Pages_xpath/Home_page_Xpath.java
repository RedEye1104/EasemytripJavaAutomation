package Pages_xpath;
import org.openqa.selenium.By;

public class Home_page_Xpath
{
    public static By Click_Location = By.xpath("/html/body/div[3]/div/div[4]/div/form/div/div[4]");
    public static By searchLocation = By.xpath("//*[@id=\"txtCity\"]");

    public static By select_location = By.xpath("//*[@id=\"autohotelCTJAIcity0\"]");

//-----------------------------------Check In and Check Out-------------------------------------------------------------

    public static By Open_checkIn_date = By.xpath("//*[@id=\"htl_dates\"]");

    public static By Click_Month = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/select[1]");
    public static By Select_Month = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/select[1]/option[5]");
    public static By select_Date = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]");

    public static By Select_CheckOut_Date = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[5]");

//------------------------------------Rooms & Guests--------------------------------------------------------------------

    public static By Add_Room = By.xpath("//*[@id=\"addhotelRoom\"]");
    public static By Remove_Room = By.xpath("//*[@id=\"removehotelRoom\"]");

    public static By Done = By.xpath("//*[@id=\"exithotelroom\"]");


//---------------------------------------------Exit Hotel Search Page---------------------------------------------------

    public static By search = By.xpath("//*[@id=\"btnSearch\"]");





}
