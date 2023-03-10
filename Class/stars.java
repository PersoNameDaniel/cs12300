import java.util.*;

public class stars {
    public static void main (String[] args) {

        int rows = 100000;
        System.out.println("Here's your pattern:");

        //main for loop for number of rows
        for (int i=0; i<rows; i++) {

            //for loop for number of spaces per row
            for (int k=(rows-i); k>0; k--) {
                System.out.print(" ");
            }

            //for loop for number of stars per row
            for (int j=0; j<i; j++) {
                System.out.print("* ");
            }

            //next line at end of main for loop
            System.out.println();
            System.out.print(i);
        }

    }
}