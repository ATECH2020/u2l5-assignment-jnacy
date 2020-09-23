import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      double startLat, startLong, endLat, endLong;

      System.out.print("Enter the latitude of the starting location: ");
      startLat = sc.nextDouble();

      System.out.print("Enter the longitude of the starting location: ");
      startLong = sc.nextDouble();

      System.out.print("Enter the latitude of the ending location: ");
      endLat = sc.nextDouble();

      System.out.print("Enter the longitude of the ending location: ");
      endLong = sc.nextDouble();

      GeoLocation startLoc = new GeoLocation(startLat, startLong);
      GeoLocation endLoc = new GeoLocation(endLat, endLong);

      System.out.print("The distance is " + startLoc.distanceFrom(endLoc) + " miles.");
        /*
Enter the latitude of the starting location: 48.8567
Enter the longitude of the starting location: 2.3508
Enter the latitude of the ending location: 51.5072
Enter the longitude of the ending location: 0.1275
The distance is 208.08639358288565 miles.
        */
    }
}