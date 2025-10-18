
package simplelocation;

public class SimpleLocation {
    private double latitude;
    private double longitude;

    // Constructor
    public SimpleLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getter methods
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // Overloading example
    // same method name "distance" but different parameters
    public double distance(SimpleLocation other) {
        return distance(other.getLatitude(), other.getLongitude());
    }

    // Overloading example (same name, different parameter type/number)
    public double distance(double otherLat, double otherLon) {
        double earthRadius = 6371.0;
        double dLat = Math.toRadians(otherLat - latitude);
        double dLon = Math.toRadians(otherLon - longitude);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(otherLat))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return earthRadius * c;
    }

    // Overriding example
    // toString method is inherited from Object class and redefined here
    @Override
    public String toString() {
        return "Latitude: " + latitude + ", Longitude: " + longitude;
    }

    // Main method to test
    public static void main(String[] args) {
        // Constructor usage
        SimpleLocation myLocation = new SimpleLocation(32.892, 13.220); // your current location
        SimpleLocation citCollege = new SimpleLocation(32.820, 13.185); // CIT College

        // Using overloaded methods
        double distance1 = myLocation.distance(citCollege);
        double distance2 = myLocation.distance(32.820, 13.185);

        // Print results
        System.out.println("Distance (object): " + distance1 + " km");
        System.out.println("Distance (coordinates): " + distance2 + " km");

        // Overridden method call
        System.out.println("My location: " + myLocation.toString());
    }
}