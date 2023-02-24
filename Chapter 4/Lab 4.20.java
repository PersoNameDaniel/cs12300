import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
      boolean isPrimary;
      boolean isEastWest;

      highwayNumber = scnr.nextInt();
      
      if ((highwayNumber < 1 || highwayNumber > 999) || (highwayNumber % 100 == 0)) {
        System.out.printf("%d is not a valid interstate highway number.\n", highwayNumber);
        return;
      }

      //check if a highway is primary or secondary
      isPrimary = highwayNumber < 100;

      //check if a highway goes east/west or north/south
      isEastWest = highwayNumber % 2 == 0;

      //outputting template
      System.out.printf("I-%d is ", highwayNumber);

      //if statement for primary
      if (isPrimary) {
        System.out.print("primary, going ");
        System.out.println(isEastWest ? "east/west." : "north/south.");
      }
      else {

        //finding primary number
        primaryNumber = highwayNumber % 100;

        //printing auxiliary statement
        System.out.printf("auxiliary, serving I-%d, going ", primaryNumber);

        //printing out for secondary
        System.out.println(isEastWest ? "east/west." : "north/south.");
      }
   }
}
