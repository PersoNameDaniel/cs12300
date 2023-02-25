import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int runwayNum;
      int runwayDeg;
      String direction;
      
      //System.out.println("Enter a runway number:");

      runwayNum = scnr.nextInt();
      
      runwayDeg = runwayNum * 10;
      int runwayDegrees = runwayDeg;

      while (runwayDeg > 180) {
        runwayDeg -= 180;
      }
      
      if (runwayDegrees == 90) {
        System.out.println("90 degrees (east)");
        return;
      }
      if ((runwayDeg > -22.5) && (runwayDeg < 22.5)) {
         //direction = "north";
         direction = "south";
      }
      else if ((runwayDeg > 22.5) && (runwayDeg < 67.5)) {
         direction = "northeast";
      }
      else if ((runwayDeg > 67.5) && (runwayDeg < 112.5)) {
         //direction = "east";
         direction = "west";
      }
      else if ((runwayDeg > 112.5) && (runwayDeg < 157.5)) {
         //direction = "southeast";
         direction = "northwest";
      }
      else if ((runwayDeg > 157.5) && (runwayDeg < -157.5)) {
         direction = "south";
      }
      else if ((runwayDeg > -157.5) && (runwayDeg < -112.5)) {
         direction = "southwest";
      }
      else if ((runwayDeg > -112.5) && (runwayDeg < -67.5)) {
         //direction = "west";
         direction = "east";
      }
      else { // (runwayDeg > -67.5) && (runwayDeg < -22.5)
         //direction = "northwest";
         direction = "south";
      }
      
     // output
     //System.out.println(runwayNum + ": " + runwayDeg + " degrees (" + direction + ")");
     System.out.println(runwayDegrees + " degrees (" + direction + ")");
   }
}