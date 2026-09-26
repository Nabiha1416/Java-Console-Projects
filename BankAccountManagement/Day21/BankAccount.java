package Day21;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private int balance;


    public  BankAccount(String accountHolder,int accountNumber,int balance){
       //after using getter dont need to specify after constructor
         this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    public String getAccountHolder(){
            return accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    //DEPOSIT:
    public void deposit(int amount){
        if (amount<=0){
           throw new IllegalArgumentException("Amount must be positive");
        }else{
             balance+=amount;
             System.out.println("Deposit successful!");
        }
    }
    //WITHDRAW:
    public void withdraw(int amount){
        if(amount<=0 ){
            throw new IllegalArgumentException("Amount must be positive");
           
        }if(amount>balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdraw successful!");
        }
    }   
}
