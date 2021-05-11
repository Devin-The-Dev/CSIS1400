/**********************************************
* Author: your name
* 
* RobotApp solved three challenges where a 
* robot needs to figure out the number
* of rooms in a given grid.
*
* Important: 
* The code still needs to work when you change
* the values of the variables n, h, and w.
***********************************************/

public class RobotApp {
	public static void main(String[] args) { 
      // square 4x4 grid to demo how the robotcan be controlled
      Robot robot = new Robot(4, 4, 3, 0);    
      
      int n = 5;
      int h = 4;
      int w = 6;
      
      // square nxn grid with the robot in the north-east corner
      robot = new Robot(n, n, n-1, 0);        
      challenge1(robot);    
      
      // rectangular grid with width w and height h
      // robot in the north-east corner
      robot = new Robot(w, h, w-1, 0);  
      challenge2(robot);
      
      // square nxn grid 
      // robot's starting position: 1 over, 2 down 
      robot = new Robot(n, n, 1, 2);   
      challenge3(robot);      
      
      // rectangular grid with width w and height h
      // robot's starting position: 3 over, 1 down 
      robot = new Robot(w, h, 3, 1);   
      challenge4(robot);
	}
     
   private static void challenge1(Robot robot) {      
      // TODO: Solve challenge 1 and update the text below
      
      int xAxis = 1;
      int yAxis = 1;
      int moves = 0;
      
      while (robot.check('w') == true)
      {
      
         robot.go('w');
         xAxis++;
         moves++;
      
      }
      
      int numberOfRooms = xAxis * xAxis;
      
      robot.say(numberOfRooms + " rooms " + moves + " moves");		
   }
   
   private static void challenge2(Robot robot) {      
      // TODO: Solve challenge 2 and update text below
   
      int xAxis = 1;
      int yAxis = 1;
      int moves = 0;
      
      while (robot.check('w') == true)
      {
      
         robot.go('w');
         xAxis++;
         moves++;
      
      }
      
      while (robot.check('s') == true)
      {
      
         robot.go('s');
         yAxis++;
         moves++;
      
      }
      
      int numberOfRooms = xAxis * yAxis;
      
      robot.say(numberOfRooms + " rooms " + moves + " moves");   
   }
   
   private static void challenge3(Robot robot) {   
      // TODO: Solve challenge 3 and update text below
      
      int xAxis = 1;
      int yAxis = 1;
      int moves = 0;
      
      // Set the robot in position
      while (robot.check('w') == true)
      {
      
         robot.go('w');
         moves++;
      
      }
      
      while (robot.check('s') == true)
      {
      
         robot.go('s');
         moves++;
      
      }
      
      //Begin finding grid      
      while (robot.check('e') == true)
      {
      
         robot.go('e');
         xAxis++;
         moves++;
      
      }
      
      while (robot.check('n') == true)
      {
      
         robot.go('n');
         yAxis++;
         moves++;
      
      }
      
      int numberOfRooms = xAxis * yAxis;
      
      robot.say(numberOfRooms + " rooms " + moves + " moves");   
   }
      
   private static void challenge4(Robot robot) {   
      // TODO: Solve challenge 4 and update text below
      
      int xAxis = 1;
      int yAxis = 1;
      int moves = 0;
      
      // Set the robot in position
      while (robot.check('e') == true)
      {
      
         robot.go('e');
         moves++;
      
      }
      
      while (robot.check('n') == true)
      {
      
         robot.go('n');
         moves++;
      
      }
      
      //Begin finding grid
      while (robot.check('w') == true)
      {
      
         robot.go('w');
         xAxis++;
         moves++;
      
      }
      
      while (robot.check('s') == true)
      {
      
         robot.go('s');
         yAxis++;
         moves++;
      
      }
      
      int numberOfRooms = xAxis * yAxis;
      
      robot.say(numberOfRooms + " rooms " + moves + " moves");   
   }
   
}
