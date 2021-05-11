public class Ball
{

   private double size;
   
   public double getSize()
   {
   
      return size;
   
   }
   
   public double setSize(double s)
   {
   
      if (s >= 0)
      {
      
         size = s;
      
      }
   
      return size;
   
   }
   
   public void roll()
   {
   
      System.out.printf("rolling . . .%n");
   
   }
   
   public void bounce(int numberOfBounces)
   {
      
      System.out.printf("Bouncing %d times %n", numberOfBounces);
   
   }

}