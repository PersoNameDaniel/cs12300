import java.util.Scanner;

public class LabProgram {

   public static void sortArray(int[] array, int numInts) {
for (int i = 0; i < numInts; i++) {
            for (int j = i + 1; j < numInts; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
   }

   public static void main(String[] args) {

    //declaring variables
    Scanner scnr = new Scanner(System.in);
    int[] array = new int[20];
    int numInts;

    //reading number of values
    numInts = scnr.nextInt();

    //assigning input variables to array
    for (int i=0; i<numInts; i++) {
        array[i] = scnr.nextInt();
    }

    //calling sort array method
    sortArray(array, numInts);

    //printing array
    for (int i=0; i<numInts; i++) {
        System.out.printf("%d,", array[i]);
    }
    System.out.println();
   }
}
