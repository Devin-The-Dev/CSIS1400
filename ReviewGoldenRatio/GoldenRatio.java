public class GoldenRatio
{

   private static boolean isGoldenRatio (int number1, int number2)
   {
   
      if(number1 == number2)
      {
      
         System.out.printf("The Golden Ration is %d%n, number1 / number2");
         return false;
      
      }
      
      if(number2 > number1)
      {
      
         if (Math.round(number2 / (double) number1 * 1000) == 1618)
         {
         
            return true;
         
         }
         
         return false;
      
      }
      
      if (number1 > number2)
      {
      
         if (Math.round(number1 / (double) number2 * 1000) == 1618)
         {
         
            return true;
         
         }
      
         System.out.printf("The answer is %d%n", number1/ number2);
         return false;
      
      }
      
      return false;
      
   }
   
   public static void main(String[] args)
   {
   
     int number1 = 100004;
     int number2 = 161800;
     System.out.printf("isGoldenRatio(%d,%d): %b%n", number1, number2, isGoldenRatio(number1, number2)); 
   
   }

}