package Codsoft;
public class ATM{
    private String name;
    private String accNo;
    private double balance;
    ATM(String name,String accNo,double balance){
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }
    public void show(){
        System.out.println(accNo+"    "+name+"    "+balance+"    ");
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit Amount is:"+amount);
        System.out.println("Balance after deposit is:"+balance);
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdrew Amount is:"+amount);
            System.out.println("Balance after deposit is:"+balance);
        }  
        else{
            System.out.println("Invalid withdrawal amount,Either the amount is negative or exceeds the account balance:");
        }  
    }
    public void checkBalance(){
        System.out.println("Balance:"+balance);
    }
}
class Bank_ATM{
    public static void main(String args[]){
        ATM a = new ATM("SAI","68676574389",2000);
        a.show();
        a.deposit(20000);
        a.withdraw(600);
        a.checkBalance();
    }
}