package com.creatio.crm.language.basics;

/*1.
Count the total number of words in the sentence.
2.
Print the sentence words in reverse order.
3.
Convert the first character of each word to uppercase and print original sentence
String sentence = "Java programming is fun and challenging";*/

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Java programming is fun and challenging";

		// Count the total number of words in the sentence.

		System.out.println("***********Assignment 13 A*************\n");

		System.out.println("Count the total number of words in the sentence   :" + sentence.length());

		// Print the sentence words in reverse order.

		String reverse = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse = reverse + sentence.charAt(i);
		}

		System.out.println("Reverse order    :" + reverse);

		// Convert the first character of each word to uppercase and print original
		// sentence

		String[] splittedValues = sentence.split(" ");
		System.out.print("First character of each word to uppercase: ");
		for (String upper : splittedValues) {
			System.out.print(upper.substring(0, 1).toUpperCase() + upper.substring(1, upper.length()) + " ");

		}

		System.out.println("\nPrinting original sentence:  " + sentence);

		System.out.println("\n***********Assignment 13 B*************\n");

		/*
		 * Assignment: Write a program to search for all occurrences of a “Java” word in
		 * the paragraph and print their indexes. 1. Divide into multiple words 2. Find
		 * total number of occurrences 3. Print count and Indexes of the word
		 */
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String[] splittedValues1 = paragraph.split(" ");

		// foreach loop to count Java

		int count = 0;
		for (String occurrences : splittedValues1) {
			if (occurrences.equalsIgnoreCase("java"))
				count++;
		}
		System.out.println("Count of Java with for each loop:" + count);

		// for loop to count Java with Index

		int count1 = 0;

		for (int j = 0; j < splittedValues1.length; j++) {
			if (splittedValues1[j].equalsIgnoreCase("java")) {
				System.out.println("Index " + j + " :" + splittedValues1[j]);
				count1++;
			}
		}

		System.out.println("Count of Java with for loop and index:" + count1);
		System.out.println("\n\n***************Assignment 13 C*************\n\n");
		pattern(5);
	}

	static void pattern(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
