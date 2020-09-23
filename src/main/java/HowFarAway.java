import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      // init/create vars
      Scanner sc = new Scanner(System.in);
      double startLat, startLong, endLat, endLong, distance;

      // get values from user
      System.out.print("Enter the latitude of the starting location: ");
      startLat = sc.nextDouble();

      System.out.print("Enter the longitude of the starting location: ");
      startLong = sc.nextDouble();

      System.out.print("Enter the latitude of the ending location: ");
      endLat = sc.nextDouble();

      System.out.print("Enter the longitude of the ending location: ");
      endLong = sc.nextDouble();

      // calculate distance
      GeoLocation startLoc = new GeoLocation(startLat, startLong);
      GeoLocation endLoc = new GeoLocation(endLat, endLong);

      distance = startLoc.distanceFrom(endLoc);

      System.out.print("The distance is " + distance + " miles.");
    }
}