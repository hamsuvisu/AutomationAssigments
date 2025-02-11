package com.creatio.crm.language.basics;

public class Assignment12ArraysandLoops {
	public static void main(String[] args) {
		pattern1(5);
		pattern2(5);
		pattern3(5);
		pattern4(5);
		pattern5(5);
		pattern6(5);
		pattern6A(5);
		pattern6B(5);
		pattern6C(5);
		pattern6D(5);
		
	}

	static void pattern1(int n) {
		System.out.println("\nPattern 1\n");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		System.out.println("\nPattern 2\n");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	static void pattern3(int n) {
		System.out.println("\nPattern 3\n");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= (n + 1) - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	static void pattern4(int n) {
		System.out.println("\nPattern 4 with columns\n");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	static void pattern5(int n) {
		System.out.println("\nPattern 5 With Row\n");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	static void pattern6(int n) {
		System.out.println("\nPattern 6\n");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	static void pattern6A(int n) {
		System.out.println("\nPattern 6.1\n");
		for (int row = 1; row <= 2 * n; row++) {
			int totalColInRow = row > n ? 2 * n - row : row;
			for (int col = 1; col <= totalColInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	static void pattern6B(int n) {
		System.out.println("\nPattern 6.2\n");
		for (int row = 1; row <= 2 * n; row++) {
			int totalColInRow = row > n ? 2 * n - row : row;
			int space = n - totalColInRow;
			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= totalColInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	static void pattern6C(int n) {
		System.out.println("\nPattern 6.3\n");
		for (int row = 1; row <= 2 * n; row++) {
			int totalColInRow = row > n ? 2 * n - row : row;
			int space = n - totalColInRow;
			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= totalColInRow; col++) {
				System.out.print(col + " ");
			}
			System.out.println();

		}
	}

	static void pattern6D(int n) {
		System.out.println("\nPattern 6.4\n");
		for (int row = 1; row <= n; row++) {
			for (int s = 1; s <= n - row; s++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		for (int row = 1; row <= n; row++) {
			for (int s = 1; s <= row; s++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= n - row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
for (int i=1;i<=10;i+=2)
	System.out.println(i);

	}
}
