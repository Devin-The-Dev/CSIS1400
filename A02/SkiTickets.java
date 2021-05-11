import java.util.Scanner;

public class SkiTickets
{

   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
   
      System.out.print("Number of adult tickets: ");
      double adultTickets = input.nextInt();
      System.out.println();
      System.out.print("Number of youth tickets: ");
      double youthTickets = input.nextInt();
      System.out.println();
      System.out.print("Name: ");
      input.nextLine();
     
      String buyersName = input.nextLine();

      
      System.out.printf("%n");
      System.out.printf("%n");
      
      System.out.printf("Invoice for %s:%n", buyersName);
      double adultCharge = adultTickets * 93.00;
      double youthCharge = youthTickets * 47.00;
      double total = adultCharge + youthCharge;
      System.out.printf("Adult Tickets %2.0f .. $%2.2f%n", adultTickets, adultCharge);
      System.out.printf("Youth Tickets %2.0f .. $%2.2f%n", youthTickets, youthCharge);
      System.out.println("---------------------------");
      System.out.printf("%21c%-10.2f%n", '$', total);
      System.out.printf("%27s","========");
   
   }

}