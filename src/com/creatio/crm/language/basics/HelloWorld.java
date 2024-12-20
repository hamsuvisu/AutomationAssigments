package com.creatio.crm.language.basics;


//import java.io.*;
//import java.util.Scanner;
//import java.util.logging.*;
import java.util.logging.Logger;

public class HelloWorld {
	
	public static void main(String[] args) {
		 System.out.println("hello World"); 
		  System.out.write(65);
		  System.out.write('\n');
		  System.out.format("The value of pi is approximately %.2f%n", 3.14159);
		  System.out.printf("Hello, %s! You have %d new messages are %b.%n", "Alice", 5, true);
		  char[] chars = {'H', 'e', 'l', 'l', 'o'};
		  System.out.println(chars);
		  System.err.println("This is an error message!");
		  Logger.getLogger("MyLogger").info("Logging an info message");
          
	}

}
