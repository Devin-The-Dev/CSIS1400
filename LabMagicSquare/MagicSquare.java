import java.util.Arrays;

public class MagicSquare
{

   public static void main(String[] args) {
   int[][] square = {
      { 8, 11, 14, 1},
      {13, 2, 7,12},
      { 3, 16, 9, 6},
      {10, 5, 4, 15}
   };

   System.out.printf("The square %s a magic square. %n",(isMagicSquare(square) ? "is" : "is not"));
   }
   
   public static boolean isMagicSquare(int[][] square) {
   // TODO
   
      boolean result = true;
      
      if (square.length != square[0].length)
      {
      
         result = false;
      
      }

      if (result != false)
      {
         
         int magicSquareChecker = 0;
          
         for (int i = 0; i < square[0].length; i++)
         {
         
            magicSquareChecker += square[0][i];
         
         }
   //    Rows       
         int sumRow = 0;
         for (int[] row : square)
         {
            
            for (int number : row)
            {
            
               sumRow += number;
            
            }
    
         }
   //    Columns 
         int sumCol = 0;
         for (int i = 0; i < square[0].length; i++)
         {
         
            for (int j = 0; j < square.length; j++)
            {
            
               sumCol += square[i][j];
            
            }
   
         }
         
         // Diagonals
         int sumDiagonal = 0;
         for (int i = 0; i < square.length && i < square[0].length; i++)
         {
            
            sumDiagonal += square[i][i];
         
         }
         
         int sumInverseDiagonal = 0;
         for (int i = 0; i < square.length && i < square[0].length; i++)
         {
         
            sumInverseDiagonal += square[i][square[0].length - (i + 1)];
            
         }
         
         if (magicSquareChecker != sumRow/square.length 
         || magicSquareChecker != sumCol/square[0].length 
         || magicSquareChecker != sumDiagonal 
         || magicSquareChecker != sumInverseDiagonal)
         {
         
            result = false;
         
         }
      
      }
      
      return result;
   
   }


}