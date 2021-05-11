import java.util.Scanner;

public class TimeTable
{
   
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("Time Table:");
      System.out.printf("Number (1 - 10): ");
      int number = input.nextInt();
      for (int i = 1; i < 11; i++)
      {
      
         System.out.printf("%2d * %d = %d%n", i, number, i * number);
      
      }
   
   }

}