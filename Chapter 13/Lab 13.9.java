import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {

   public static String findID(String studentName, Scanner infoScnr) throws Exception {
      while (infoScnr.hasNextLine()) {
         String line = infoScnr.nextLine();
         String[] parts = line.split(" ");
         if (parts[0].equals(studentName)) {
            return parts[1];
         }
      }
      throw new Exception("Student ID not found for " + studentName);
   }

   public static String findName(String studentID, Scanner infoScnr) throws Exception {
      while (infoScnr.hasNextLine()) {
         String line = infoScnr.nextLine();
         String[] parts = line.split(" ");
         if (parts[1].equals(studentID)) {
            return parts[0];
         }
      }
      throw new Exception("Student name not found for " + studentID);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String studentName;
      String studentID;
      String studentInfoFileName;
      FileInputStream studentInfoStream = null;
      Scanner studentInfoScanner = null;

      // Read the text file name from user
      studentInfoFileName = scnr.next();

      // Open the text file
      try {
         studentInfoStream = new FileInputStream(studentInfoFileName);
         studentInfoScanner = new Scanner(studentInfoStream);

         // Read search option from user. 0: findID(), 1: findName()
         int userChoice = scnr.nextInt();

         if (userChoice == 0) {
            studentName = scnr.next();
            studentID = findID(studentName, studentInfoScanner);
            System.out.println(studentID);
         } else if (userChoice == 1) {
            studentID = scnr.next();
            studentName = findName(studentID, studentInfoScanner);
            System.out.println(studentName);
         } else {
            System.out.println("Invalid user choice.");
         }

         studentInfoStream.close();
      } catch (IOException ex) {
         System.out.println("Error reading file: " + ex.getMessage());
      } catch (Exception ex) {
         System.out.println("" + ex.getMessage());
      } finally {
         if (studentInfoStream != null) {
            try {
               studentInfoStream.close();
            } catch (IOException ex) {
               System.out.println("Error closing file: " + ex.getMessage());
            }
         }
      }
   }
}
