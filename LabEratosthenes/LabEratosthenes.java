import java.util.Scanner;

public class LabEratosthenes
{

   public static void main (String[] args)
   {
    
    Scanner input = new Scanner(System.in);
    
    //For added fun
    System.out.println("I am Optimus PRIME.");
    System.out.println("Submit a number to know which numbers less than submitted number are PRIME.");
    System.out.print("Submitted number: ");
    
    int n = input.nextInt();
    
    System.out.println();
    
    primeNumbers(n);
      
   }
   
   public static void primeNumbers(int n)
   {
      
    // Declare the variables
    int i, j, flag;
 
    // Print display message
    System.out.printf("PRIME numbers between 1 and %d are:%n", n);
 
    // Use for loop to go through numbers 1 - N
    for (i = 2; i <= n; i++)
    {
 
        // flag variable to tell if i is prime or not
        flag = 1;
 
        for (j = 2; j <= i / 2; ++j)
        {
            if (i % j == 0)
            {
                flag = 0;
                break;
            }
        }
 
        // flag = 1 means i is prime
        // flag = 0 means i is not prime
        if (flag == 1)
            System.out.print(i + " ");
    }
   
   }

}