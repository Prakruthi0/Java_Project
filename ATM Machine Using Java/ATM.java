package project;

public class ATM implements Bank{
	 int balance=10000;
 
 @Override
 public void deposit(int amount)
 {
	 System.out.println("Depositing Rs."+amount);
	 balance=balance+amount;
	 System.out.println("Amount Deposited Successfully");
 }
 @Override
 public void withdraw(int amount) {

	 System.out.println("Withdrawing Rs."+amount);
	 balance=balance-amount;
	 System.out.println("Amount Withdrawn Successfully");
 }
 
 @Override
 public void checkbalance() {

	 System.out.println("Available Balance is Rs."+balance);
	
}
}
