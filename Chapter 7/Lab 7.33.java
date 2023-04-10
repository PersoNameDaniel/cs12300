import java.util.Scanner;

public class LabProgram {
   
   public static double activityCalories(String activity, int minutes) {
      double caloriesPerMinute = 0.0;
      
      if (activity.equals("sit")) {
         caloriesPerMinute = 1.4;
      }
      else if (activity.equals("walk")) {
         caloriesPerMinute = 5.4;
      }
      else if (activity.equals("jog")) {
         caloriesPerMinute = 13.0;
      }
      else if (activity.equals("bike")) {
         caloriesPerMinute = 6.8;
      }
      else if (activity.equals("swim")) {
         caloriesPerMinute = 8.7;
      }
      
      return caloriesPerMinute * minutes;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int userMinutes; 
      String userActivity; 
      
      userActivity = scnr.next(); 
      userMinutes = scnr.nextInt(); 
      
      System.out.println(activityCalories(userActivity, userMinutes)); 
   }
}
