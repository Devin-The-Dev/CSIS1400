public class Triangle
{

   private double side1;
   private double side2;
   private double side3;
   
   public Triangle(double side1, double side2, double side3)
   {
   
         isTriangle(side1, side2, side3);
   
   }
   
   public double getSide1()
   {
   
      return side1;
   
   }
   
   public double getSide2()
   {
   
      return side2;
   
   }
   
   public double getSide3()
   {
   
      return side3;
   
   }
   
   //Only getting zeros for testing
   //Changed parameters to different names
   private boolean isTriangle(double s1, double s2, double s3)
   {
      // sides > 0;
      // 2 sides > 1 side
      
      // Can't seem to skip all tests when all sides == 0.0 
      if (s1 > 0.0 && s2 > 0.0 && s3 > 0.0)
      {
      
         if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1))
         {
         
            side1 = s1;
            side2 = s2;
            side3 = s3;
         
         } else
         {
         
            side1 = 1d;
            side2 = 1d;
            side3 = 1d;
         
         }
         
         return true;
      
      } else
      {
      
         return false;
      
      }
      
   }
   
   public boolean isEquilateral()
   {
   
      if (side1 == side2 && side1 == side3)
      {
      
         return true;
      
      } else
      {
      
         return false;
      
      }
   
   }
   
   public boolean isRight()
   {
   // We know the length of 3 sides
   // Pathogroean Theorem
   // a^2 + b^2 = c^2
   // c = longest length
   // determine longest length
      
      if((side1 > side2 && side1 > side3) || (side2 > side1 && side2 > side3) || (side3 > side1 && side3 > side2)){
         return true;
      }
      else {
         return false;
      }
   
   }

}