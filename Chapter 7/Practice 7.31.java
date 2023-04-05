import java.util.Scanner; 

public class LabProgram {
   
   public static int maxFive(int v, int w, int x, int y, int z) {
    int maxVal = -999;
      if (v > maxVal) {
        maxVal = v;
      }
      if (w > maxVal) {
        maxVal = w;
      }
      if (x > maxVal) {
        maxVal = x;
      }
      if (y > maxVal) {
        maxVal = y;
      }
      if (z > maxVal) {
        maxVal = z;
      }

      return maxVal;
   }
   
   public static void main(String[] args) {
      // Don't modify main's code below
      Scanner scnr = new Scanner(System.in); 
      int v, w, x, y, z;
      int maxVal;
      
      v = scnr.nextInt(); 
      w = scnr.nextInt(); 
      x = scnr.nextInt(); 
      y = scnr.nextInt(); 
      z = scnr.nextInt(); 
      
      maxVal = maxFive(v, w, x, y, z);
      System.out.println(maxVal); 
   }
}
