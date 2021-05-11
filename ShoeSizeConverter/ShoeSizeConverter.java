//Built by Devin Udy

import java.util.Scanner;
import java.util.Arrays;

public class ShoeSizeConverter
{

   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      String[] brands = {"Nike", "Dyzee Threads"};
     
      System.out.print("What is your gender? (m/w): ");
      String gender = input.nextLine();

      if (gender.equals("m"))
      {
      
         gender = "Men";
      
      } else {
      
         gender = "Women";
      
      }
      
      System.out.println("Your gender: " + gender);
      System.out.println("----------------------------------------------");
      
      for (int i = 0; i < brands.length; i++)
      { 		      
          
          System.out.println((i) + " - " + brands[i]); 
          		
      }
      
      System.out.println("----------------------------------------------");
      
      System.out.println("What brand and size of shoes are you wearing? ");
      System.out.print("Brand: ");
      int brand = input.nextInt();
      
      System.out.print("Your Size (US only): ");
      double size = input.nextDouble();
      double footLength = 0.0;
      
      switch (brand)
      {
      
         case 0:
            footLength = Nike.footLength(gender, size);
            break;
         case 1:
            footLength = DyzeeThreadz.footLength(gender, size);
            break;
      
      }
      
      System.out.println();
      System.out.println("----------------------------------------------");
      
      for (int i = 0; i < brands.length; i++)
      { 		      
          
          System.out.println((i) + " - " + brands[i]); 
          		
      }
      
      System.out.println("----------------------------------------------");
      
      System.out.print("What is your desired brand? ");
      int newBrand = input.nextInt();
      input.nextLine();
      
      switch (newBrand)
      {
      
         case 0:
            System.out.println("Recommended shoe size: " + Nike.newSize(gender, footLength));
            break;
         case 1:
            System.out.println("Recommended shoe size: " + DyzeeThreadz.newSize(gender, footLength));
            break;
      
      }
      
   }

}