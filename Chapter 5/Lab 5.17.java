import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String input = scnr.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                output += c;
            }
        }

        System.out.println(output);
    }
}