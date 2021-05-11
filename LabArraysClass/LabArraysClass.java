
import java.util.Arrays;

public class LabArraysClass 
{
	public static void main(String[] args)
	{
		int[] iArray1 = {6, 12, 3, 9};
		int[] iArray2 = new int[5];
		
		// fill iArray2 with 7	
      Arrays.fill(iArray2, 7);
      
		// print iArray1 and iArray2 (toString)
		System.out.printf("iArrays1: %s%n", Arrays.toString(iArray1));
      System.out.printf("iArrays2: %s%n", Arrays.toString(iArray2));
      
		// search for number 9 in iArray1 and print the value returned:
      // for (int j = 0; j < iArray1.length; j++)
//       {
//       
//          if (iArray1[j] == 9)
//          {
//          
//             System.out.printf("%d in iArray1: %d%n",iArray1[j], Arrays.binarySearch(iArray1, j));
//          
//          }
//       
//       }

// Why do for loops give a different binarySearch value?
      
      int value;
      
      for (int number : iArray1)
      {
         
         value = Arrays.binarySearch(iArray1, number);
         
         if (number == 9)
         {
            System.out.printf("%d in iArray1: %d%n",number, value);
         }
      
      }
      
		// sort iArray1 and print it
      Arrays.sort(iArray1);
      System.out.println(Arrays.toString(iArray1));

		// search for number 9 in iArray1 and print the value returned:
      for (int number : iArray1) 
      {
         
         value = Arrays.binarySearch(iArray1, number);
         
         if (number == 9)
         {
            System.out.printf("%d in iArray1: %d%n",number, value);
         }
      
      }
		
		// create iArray3 and assign it the first 3 elements of iArray1; print it
		int[] iArray3 = Arrays.copyOf(iArray1, 3);
      System.out.printf("iArray3: %s%n", Arrays.toString(iArray3));
      		
		// test equality of new int[] {3, 6, 9} and iArray3; print result
		int iArray4[] = {3, 6, 9};
      
      boolean test = Arrays.toString(iArray3).equals(Arrays.toString(iArray4));
      
      System.out.printf("iArray3 equals [6, 6, 9]: %s%n", Boolean.toString(test));
      
      System.out.println("Reason: BinarySearch only applies to sorted arrays. Otherwise, the results are not defined.");
	}
}