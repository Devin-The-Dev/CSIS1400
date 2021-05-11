import java.util.Scanner;

public class LabBMI
{

   public static void main (String[] args)
   {
      
      Scanner scr = new Scanner(System.in);
      
      System.out.print("Weight (lbs): ");
      int weight = scr.nextInt();
      System.out.println();
      System.out.print("Height (in): ");
      int height = scr.nextInt();
      System.out.println();
      
      double preBMI = weight/Math.pow(height, 2);
      double bmi = preBMI * 703;
      System.out.printf("%.2f", bmi);
      
      if (bmi < 15.5)
      {
   
         System.out.printf(" Underweight");
      
      } else if (bmi >=15.5 && bmi < 25)
      {
      
         System.out.printf(" Just right");
      
      } else if (bmi >= 25 && bmi < 30)
      {
      
         System.out.printf(" Overweight");
      
      } else 
      {
      
         System.out.printf(" obese");
      
      }
      
   }

}