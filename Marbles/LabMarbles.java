import java.util.Scanner;

public class LabMarbles 
{

   public static void main (String[] args)
   {
   
      Scanner scr = new Scanner(System.in);
      
      System.out.print("color: ");
      String color1 = scr.nextLine();
      System.out.printf("Number of %s marbles: ", color1);
      int number1 = scr.nextInt();
      
      scr.nextLine();
      
      System.out.print("color: ");
      String color2 = scr.nextLine();
      System.out.printf("Number of %s marbles: ", color2);
      int number2 = scr.nextInt();
      
      scr.nextLine();
      
      System.out.print("color: ");
      String color3 = scr.nextLine();
      System.out.printf("Number of %s marbles: ", color3);
      int number3 = scr.nextInt();
      
      System.out.println();
      System.out.printf("%-12s","Color");
      System.out.printf("%-12s", "Number of Marbles");
      System.out.println();
      System.out.printf("%-12s", "--------- ");
      System.out.printf("%-12s", "-----------------");
      System.out.println();
      System.out.printf("%-12s", color1);
      System.out.printf("%-12d", number1);
      System.out.println();
      System.out.printf("%-12s", color2);
      System.out.printf("%-12d", number2);
      System.out.println();
      System.out.printf("%-12s", color3);
      System.out.printf("%-12d", number3);
   
   }

}