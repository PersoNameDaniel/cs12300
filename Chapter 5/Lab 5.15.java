import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int count = 0;
        int max = 0;

        while (num >= 0) {
            num = scnr.nextInt();

            if (num >= 0) {
                sum += num;
                count++;

                if (num > max) {
                    max = num;
                }
            }
        }

        double average = (double) sum / count;
        
        System.out.println(max + " " + String.format("%.2f", average));
    }
}