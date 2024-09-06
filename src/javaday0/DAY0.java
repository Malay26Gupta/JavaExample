package javaday0;
//import java.io.*;
//import java.util.Scanner;
public class DAY0 {
	public int accountnumber;
	public String customerName;
	public double balance;
	public double interest;
	
	//constructor
	public DAY0(int accountnumber, String customerName, double balance, double interest)
	{
		this.accountnumber = accountnumber;
		this.customerName = customerName;
		this.balance = balance;
		this.interest = interest;
	}
	
	//deposit
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
			System.out.println("Rs." + amount + " is deposited successfully");
		}
		else
		{
			System.out.println("Amount deposited is unsuccessfully");
		}
	}
	
	//withdraw
	public void withdraw(double amount)
	{
		double minBalance = 5000;
		double newBalance = balance - amount;
		
		//check minimum balance condition
		if(newBalance >= minBalance && amount > 0)
		{
			balance = newBalance;
			System.out.println("Withdrawl of RS." +amount + " is successful");
		}
		else
		{
			System.out.println("Balance below RS.5000 after withdrawl Rs." + amount );
		}
	}
	
	//rate of interest
	public void rateOfInterest()
	{
			System.out.println("Interest Rate =" + (balance * interest/100));
	}
	
	//display account details
	public void accountDetails()
	{
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Balance: " + balance);
		System.out.println("Rate of interest: " + interest +"%");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAY0 account = new DAY0(23409756, "Mak Shaw", 10000.0, 4.0);
		account.accountDetails();
		account.deposit(2000.0);
		account.withdraw(4000.0);
		account.rateOfInterest();
	}
}

/* Scanner sc = new Scanner(System.in);
 * System.out.println("Enter account number : ");
 * int accountnumber = sc.nextInt();
 * sc.nextLine();
 * System.out.println("Enter customer name : ");
 * String customerName = sc.nextLine();
 * System.out.println("Enter initial balance : ");
 * double initialBalance = sc.nextnextDouble();
 * System.out.println("Enter interest rate : ");
 * double interestRate = sc.nextDouble();
 * DAY0 account = new DAY0(accountnumber, customerName, initialBalance, interestRate);
 * account.accountDetails();
 * System.out.println("Enter amount to deposit: ");
 * double depositAmount = sc.nextDouble();
 * account.deposit(depositAmount);
 * System.out.println("Enter amount to withdraw: ");
 * double withdrawAmount = sc.nextDouble();
 * account.withdraw(withdrawAmount);
 * System.out.println("Interest earned: Rs." + account.rateOfInterest());
 * sc.close(); */