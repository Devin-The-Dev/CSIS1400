import java.util.Scanner;

public class ThreeNumbers
{

   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter 3 numbers separated by a space: ");
      int n1, n2, n3;
      n1 = input.nextInt();
      n2 = input.nextInt();
      n3 = input.nextInt();
      System.out.println();
      
      int smallest, medium, largest;
      
      //Smallest Number
      if(n1 < n2 && n1 < n3)
      {
      
         smallest = n1;
      
      } else if(n2 < n1 && n2 < n3)
      {
      
         smallest = n2;
      
      } else 
      {
      
         smallest = n3;
      
      }
      
      //Largest Number
      if (smallest != n1 && n1 > n2 && n1 > n3)
      {
      
         largest = n1;
      
      } else if (smallest != n2 && n2 > n1 && n2 > n3)
      {
      
         largest = n2;
      
      } else
      {
      
         largest = n3;
      
      }
      
      //Medium Number
      if (n1 > smallest && n1 < largest)
      {
      
         medium = n1;
      
      } else if (n2 > smallest && n2 < largest)
      {
      
         medium = n2;
      
      } else
      {
      
         medium = n3;
      
      }
      
      System.out.println("Sorted numbers: " + smallest + " " + medium + " " + largest);
      
   }

}