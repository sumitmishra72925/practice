package practice;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// // System.out.println("enter the value of n");
		int n = 33;
		// pattern7(n);
		// pattern6(n);
		// pattern8(n);
		// pattern9(n);
		// HollowDiamondPattern(n);
		// DEcimalToOctal(n);
		octalTOBinary(n);
	}

	public static void octalTOBinary(int n) {
		int sum = 0;
		int counter = 0;
		while (n != 0) {
			int rem = n % 10;
			sum += rem * ((int) Math.pow(8, counter));
			n = n / 10;
			counter++;
		}
		int[] bin = new int[100];
		int i = 0;
		while (sum != 0) {
			bin[i] = n % 10;
			n = n / 10;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(bin[j]);
		}

	}

	public static void DEcimalToOctal(int n) {
		int[] oct = new int[100];
		int i = 0;
		while (n != 0) {
			oct[i] = n % 8;
			n = n / 8;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(oct[j]);
		}

	}

	public static void HollowDiamondPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

	public static void pattern7(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {

				if (col == 1 || col == row) {
					System.out.print(row + "\t");
				} else {
					System.out.print("0\t");
				}

			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
		int k = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(k + " ");
				k++;

			}
			System.out.println();
		}
	}

	public static void pattern8(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print((i + j) % 2);

			}
			System.out.println();
		}
	}

	public static void pattern9(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(a + "	");
				sum = a + b;
				a = b;
				b = sum;

			}
			System.out.println();
		}
	}

}
