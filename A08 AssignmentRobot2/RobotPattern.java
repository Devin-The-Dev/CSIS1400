/*************************************************
* Author: your name
* 
* RobotPattern solved three challenges where a 
* robot walks specified patterns in ramdom-sized
* grids.
*
* Important: 
* The code still needs to work when you change
* the value of the variable n
*************************************************/

public class RobotPattern {
	public static void main(String[] args) { 
      int n = 0;
      while (n == 0 || n == 4)
      {
      
         n = (int)(Math.random() * 7);
      
      }

      // square nxn grid with the robot in the north east corner
      Robot robot = new Robot(n, n, n-1, 0);      
      challenge1(robot);    
      
      robot = new Robot(n, n, n-1, 0);    
      challenge2(robot);
      
      robot = new Robot(n, n, n-1, 0);  
      challenge3(robot);
	}
     
   private static void challenge1(Robot robot) {      
      // TODO: Make the robot walk the pattern described in challenge 1 
      //       When done it should say the specified message

      int rows = 0;
      
      while (robot.check('w'))
      {
      
         robot.go('w');
         rows++;
      
      }
      
      robot.go('s');
      
      while (rows > 0)
      {
         
         if (rows > 0)
         {
            
            while (robot.check('e'))
            {
            
               robot.go('e');
            
            }
            
            rows -= 1;
            
            if (robot.check('s'))
            {
            
               robot.go('s');
            
            }
            
         }
         
         if (rows > 0)
         {
            
            while (robot.check('w'))
            {
            
               robot.go('w');
            
            }
            
            rows -=1;
            
            if(robot.check('s'))
            {
            
               robot.go('s');
            
            }
            
         }
         
      }
      
      System.out.println("Done");
   }
   
   private static void challenge2(Robot robot) {      
      // TODO: Make the robot walk the pattern described in challenge 2
      //       When done it should say the specified message
      // move 5 spaces in 1 direction 3 times, move 4 in a different direction 2 times
      // move 3 spaces in different 2 times, 2 spaces 2 times, 1 space 2 time
      // Find how many space on one edge
      // Repeat number twice, then decrement by 1 
      int spaces = 0;
      
      while (robot.check('s'))
      {
      
         robot.go('s');
         spaces++;
      
      }
      
      while (spaces >= 0)
      {

         //First loop
         for (int i = 0; i < spaces; i++)
         {
         
            robot.go('w');
         
         }
         
         for (int j = 0; j < spaces; j++)
         {
         
            robot.go('n');
         
         }

         spaces -= 1;
         /////////////////////////////////
         
         //Second loop
         for (int k = 0; k < spaces; k++)
         {
         
            robot.go('e');
         
         }
         
         for (int l = 0; l < spaces; l++)
         {
         
            robot.go('s');
         
         }
         spaces -= 1;
         /////////////////////////////////
         
      }

      System.out.println("Did it");
   }
   
   private static void challenge3(Robot robot) {   
      // TODO: Make the robot walk the pattern described in challenge 3 
      //       When done it should say the specified message
      // find the perameter
      // moves south until no door, keeps count
      // moves west until no door, keeps count
      // parameter found
      // decrease repeated moves until 0
      int longitude = 0;
      int latitude = 0;
      
      // setting it up///////////////////////////////////
      while (robot.check('s'))
      {
         
         robot.go('s');
         longitude++;
      
      }
      
      while (robot.check('w'))
      {
      
         robot.go('w');
         latitude++;
      
      }
      
      robot.go('n');
      /////////////////////////////////////////////////
      
      for (int k = 0; k < longitude || k < latitude; k++)
      {
      // Going up loop/////////////////////////////////
         for (int i = 0; i < longitude - 1; i++)
         {
         
            robot.go('e');
         
         }
         
         longitude--;
         
         for (int j = 0; j < latitude - 1; j++)
         {
         
            robot.go('n');
         
         }
         
         latitude--;
         
         if (robot.check('w'))
         {
            robot.go('w');
         }
      /////////////////////////////////////////////////
      
      // Going down loop //////////////////////////////
         for (int i = 0; i < longitude - 1; i++)
         {
         
            robot.go('s');
         
         }
         
         longitude--;
         
         for (int j = 0; j < latitude - 1; j++)
         {
         
            robot.go('w');
         
         }
         
         latitude--;
         
         if (robot.check('n'))
         {
            robot.go('n');
         }
      /////////////////////////////////////////////////
      }
      
      System.out.println("Finished");
   }

}
