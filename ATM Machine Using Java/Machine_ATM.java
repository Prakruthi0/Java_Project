package project;
import java.util.Scanner;

public class Machine_ATM {

	public static void main(String[] args) {
		 System.out.println("WELCOME TO ATM");
		 System.out.println("*****************************");
         
		 Scanner s =new Scanner(System.in);
		 Bank b=new ATM();
		 while(true) {
		 System.out.println(" 1:Deposit\n 2:Withdraw\n 3:Checkbalance\n 4:Exit");
		 System.out.println("Enter Choice");
		 int choice=s.nextInt();
	
		 switch(choice)
		 {
		 case 1:
			 System.out.println("Enter Amount to be Deposited");
			 int dAmt=s.nextInt();
			 b.deposit(dAmt);
			 break;
			
		 case 2:
			 System.out.println("Enter Amount to be Withdrawn");
			 int wAmt=s.nextInt();
			 b.withdraw(wAmt);
			 break;
			 
		 case 3:
			 b.checkbalance();
			 break;
			
		 case 4:
			 System.out.println("Thank You:)");
			 System.exit(0);
			 
			 default:
				 System.out.println("Invalid Choice");
		 }
		 }
	}

}
