//Built by Devin Udy
public class DyzeeThreadz {

   public static double footLength(String gender, double size)
   {
           
      double length = 0.0;
      
      if(size / size - 0.5 != 1.0)
      {
         
         int intSize = (int) size;
         
         if (gender.equals("Men"))
         {
         
            switch(intSize)
            {
            
               case 4:
                  length = 23;
                  break;
               case 5:
                  length = 24;
                  break;
               case 6:
                  length = 25;
                  break;
               case 7:
                  length = 26;
                  break;
               case 8:
                  length = 27;
                  break;
               case 9:
                  length = 28;
                  break;
               case 10:
                  length = 29;
                  break;
               case 11:
                  length = 30;
                  break;
               case 12:
                  length = 31;
                  break;
               case 13:
                  length = 32;
                  break;
               case 14:
                  length = 33;
                  break;
               case 15:
                  length = 34;
                  break;
               case 16:
                  length = 35;
                  break;
               case 17:
                  length = 36;
                  break;
               case 18:
                  length = 37;
                  break;
            
            }
            
         } else
         {
         // Womens Length
            switch(intSize)
            {
               case 4:
                  length = 22;
                  break;
               case 5:
                  length = 23;
                  break;
               case 6:
                  length = 24;
                  break;
               case 7:
                  length = 25;
                  break;
               case 8:
                  length = 26;
                  break;
               case 9:
                  length = 27;
                  break;
               case 10:
                  length = 28;
                  break;
               case 11:
                  length = 29;
                  break;
               case 12:
                  length = 30;
                  break;
            
            }
         
         }
         
      }
         
      return length;
   }
      
   public static double newSize(String gender, double length)
   {
      double newSize = 0.0;
      
      
      if (length / length - 0.5 != 1.0)
      {
      
         int intLength = (int) length;
      
         if (gender.equals("Men"))
         {

            switch(intLength)
            {

               case 23:
                  newSize = 4;
                  break;
               case 24:
                  newSize = 5;
                  break;
               case 25:
                  newSize = 6;
                  break;
               case 26:
                  newSize = 7;
                  break;
               case 27:
                  newSize = 8;
                  break;
               case 28:
                  newSize = 9;
                  break;
               case 29:
                  newSize = 10;
                  break;
               case 30:
                  newSize = 11;
                  break;
               case 31:
                  newSize = 12;
                  break;
               case 32:
                  newSize = 13;
                  break;
               case 33:
                  newSize = 14;
                  break;
               case 34:
                  newSize = 15;
                  break;
               case 35:
                  newSize = 16;
                  break;
               case 36:
                  newSize = 17;
                  break;
               case 37:
                  newSize = 18;
                  break;
   
            }
         
         } else
         {
         // Womens Recommended shoe size
            switch(intLength)
            {

               case 22:
                  newSize = 4;
                  break;
               case 23:
                  newSize = 5;
                  break;
               case 24:
                  newSize = 6;
                  break;
               case 25:
                  newSize = 7;
                  break;
               case 26:
                  newSize = 8;
                  break;
               case 27:
                  newSize = 9;
                  break;
               case 28:
                  newSize = 10;
                  break;
               case 29:
                  newSize = 11;
                  break;
               case 30:
                  newSize = 12;
                  break;
   
            }
      
         }
         
      } 
      
      return newSize;
   }

}