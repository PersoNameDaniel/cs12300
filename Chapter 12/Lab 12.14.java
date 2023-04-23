import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   public static void printArrayList(ArrayList<Plant> garden) {
      for(int i = 0; i < garden.size(); i++) {
         System.out.println("Plant " + (i+1) + " Information: ");
         garden.get(i).printInfo();
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      ArrayList<Plant> myGarden = new ArrayList<Plant>();
      
      String plantName, plantCost, flowerName, flowerCost, colorOfFlowers;
      boolean isAnnual;
      
      input = scnr.next();
      while(!input.equals("-1")){
         if(input.equals("plant")) {
            Plant newPlant = new Plant();
            plantName = scnr.next();
            plantCost = scnr.next();
            newPlant.setPlantName(plantName);
            newPlant.setPlantCost(plantCost);
            myGarden.add(newPlant);
         }
         else if(input.equals("flower")) {
            Flower newFlower = new Flower();
            flowerName = scnr.next();
            flowerCost = scnr.next();
            isAnnual = Boolean.parseBoolean(scnr.next());
            colorOfFlowers = scnr.next();
            newFlower.setPlantName(flowerName);
            newFlower.setPlantCost(flowerCost);
            newFlower.setPlantType(isAnnual);
            newFlower.setColorOfFlowers(colorOfFlowers);
            myGarden.add(newFlower);
         }
         input = scnr.next();
      }
      
      printArrayList(myGarden);
      
   }
}