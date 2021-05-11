import java.util.Random;

public class LabRandom
{

   public static void main(String[] args)
   {
   
      Random rand = new Random();
      
      int number;
      // 4 - 7
      for (int i = 1; i <= 100; i++)
      {

         number = rand.nextInt(4)+4;
         System.out.printf("%-5d", number);
         
         if (i % 10 == 0)
         {
         
         System.out.printf("%n");
         
         }
         
      }
      
      System.out.printf("%n");
      
      // 10 - 90
      for (int i = 1; i <= 100; i++)
      {

         number = rand.nextInt(9) * 10 + 10;
         System.out.printf("%-5d", number);
         
         if (i % 10 == 0)
         {
         
         System.out.printf("%n");
         
         }
         
      }
      
      System.out.printf("%n");
      
      // 901 - 999
      
      for (int i = 1; i <= 100; i++)
      {

         number = rand.nextInt(99) + 901;
         System.out.printf("%-5d", number);
         
         if (i % 10 == 0)
         {
         
         System.out.printf("%n");
         
         }
         
      }
   
   }

}