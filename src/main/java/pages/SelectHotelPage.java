package pages;

        import wrappers.OpentapsWrappers;


public class SelectHotelPage extends OpentapsWrappers {


    public SelectHotelPage arrivalDate(String arrivalDate){
        verifyTextContainsById(prop .getProperty("Home.verifyarrival.id"),arrivalDate );
        return this ;
    }
    public SelectHotelPage depatureDate(String depatureDate){
        verifyTextContainsById(prop .getProperty("Home.verifydepature.id"),depatureDate );
        return this ;
    }
}
