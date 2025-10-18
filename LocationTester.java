package simplelocation;

public class LocationTester {

    public static void main(String[] args) {

        // create locations using constructor and overloaded constructor
        SimpleLocation myLocation = new SimpleLocation("My Home", 32.892, 13.220);
        SimpleLocation citCollege = new SimpleLocation("CIT College", 32.820, 13.185);

        // test overloaded methods
        double distance1 = myLocation.distance(citCollege); // uses object version
        double distance2 = myLocation.distance(32.820, 13.185); // uses coordinate version

        System.out.println("Distance (object): " + distance1 + " km");
        System.out.println("Distance (coordinates): " + distance2 + " km");

        // test overridden method (toString)
        System.out.println(myLocation);
        System.out.println(citCollege);
    }
}
