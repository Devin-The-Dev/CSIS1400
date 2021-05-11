public class ConveyorApp
{

  public static void main(String[] args)
   {
   
      Conveyor flatBelt = new Conveyor("flat belt", 0.9);
      Conveyor roller = new Conveyor("roller", -0.5); //negative is meant for input validation
      
      
      System.out.printf("Flat belt conveyor with a speed of %.1f m/s%n", flatBelt.getSpeed());
      System.out.printf("Time to transport an item 50 m: %.1f s%n", flatBelt.timeToTransport(50));
      
      System.out.printf("%n");
      
      System.out.printf("Roller conveyor with a speed of %.1f m/s%n", roller.getSpeed());
      System.out.printf("Time to transport an item 50 m: %.1f s%n", roller.timeToTransport(50));
      
      System.out.printf("%n");
      
      System.out.printf("... updating speed%n");
      
      System.out.printf("%n");
      
      flatBelt.setSpeed(-3.0);
      roller.setSpeed(0.4);
      
      //Flat Belt
      System.out.printf("Flat belt conveyor with a speed of %.1f m/s%n", flatBelt.getSpeed());
      System.out.printf("Time to transport an item 50 m: %.1f s%n", flatBelt.timeToTransport(50));
      
      System.out.printf("%n");
      
      //Roller
      System.out.printf("Roller conveyor with a speed of %.1f m/s%n", roller.getSpeed());
      System.out.printf("Time to transport an item 50 m: %.1f s", roller.timeToTransport(50));
      
      System.out.println (".oO" + " o.");
   
   }

}