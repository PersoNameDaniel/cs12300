import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int rocketHeight = 0; 
      int initialVelocity = 0;
      int timeSinceLaunch = 0; 

      //System.out.print("Enter initial velocity: ");
      initialVelocity = scnr.nextInt();
      
      while (rocketHeight >= 0) {
        rocketHeight = (initialVelocity * timeSinceLaunch) - (5 * timeSinceLaunch * timeSinceLaunch);
        if (rocketHeight >= 0) {
            System.out.println(timeSinceLaunch + " " + rocketHeight);
        }
        timeSinceLaunch++;
      }
   }
}