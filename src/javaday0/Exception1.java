package javaday0;

import java.util.Scanner;
class UnsupportedTransactionException extends Exception
{
	public UnsupportedTransactionException(String message)
	{
		super(message);
	}
}
class ATMTransaction
{
	public void execute()
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter transaction type (credit/debit/balanceenquiry/pinchange): ");
			String transaction = sc.nextLine().toLowerCase();
			
			switch(transaction)
			{
				case "credit" :
					System.out.println("Credit transaction is executing..");
					break;
				case "debit" :
					System.out.println("Debit transaction is executing..");
					break;
				case "balanceenquiry" :
					System.out.println("Balance enquiry transaction is executing..");
					break;
				case "pinchange" :
					System.out.println("Pin change transaction is executing..");
					break;
				default:
					throw new UnsupportedTransactionException("Invalid Transaction: " + transaction);
			}
		}
		catch(UnsupportedTransactionException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		finally
		{
			sc.close();
		}
	}
}
public class Exception1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMTransaction atm = new ATMTransaction();
		atm.execute();
	}
}
