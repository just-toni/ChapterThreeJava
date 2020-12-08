package Chapter3;

public class ModifiedAccount {
     double balance;
     public void deposit(double depositBalance){
         if (depositBalance < 0)
             System.out.println("Invalid entry");
         else
             balance = balance + depositBalance;
     }
     public double getBalance(){
         return balance;
     }
     public void withdraw(double withdrawBalance){
         if (withdrawBalance < 0)
             System.out.println("Invalid input");
         if (withdrawBalance > balance)
             System.out.println("Insufficient balance");
         else
             balance = balance - withdrawBalance;
     }

    public static void main(String[] args) {
        ModifiedAccount toniAccount1 = new ModifiedAccount();
        ModifiedAccount toniAccount2 = new ModifiedAccount();

        toniAccount1.deposit(-100);
        toniAccount1.withdraw(500);
        System.out.println("Toni's new balance is " + toniAccount1.getBalance());
    }
}
