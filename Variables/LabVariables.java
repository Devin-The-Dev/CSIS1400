import java.util.Scanner;

public class LabVariables 
{

   public static void main(String[] args)
   {
      
      String destination;
      Scanner input = new Scanner(System.in);

      
      System.out.print("Favorite destination: ");
      destination = input.nextLine();
      System.out.printf("Welcome to %s ", destination);
      
      int kingsPeak = 4124;
      int timpanogos = 3581;
      
      System.out.printf("Elevation of Kings Peak: %d ", kingsPeak);
      System.out.printf("Elevation of Kings Peak: %d ", timpanogos);
   
   }

}