package Day21;

public class Main {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Nabiha",12345,6000);
        //System.out.println("Account created succcessfully!");
        System.out.println("Account Holder: "+account.getAccountHolder());//object+get method
        System.out.println("Account Number: "+account.getAccountNumber());
        System.out.println("Balance: "+account.getBalance());
        try{
            account.deposit(1000);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: "+account.getBalance());
        try{
            account.withdraw(2000);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: "+account.getBalance());
        try{
             account.withdraw(10000);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: "+account.getBalance());
        try{
            account.deposit(-500);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: "+account.getBalance());
       try{
         account.withdraw(0);
       }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
       }
       System.out.println("Balance: "+account.getBalance());
    }
    
}
