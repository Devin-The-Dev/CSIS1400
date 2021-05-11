public class LabChar
{

   public static void main(String[] args)
   {
   
      char dash = '-';
      
      System.out.printf("Dash character: %c%n", dash);
      
      char a = 'a';
      char letter = a;
      letter++;
      char b = letter;
      letter++;
      char c = letter;
      letter++;
      letter++;
      char e = letter;
      
      System.out.printf("Letter:%c " +  "a:%c " + " b:%c " + " c:%c " + " e:%c%n", letter, a, b, c, e);
   
      char copywriteSign = '\u00A9';
      int cpNumber = (int) copywriteSign;
      
      System.out.printf("Copywrite sign: %c %d %x%n", copywriteSign, cpNumber, cpNumber);
      
      a = '\u00A5';
      int yenNumber = (int) a;
      
      System.out.printf("Yen: %c %d %x", a, yenNumber, yenNumber);
      
   }

}