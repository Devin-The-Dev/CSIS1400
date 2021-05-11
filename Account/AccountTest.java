public class AccountTest
{

   public static void main(String[] args)
   {
   
      Account myAccount = new Account(75);
      Account dadsAccount = new Account(5000);
      
      System.out.println("Initial balance in myAccount = $" + myAccount.getBalance());
      myAccount.debit(20);
      System.out.println("Balance in myAccount after a withdrawal = $" + myAccount.getBalance());
      myAccount.debit(15);
      System.out.println("Balance in myAccount after a withdrawal = $" + myAccount.getBalance());
      myAccount.credit(50);
      System.out.println("Balance in myAccount after a deposit = $" + myAccount.getBalance());
      
      System.out.println();
      
      System.out.println("Initial balance in dadsAccount = $" + dadsAccount.getBalance());
      dadsAccount.credit(2000);
      System.out.println("Balance in dadsAccount after a deposit = $" + dadsAccount.getBalance());
      dadsAccount.debit(5000);
      System.out.println("Balance in dadsAccount after a withdrawal = $" + dadsAccount.getBalance());
         
   }

}