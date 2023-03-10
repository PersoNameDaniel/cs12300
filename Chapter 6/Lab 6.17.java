import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // Read the number of words
        int numWords = scnr.nextInt();
        
        // Create arrays to store the words and their frequencies
        String[] words = new String[numWords];
        int[] frequencies = new int[numWords];
        
        // Read the words and update their frequencies
        for (int i = 0; i < numWords; i++) {
            words[i] = scnr.next();
        }

        for (int i=0; i<numWords; i++) {
            for (int j=0; j<numWords; j++) {
                if (words[i].equals(words[j])) {
                    ++frequencies[i];
                }
            }
        }
        
        // Print the words and their frequencies
        for (int i = 0; i < numWords; i++) {
            if (frequencies[i] > 0) {
                System.out.println(words[i] + " - " + frequencies[i]);
            }
        }
    }
}