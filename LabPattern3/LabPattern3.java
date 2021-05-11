public class LabPattern3 {

   public static void main (String[] args)
   {
      
      char circle = 'O';
      char dot = '.';
      
      for (int i = 5; i > 0; i--)
      {
      
         for (int j = i; j > 0; j--)
         {
            
            System.out.print(circle + " ");
            
         }
         
         // Dots fill in missing circles
         for (int k = i - 1; k < 4; k++)
         {
         
            System.out.print(dot + " ");
         
         }
            
         System.out.println();
         
      }
      
      
   
   }

}