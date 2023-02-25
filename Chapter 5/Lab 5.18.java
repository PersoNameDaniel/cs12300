import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int firstInt = scnr.nextInt();
        int secondInt = scnr.nextInt();

        if (secondInt < firstInt) {
            System.out.println("Second integer can't be less than the first.");
            return;
        } else {
            for (int i = firstInt; i <= secondInt; i += 5) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}