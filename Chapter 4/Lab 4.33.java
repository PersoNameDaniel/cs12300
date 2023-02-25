import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scnr = new Scanner(System.in);

        // get user date
        int month = scnr.nextInt();
        int day = scnr.nextInt();
        int year = scnr.nextInt();

        // check for valid input
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date.");
            return;
        }

        // Calculate the next date
        int nextMonth = month;
        int nextDay = day + 1;
        int nextYear = year;

        // Check if it is the last day of the month
        if (nextDay > getDaysInMonth(month)) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }

        // Display the result
        System.out.println(nextMonth + " " + nextDay + " " + nextYear);
    }

    // A method that returns the number of days in a given month
    public static int getDaysInMonth(int month) {
        
		// Group months based on number of days 
		int[] monthsWith30Days = {4,6,9,11}; 
		int[] monthsWith31Days = {1,3,5,7,8,10};
		
		if (month == 2) { 
			return 28;
		} else if (contains(monthsWith30Days, month)) { 
			return 30; 
		} else if (contains(monthsWith31Days, month)) { 
			return 31; 
		} else { 
			return -1; // Invalid month 
		}
    }

    // A method that checks if an array contains a given value
    public static boolean contains(int[] array, int value) {
        
		for (int element : array) { 
			if (element == value) { 
				return true; 
			} 
		}
		
		return false;
    }
}