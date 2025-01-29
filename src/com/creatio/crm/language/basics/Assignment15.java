package com.creatio.crm.language.basics;

public class Assignment15 {

	public static void main(String[] args) {

		print2charword("I Love Dogs");
		palindrome("race a car"); // "A man, a plan, a canal: Panama"

	}

	public static void print2charword(String input) {
		// String input = " I Love Dogs ";
		// Print All 2 Letter word combinations from this and 2 chars should not have
		// same letter
		System.out.println(
				"\n Print All 2 Letter word combinations from this and 2 chars should not have same letter \n");
		String input1 = input.substring(0).toLowerCase(); // lowercase
		String input2 = input1.replaceAll("[^a-zA-Z]", ""); // cleaning up data without space
		for (int i = 0; i < input2.length(); i++) {
			for (int j = i + 1; j < input2.length(); j++) {
				if (input1.charAt(i) != input2.charAt(j)) { // condition to check no repeated character
					System.out.println(input2.charAt(i) + " " + input2.charAt(j));
				}
			}
		}
	}

	public static void palindrome(String input) {
		// Given a string s, return true if it is a palindrome, or false otherwise.
		System.out.println("\n *******Palindrome***********");
		String input1 = input.replaceAll("[^a-zA-Z0-9]", ""); // cleaning up data without space and Special character
		String input2 = input1.substring(0).toLowerCase(); // lowercase
		String reverse = "";
		boolean flag = true;
		for (int i = input2.length() - 1; i >= 0; i--) { // reading the character from last

			reverse = reverse + input2.charAt(i); // appending character from last
		}
		System.out.println("Original String  :" + input2);
		System.out.println("Reverse of the string : " + reverse);
		if (reverse.equals(input2)) {
			flag = true;
			System.out.println("Output  :" + flag);
			System.out.println("Explanation  :\"" + input2 + "\" is a palindrome");
		} else {
			flag = false;
			System.out.println("Output :" + flag);
			System.out.print("Explanation  :\"" + input2 + "\" is not a palindrome");
		}
	}

}
