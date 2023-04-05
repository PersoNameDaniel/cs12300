import java.net.SocketException;
import java.util.Scanner;

import javax.naming.ldap.SortControl; 

public class LabProgram {
   
    public static void ascend3(int[] originalArray) {
        int[] sortedArray = new int[3];
        int largestPos = -99;
        int smallestPos = -99;

        //finding largest number
        for (int i=0; i<2; i++) {
            if (originalArray[i] > originalArray[i+1]) {
                sortedArray[2] = originalArray[i];
                largestPos = i;
            }
            else sortedArray[2] = originalArray[2];
            largestPos = 2;
        }

        //finding smallest number
        for (int i=0; i<2; i++) {
            if (originalArray[i] < originalArray[i+1]) {
                sortedArray[0] = originalArray[i];
                smallestPos = i;
            }
            else sortedArray[0] = originalArray[2];
            smallestPos = 2;
        }

        //setting middle number
        for (int i=0; i<2; i++) {
            if ((i == smallestPos) || (i == largestPos)) {
                continue;
            }
            else {
                sortedArray[1] = originalArray[i];
            }
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
