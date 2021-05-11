import java.util.Scanner;

public class LabWhile
{

   public static void main(String[] args)
   {
   
      multiplyNumbers();
   
   }
   
   public static void multiplyNumbers()
   {
   
      Scanner input = new Scanner(System.in);
      int product = 1;
      
      System.out.print("Please type a number (submit 0 to quit): ");
      int number = input.nextInt();
      
      while (number != 0)
      {
      
         product *= number;
         System.out.printf("Please submit another number (submit 0 to quit): ");
         number = input.nextInt();
      
      }
      
      System.out.printf("Solution: %d", product);
         
   }

}