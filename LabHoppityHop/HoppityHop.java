public class HoppityHop
{

   public static void main (String[] args)
   {
      //Multiples of 3 = Hoppity
      //Multiples of 5 = Hop
      //Multiples of 3 AND 5 = Hoppity Hop
   
      int num = 0;
   
      while (num < 25)
      {
         
         num++;
         if (num % 3 == 0 && num %5 == 0)
         {
         
         System.out.println("Hoppity Hop");
         
         }
         else if (num % 3 == 0)
         {
         
         System.out.println("Hoppity");
         
         } 
         else if (num % 5 == 0)
         {
         
         System.out.println("Hop");
         
         }
         else
         {
         
         System.out.println(num);
         
         }
      
      }
   }

}