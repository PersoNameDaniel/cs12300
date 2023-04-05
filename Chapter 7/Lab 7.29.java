import java.util.Scanner;

public class LabProgram {
    public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
        int frequency = 0;
        for (int i = 0; i < listSize; i++) {
            if (wordsList[i].equalsIgnoreCase(currWord)) {
                frequency++;
            }
        }
        return frequency;
    }
    
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

        for (int i = 0; i < numWords; i++) {
            // If the word has already been processed, skip it
            if (frequencies[i] > 0) {
                continue;
            }
            String currWord = words[i];
            int currFrequency = getWordFrequency(words, numWords, currWord);
            frequencies[i] = currFrequency;
            System.out.println(currWord + " " + currFrequency);
        }
    }
}