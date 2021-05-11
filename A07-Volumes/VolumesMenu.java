import java.util.Scanner;

public class VolumesMenu
{
      
   public static void main(String[] args)
   {
      
      Scanner input = new Scanner(System.in);
      
      int userChoice;
      
      do
      {
      
         menuPrompt();
         userChoice = input.nextInt();
         
         switch(userChoice)
         {
         
            case 1:
               System.out.printf("cuboid(2,4,6): volume = %.1f%n%n", Volumes.cuboid(2, 4, 6));
               break;
            case 2:
               System.out.printf("cuboid(4): volume = %.1f%n%n", Volumes.cuboid(4));
               break;
            case 3:
               System.out.printf("ellipsoid(2,4,6): volume = %.1f%n%n", Volumes.ellipsoid(2, 4, 6));
               break;
            case 4:
               System.out.printf("ellipsoid(4): volume = %.1f%n%n", Volumes.ellipsoid(4));
               break;
            case 5:
               System.out.printf("cylinder(3,4): volume = %.1f%n%n", Volumes.cylinder(3, 4));
               break;
            case 6:
               System.out.printf("cylinder(6,5): volume = %.1f%n%n", Volumes.cone(6, 5));
               break;
            case 0:
               System.out.println("goodbye");
               break;
            default:
               System.out.println("invalid input");
               
            System.out.println("");
         
         }
      
      } while (userChoice > 0);  
         
   }     
         
   public static void menuPrompt() 
   {      
      
      System.out.printf("%-25s %s%n","1 .. cuboid(2, 4, 6)", "2 .. cuboid(4)");     
      System.out.printf("%-25s %s%n", "3 .. ellipsoid(2, 4, 6)", "4 .. ellipsoid(4)");      
      System.out.printf("%-25s %s%n", "5 .. cylinder(3,4)", "6 .. cone(6, 5)");      
      System.out.println("0 .. exit");      
      System.out.print("Your choice: ");   
         
   }
   

}