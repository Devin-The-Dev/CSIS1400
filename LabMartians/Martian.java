import java.util.Random;

public class Martian
{
   
   String name;
   static int count;
   
   static Random rand = new Random();
   
   public Martian()
   {
   
      name = getRandomName();
      count++;
   
   }
   
   public String getRandomName()
   {
      
      char letter = (char) ('A' + rand.nextInt(26));
      
      return "" + letter + (rand.nextInt(90) + 10) + "";
   
   }
   
   public void doSomething()
   {
      System.out.printf("%d%n", count);
      if (count < 5)
      {
      
         System.out.printf("%s is hiding%n", name);
      
      } else
      {
      
         System.out.printf("ATTACK!%n");
      
      }
   
   }
   
   public static Martian[] invade(int num)
   {
      Martian[] squad = new Martian[num];
      
      for (Martian el : squad)
      {
      
         el = new Martian();
         System.out.println(el);
      
      }
      
      return squad; 
   
   }
   
   public static Martian[] invade()
   {
   
      return invade(rand.nextInt(9) + 2);
   
   }
   
   @Override
   
   
   public String toString()
   {
   
      return name + "\\" + count;
   
   }

}