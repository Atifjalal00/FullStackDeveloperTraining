class BankAccount{
int customerId;
int accountId;
double balance;
double DepositeAmount(double amount){
 balance +=amount;
 return balance;
 }
double WithdrawAmount(double amount){
 if(amount > balance)
 return -1;
 balance -=amount;
 return balance;
 }
 double AddInterest(double percent){
 double interest=(percent/100)*balance;
 balance +=interest;
 return balance;
 }
 }
 
 public class BankAccountDemo{
 public static void main(String args[]){
 BankAccount obj=new BankAccount();
 System.out.println("AFTER DEPOSIT NEW BALANCE :" + obj.DepositeAmount(10000));
 System.out.println("AFTER WITHDRAWAL NEW BALANCE :" + obj.WithdrawAmount(2000));
 System.out.println("AFTER ADDING INTEREST NEW BALANCE :" + obj.AddInterest(10));
 

 
 }
 }