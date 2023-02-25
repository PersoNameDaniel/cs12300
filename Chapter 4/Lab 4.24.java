import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String firstName = scnr.next();
		String lastName = scnr.next();
		int number = scnr.nextInt();
		String loginName = "";

		if (lastName.length() < 5) {
			loginName += lastName;
		} else {
			loginName += lastName.substring(0, 5);
		}

		loginName += firstName.charAt(0);
        loginName += number % 100;

        System.out.println("Your login name: " + loginName);
    }
}