import java.util.Scanner;
public class RectangleMenu
{
	public static void main(String[] args)
	{
	    
       Rectangle rect = new Rectangle(5,4);
       
       int selection;
       
       Scanner input = new Scanner(System.in);
       
       menuPrompt();
       int command = input.nextInt();
       
       do
       {
       
          switch (command)
          {
          
            case 0:
               break;
            case 1:
               //area
               System.out.printf("Area: %d%n%n",rect.area());
               menuPrompt();
               command = input.nextInt();
               break;
            case 2:
               //perimeter
               System.out.printf("Perimeter: %d%n%n",rect.perimeter());
               menuPrompt();
               command = input.nextInt();;
               break;
            case 3:
               //length and width
               System.out.printf("Length: %d%n", rect.getLength());
               System.out.printf("Width: %d%n%n", rect.getWidth());
               menuPrompt();
               command = input.nextInt();
               break;
            default:
               System.out.println("Invalid input");
               System.out.println();
               menuPrompt();
               command = input.nextInt();
               break;
          
          }
       
       } while (command != 0);
       
       System.out.print("Good bye");
       
  	}
	
	private static void menuPrompt()
	{
	   System.out.println("1 .. area");
		System.out.println("2 .. perimeter");
		System.out.println("3 .. length and width");
		System.out.println("0 .. exit");
		System.out.print("Your choice: ");
	}
}