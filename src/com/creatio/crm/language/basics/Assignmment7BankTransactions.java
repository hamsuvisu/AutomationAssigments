package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignmment7BankTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********ArrayList*************\n");
		List<Integer> trans = new ArrayList<>(Arrays.asList(12000,50000,-2000, 3000, -15000, -200, -300, 4000, -3000,-11000,11000));
		int creditCount = 0;
		int debitCount = 0;
		int zeroCount = 0;
		int credittotal = 0;
		int debittotal = 0;
		int total;
		int amount;
		int suspiciouCount = 0;
		int nosuspiciouCount=0;
		

		for (int i = 0; i < trans.size(); i++) {

			// total number of credit transactions and total amount credited in account

			if (trans.get(i) > 0) {
				creditCount++;
				credittotal = credittotal + trans.get(i);
			}
			// total number of debit transactions and total amount debited in account
			
			else if (trans.get(i) < 0) {
					debitCount++;
					debittotal = debittotal + trans.get(i);
			
			}
				
			 else

				zeroCount++;
			// condition to check if transaction limit exceeds +/- 10000 and count.
			amount=trans.get(i);
				
				if (amount > 10000) 
				{
					
					System.out.println("Suspicious Credit Transaction   :" + amount);
					suspiciouCount++;
				}
			
				
				// Suspicious debit Transaction with Amount less than  than -10000
				
				else if (amount < -10000) 
				{
					System.out.println("Suspicious Debit Transaction   :" + amount);	
					suspiciouCount++;
					}
				else
					nosuspiciouCount++;
		
			
		
	}
		// Total amount remaining at the end in Bank Account
		total = credittotal + debittotal;
	

		System.out.println("Total number of Credit transaction :" + creditCount);
		System.out.println("Total number of Debit transaction  :" + debitCount);
		System.out.println("Total number of Zero Transaction:" + zeroCount);
		System.out.println("Total Amount of Credit transaction :" + credittotal);
		System.out.println("Total Amount of Debit transaction  :" + debittotal);
		System.out.println("Total Amount amount remaining at the end in Bank Account :" + total);
		System.out.println("Total number of Suspicious Transactions with Credit / Debit in Bank Account :" + suspiciouCount);
		System.out.println("Total Number of non Suspicious  Transactions in Bank Account   : "+nosuspiciouCount);
		System.out.println("Total Number of Transactions in Bank Account   : "+trans.size());
	}

}


