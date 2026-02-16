package TestCases;

import base_station.setupdriver;
import org.testng.annotations.Test;

public class Detail_Page_test_case extends setupdriver {

    @Test(dependsOnMethods = "Listing_page")
    public void Detail_page() throws  InterruptedException {
        driver.get(DetailPage_URL);
        Thread.sleep(5000);
    }
   }

