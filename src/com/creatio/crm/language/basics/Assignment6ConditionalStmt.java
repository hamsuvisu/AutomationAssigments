package com.creatio.crm.language.basics;

public class Assignment6ConditionalStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String customerName = "John Doe";
		int creditscore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

		// 1.Credit Score: If the credit score is above 750, the loan is automatically
		// approved

		if (creditscore > 750) {

			System.out.println("The loan is automatically approved.");
		}
		// If the credit score is between 650 and 750, additional checks are Performed

		else if (creditscore <= 750 && creditscore >= 650) {
			System.out.println("Additional checks are performed for credit score <=750 & >=650");
//				2. Income:
//				 the customer’s income must be at least $50,000
//				3.Employment Status:
//				If the customer’s income is at least 50,000, the system checks whether the customer is
//				employed.
//				If the customer is unemployed, the loan is denied.
//				4. Debt-to-Income Ratio:
//				If the customer is employed, the system checks the debt-to-income (DTI) ratio.
//				If the DTI ratio is less than 40%, the loan is approved.
//				If the DTI ratio is 40% or greater, the loan is denied.
			if (income >= 50000 && isEmployed == true && debtToIncomeRatio <= 40.0) {

				System.out.println("The loan is  approved for " + customerName +"  customer with below criteria");
				System.out.println("Income : "+income);
				System.out.println("Employed : "+isEmployed);
				System.out.println("Income Ratio : "+debtToIncomeRatio);
			} else {
				System.out.println("The loan is denied.");
			}
		}
		// If the credit score is below 650, the loan is denied.

		else {
			System.out.println("The loan is denied.");
		}

	}

}
