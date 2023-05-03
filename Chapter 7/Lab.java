import java.util.Scanner; 
import java.lang.Math;

public class Lab {
   // All x, y, coordinates are in miles from the origin 0, 0. 
   public static int pickupMinutes(int userX, int userY, int firstDriverX, int firstDriverY, int secondDriverX, int secondDriverY, int thirdDriverX, int thirdDriverY) { 
      
      int firstDriverMinutes;
      int secondDriverMinutes;
      int thirdDriverMinutes;

      // getting distances of drivers
      firstDriverMinutes = distance(userX, userY, firstDriverX, firstDriverY);
      secondDriverMinutes = distance(userX, userY, secondDriverX, secondDriverY);
      thirdDriverMinutes = distance(userX, userY, thirdDriverX, thirdDriverY);

      // finding closest driver
      return smallestDistance(firstDriverMinutes, secondDriverMinutes, thirdDriverMinutes);
   } 

   public static int distance(int x1, int y1, int x2, int y2) {
      int distanceBetweenPoints;

      distanceBetweenPoints = ((Math.abs(x1 - x2)) + (Math.abs(y1 - y2)));

      return distanceBetweenPoints;
   }

   public static int smallestDistance(int firstValue, int secondValue, int thirdValue) {
      if ((firstValue < secondValue) && (firstValue < thirdValue)) {
         return firstValue;
      }
      else if (secondValue < thirdValue) {
         return secondValue;
      }
      else {
         return thirdValue;
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userX, userY; 
      int d1X, d1Y; 
      int d2X, d2Y; 
      int d3X, d3Y; 
      
      userX = scnr.nextInt(); 
      userY = scnr.nextInt(); 
      d1X = scnr.nextInt(); 
      d1Y = scnr.nextInt(); 
      d2X = scnr.nextInt(); 
      d2Y = scnr.nextInt(); 
      d3X = scnr.nextInt(); 
      d3Y = scnr.nextInt(); 
      
      System.out.println(pickupMinutes(userX, userY, d1X, d1Y, d2X, d2Y, d3X, d3Y)); 
   }
}
