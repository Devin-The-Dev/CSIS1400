import java.util.ArrayList;
import java.util.Scanner;

public class LabPartyGuests
{

   public static void main(String[] args)
   {
      int numberOfGuests = 4;
      Scanner input = new Scanner(System.in);
      int rand = (int)(Math.random() * 4);
   
      System.out.println("Please enter 4 guests:");
      ArrayList<String> guestList = new ArrayList<String>();
      for (int i = 0; i < numberOfGuests; i++)
      {
      
         System.out.printf("guest%d: ", i + 1);
         guestList.add(input.nextLine());
      
      }

      System.out.printf("%nGuest List: %s%n", guestList);
      
      System.out.printf("%s can't come%n", guestList.remove(rand));
      
      System.out.printf("Guest List: %s%n", guestList);
      
   }

}