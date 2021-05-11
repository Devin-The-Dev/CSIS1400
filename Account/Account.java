public class Account
{
   
   //Constructor 
   public Account(int initalBalance)
   {
   
      accountBalance = initalBalance;
   
   }
   
   // Field
   private int accountBalance;

   //Methods
   /////////////////////
   //Setters   
   public int credit(int amount)
   {
   
      accountBalance = accountBalance + amount;
      return accountBalance;
   
   }
   
   public int debit(int amount)
   {
   
      accountBalance = accountBalance - amount;
      return accountBalance;
    
   }
   
   public int setBalance(int amount)
   {
   
      accountBalance = amount;
      return accountBalance;
   
   }
   //Getter
   public int getBalance()
   {
   
      return accountBalance;
   
   }

}