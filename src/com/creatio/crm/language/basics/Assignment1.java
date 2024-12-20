package com.creatio.crm.language.basics;

public class Assignment1 {
	/**
	 * This is a program explains about data type uses in java.
	 * Primitive data types - includes byte, short, int, long, float, double, boolean and char
	 * Non-primitive data types - such as String 
	 * @param Array of Strings in the form of String [] or String ... (input)
	 * @author hamsaveni(hamsuvisu@gmail.com)
	 * @version 1.0 (created new feature)
	 * @throws NullPointerException
	 * @implNote
	 * 
	 */

	public static void main(String[] args) {
		// float data type sample program which displays with one decimal 
		//(note it holds 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits)
		float temperature= 25.5f;
		
		System.out.printf("Temperature of a city in degrees Celsius: %.1f %n",temperature);
		System.out.println("Temperature of a city in degrees Celsius:" + temperature);
		
		// float data type sample program which displays with two decimal with roundoff
		
		float bank_account = 1000.5258f;
		System.out.printf("\nAmount of money in a customer's bank account:: %.2f %n",bank_account);
		System.out.println("Amount of money in a customer's bank account:" + bank_account);
		
		// double data type sample program 
		//(note it 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits)
		
		double latitude = 37.774912555;
		double latitude1 = 37.774912555;
		double longitude = -122.4195495;
		
		System.out.printf("\nCoordinates of a location (latitude):%e%n",latitude);
		System.out.printf("Coordinates of a location (latitude)%f%n:" , latitude1);
		System.out.println("Coordinates of a location (longitude):" + longitude);
		
		
		// boolean data type sample program which return true or false
		//(note it 1 bit Stores true or false values)
		boolean order= true;
		boolean order1= false;
		
		System.out.printf("\nWhether a customer has placed an order: %b%n",order);
		System.out.println("Whether a customer has placed an order: " + order1);
		
		String phonenumber = "123-456-7890";
		
		System.out.printf("\nPerson's phone number: %s",phonenumber);
		System.out.println("\nPerson's phone number: " + phonenumber);
		
	
		
		String email = "john.doe@example.com";
		
		System.out.printf("\nPerson's email address:%s%n",email);
		System.out.println("Person's email address:" + email);
		
		
		int follower = 100000000;
		System.out.println("\nNumber of followers on a social media platform :" + follower);
		System.out.printf("Number of followers on a social media platform : %d%n" , follower);
		
		byte age = 125;
		
		System.out.printf("\nAge :%d%n",age);
		System.out.println("Age :"+ age);
		
       short count1 = 500;
		
		System.out.printf("\nNumber of employees in a company :%d%n",count1);
		System.out.println("Number of employees in a company :"+ count1);
		
		
		short count = 5000;
		
		System.out.printf("\nNumber of employees in a company :%d%n",count);
		System.out.println("Number of employees in a company :"+ count);
		
		
		long follower1 = 20000000000L;
		System.out.println("\nNumber of followers on a social media platform:" + follower1);
		System.out.printf("Number of followers on a social media platform : %d%n" , follower1);
		
		char type ='A';
		char type1 = 65;
		
		System.out.printf("\nPerson's blood type:%s%n",type);
		System.out.println("Person's blood type:" + type1);
		
		
	
		
	}
	
}
