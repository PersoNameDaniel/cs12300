import java.util.Scanner;

public class LabProgram {
   
   //creating swapValues method for swapping the 0,1 and 2,3 values in the array
   public static void swapValues(int[] values) {
    
    //defining values for swapValues
    int tempVal;

    //swapping first two values
    tempVal = values[0];
    values[0] = values[1];
    values[1] = tempVal;

    //swapping second two values
    tempVal = values[2];
    values[2] = values[3];
    values[3] = tempVal;
   }

   //creating method to print array values
   public static void printArray(int[] array) {
    for (int i=0; i<(array.length - 1); i++) {
        System.out.printf("%d ", array[i]);
    }
    System.out.printf("%d\n", array[3]);
   }
   
   public static void main(String[] args) {

    //defining values for main
    int[] values = new int[4];
      
    //defining scanner
    Scanner scnr = new Scanner(System.in);

    //assigning user values
    for (int i=0; i<4; i++) {
        values[i] = scnr.nextInt();
    }

    //calling method to swap values
    swapValues(values);

    //calling method to print values
    printArray(values);

   }
}
