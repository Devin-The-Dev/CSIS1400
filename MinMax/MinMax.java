import java.util.Scanner;

public class MinMax 
{

   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("number1: ");
      int number1 = input.nextInt();
      System.out.println();
      System.out.print("number2: ");
      int number2 = input.nextInt();
      System.out.println();
      
      if (number1 != number2)
      {
         if (number1 < number2)
         {
         
         System.out.println(number1 + " is less than " + number2);
         
         }
               
         else
         {
         
            System.out.println(number2 + " is less than " + number1);
         
         }
      
      }
      
      else
      {
      
         System.out.println(number1 + " is equal to " + number2);
      
      }
   
   }

}