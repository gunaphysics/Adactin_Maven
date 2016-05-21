package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SearchHotelPage;
import wrappers.OpentapsWrappers;

public class TC_02_VerifyCheckOutDate extends OpentapsWrappers{
	@BeforeClass
	public void startTestCase(){
		browserName 	= "chrome";
		dataSheetName 	= "book2";
		testCaseName 	= "TC03 -Adactin Check-Out Date Validation (POM)";
		testDescription = "Login to Adactin.com using POM framework";
	}
	

	
	@Test(dataProvider="fetchData")
	public void verifyDate(String username,String password, String location, String hotels, String roomType, String noOfRooms,
			String checkInData, String checkOutDate,String adult,String children, String checkInError) throws InterruptedException {
		new LoginPage()
				.enterUserName(username)
				.enterPassword(password)
        		.clickLogin();
		new SearchHotelPage()
				.selectLocation(location)
        		.selectHotels(hotels)
				.roomType(roomType)
                .datePickin(checkInData)
                .datePickout(checkOutDate)
                .adultperRoom(adult)
                .childrenperRoom(children)
				.clickSearch()
				.verifyCheckInErrorMessage(checkInError)
				;


	}
}
