import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
      FileInputStream fstream = null;
      String idToFind;
      String dbId = "-1";
      String dbFirstName = "0";
      String dbLastName = "0";
   
      Scanner scnr = new Scanner(System.in);
      idToFind = scnr.nextLine();
      
      // Open the input file and create a new Scanner to read it
      fstream = new FileInputStream("CustomerDb.txt");
      scnr = new Scanner(fstream);
      
      // File successfully opened, will throw exception otherwise
      
      // Reading file
      while (!(dbId.equals(idToFind)) && scnr.hasNextLine()) {
         String line = scnr.nextLine();
         String[] parts = line.split(" ");
         if (parts.length >= 3) {
            dbId = parts[0];
            dbFirstName = parts[1];
            dbLastName = parts[2];
         }
      }
      
      // check if the id was found
      if (dbId.equals(idToFind)) {
         // Print the customer's name
         System.out.println(dbFirstName + " " + dbLastName);
      } else {
         // Print "Not found"
         System.out.println("Not found");
      }
      
      // Close the input file
      fstream.close();
   }
}