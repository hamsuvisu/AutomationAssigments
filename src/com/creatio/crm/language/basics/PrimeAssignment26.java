package com.creatio.crm.language.basics;

public class PrimeAssignment26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =23 ;
		int num1 = num / 2;
		boolean isPrime = true;
		for (int i = 2; i <= num1; i++) {
			if (num % i == 0) {

				System.out.println(num + "  Number is not Prime ");
				isPrime = false;
				break;

			}

		}
		if (isPrime) {
			System.out.println(num + " is  a Prime");
		}
	}

}
