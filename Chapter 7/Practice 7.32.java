import java.net.SocketException;
import java.util.Scanner;

import javax.naming.ldap.SortControl; 

public class LabProgram {
   
    public static void ascend3(int[] originalArray) {
    int[] sortedArray = new int[3];
    int largestPos = 0;
    int smallestPos = 0;

    //finding largest number and its position
    for (int i=1; i<3; i++) {
        if (originalArray[i] > originalArray[largestPos]) {
            largestPos = i;
        }
    }
    sortedArray[2] = originalArray[largestPos];

    //finding smallest number and its position
    for (int i=1; i<3; i++) {
        if (originalArray[i] < originalArray[smallestPos]) {
            smallestPos = i;
        }
    }
    sortedArray[0] = originalArray[smallestPos];

    //setting middle number
    if (largestPos != 0 && smallestPos != 0) {
        sortedArray[1] = originalArray[0];
    } else if (largestPos != 1 && smallestPos != 1) {
        sortedArray[1] = originalArray[1];
    } else {
        sortedArray[1] = originalArray[2];
    }

    for (int i=0; i<3; i++) {
        originalArray[i] = sortedArray[i];
    }
}
   
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        int[] arrVals = new int[3]; 
      
        arrVals[0] = scnr.nextInt(); // x
        arrVals[1] = scnr.nextInt(); // y
        arrVals[2] = scnr.nextInt(); // z
      
        ascend3(arrVals); 
      
        System.out.println(arrVals[0] + " " + arrVals[1] + " " + arrVals[2]); 
   }
}
