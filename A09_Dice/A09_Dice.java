import java.util.Arrays;
import java.text.DecimalFormat;

public class A09_Dice {

   public static void main (String[] args)
   {
      String pattern = "0.0";
      DecimalFormat format = new DecimalFormat(pattern);
      
      int[] sums = new int[11];
      Arrays.fill(sums, 0);
      
      for (int i = 0; i < 36000; i++)
      {
         int dice1 = (int)(Math.random() * 6) + 1;
         int dice2 = (int)(Math.random() * 6) + 1;
         int sum = dice1 + dice2;
         
         switch (sum)
         {
         
            case 2: 
               sums[0]++;
               break;
            case 3: 
               sums[1]++;
               break;
            case 4: 
               sums[2]++;
               break;
            case 5: 
               sums[3]++;
               break;
            case 6: 
               sums[4]++;
               break;
            case 7: 
               sums[5]++;
               break;
            case 8: 
               sums[6]++;
               break;
            case 9: 
               sums[7]++;
               break;
            case 10: 
               sums[8]++;
               break;
            case 11: 
               sums[9]++;
               break;
            case 12: 
               sums[10]++;
               break;
         
         }
      }
      
      System.out.printf("%4s %4s %4s%n","Sum", "Frequency", "Percentage");
      
      for (int j = 0; j < sums.length; j++)
      {
      
         double percentage = (sums[j]/36000.0) * 100.0;
      
         System.out.printf("%4d %9d %9s%% %n", j + 2, sums[j], format.format(percentage));
      
      }

   }

}