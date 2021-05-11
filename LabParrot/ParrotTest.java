import java.util.Scanner;

public class ParrotTest 
{

   public static void main(String[] args)
   {   
   
      Scanner input = new Scanner(System.in);
      Parrot myParrot = new Parrot();
         
      System.out.print("What would you like the parrot to say? ");
      String text = input.nextLine();
      System.out.println();  
         
      myParrot.speak(text);

   }

}