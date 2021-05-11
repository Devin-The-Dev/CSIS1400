public class Conveyor
{
   //Fields
   private String type;
   private double speed; //speed = meters/second

   //Constructors
   public Conveyor (String type, double speed)
   {
   
      if (speed > 0)
      {
      
         this.type = type;
         this.speed = speed;
      
      }
   
   }
   
   //Methods
   public String getType()
   {
   
      return type;
   
   }
   
   public double getSpeed()
   {
   
      return speed;
   
   }
   
   public void setSpeed(double speed)
   {
   
       if (speed > 0.0)
       {
       
         this.speed = speed;
       
       }
   
   }
   
   public double timeToTransport(double distance) 
   {
      
      distance = distance / speed; //distance = meters, speed = seconds
      return distance;
      
   }

}