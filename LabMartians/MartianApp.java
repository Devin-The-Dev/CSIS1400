import java.util.Arrays;

public class MartianApp
{

   public static void main (String[] args)
   {
   
      Martian[] invaders = Martian.invade(13);
      
      for (Martian el : invaders)
      {
         el = new Martian();
         System.out.println("Double: " + el);
      
      }
      Martian[] unknownInvaders = Martian.invade();
      
      for (Martian el : unknownInvaders)
      {
      
         el = new Martian();
         el.doSomething();
      
      }
   
   }
   
//    public static void test()
//    {
//    
//       Martian martian = new Martian();
//       
//       System.out.println(martian);
//       
//       Martian[] martians = new Martian[3];
//       
//       for (Martian el : martians)
//       {
//          
//          el = new Martian();
//          el.doSomething();
//       
//       }
//    
//    }

}