package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SearchHotelPage;
import wrappers.OpentapsWrappers;

/**
 * Created by Udhayakumar on 05/20/2016.
 */
public class TC_07_VerifyRoomType extends OpentapsWrappers {

    @BeforeClass
    public void startTestCase(){
        browserName 	= "firefox";
        dataSheetName 	= "TC07_VerifyRoomType";
        testCaseName 	= "TC03 -Adactin Check-Out Date Validation (POM)";
        testDescription = "Login to Adactin.com using POM framework";
    }



    @Test(dataProvider="fetchData")
    public void verifyRoomType(String username,String password, String location, String hotels, String roomType, String noOfRooms,
                                String checkInData, String checkOutDate,String adult,String children) throws InterruptedException {
        new LoginPage()
                .enterUserName(username)
                .enterPassword(password)
                .clickLogin();
        new SearchHotelPage()
                .selectLocation(location)
                .selectHotels(hotels)
                .roomType(roomType)
                .noOfRooms(noOfRooms)
                .datePickin(checkInData)
                .datePickout(checkOutDate)
                .adultperRoom(adult)
                .childrenperRoom(children)
                .clickSearch()
        ;


    }
}
