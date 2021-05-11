import java.util.Scanner;

public class SimpleMathOperations {

   //Methods
    public static int smallest(int n1, int n2, int n3, int n4, int n5)
       {
          int smallest;
          
          if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5)
          {
          
            smallest = n1;
          
          } else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5)
          {
          
            smallest = n2;
          
          } else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5)
          {
          
            smallest = n3;
          
          }  else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5)
          {
          
            smallest = n4;
          
          } else
          {
          
            smallest = n5;
          
          }
          
          return smallest;
       
       }
       
       public static int largest (int n1, int n2, int n3, int n4, int n5)
       {
       
         int largest;
         
         if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5)
          {
          
            largest = n1;
          
          } else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5)
          {
          
            largest = n2;
          
          } else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5)
          {
          
            largest = n3;
          
          }  else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5)
          {
          
            largest = n4;
          
          } else
          {
          
            largest = n5;
          
          }
         
         return largest;
       
       }

   public static void main (String[] args)
   {
   // Constructor
      Scanner input = new Scanner(System.in);
   
      System.out.println("Please enter the first number:");
      int num1 = input.nextInt();
   
      System.out.println("Thank you, please enter a second number:");
      int num2 = input.nextInt();
      
      System.out.println("Thank you, please enter a third number:");
      int num3 = input.nextInt();
      
      System.out.println("Almost Done! please enter a fourth number:");
      int num4 = input.nextInt();
      
      System.out.println("Last one, please enter a fifth number:");
      int num5 = input.nextInt();
      
      int sum = num1 + num2 + num3 + num4 + num5;
      int avg = sum / 5;
      int product = num1 * num2 * num3 * num4 * num5;
      int smallest = smallest(num1, num2, num3, num4, num5);
      int largest = largest(num1, num2, num3, num4, num5);
      
      System.out.println("Sum = " + sum);
      System.out.println("Average = " + avg);
      System.out.println("Product = " + product);
      System.out.println("Smallest = " + smallest);
      System.out.println("Largest = " + largest);
      System.out.println("First number divided by second number = " + num1 / num2);
      System.out.println("The remainder of the fourth number divided by the fifth number = " + num4 % num5);
      
   }
   
}