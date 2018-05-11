package practice;

import java.util.Scanner;

public class sumOfOddandEvenPlace {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter n");
		int n = scn.nextInt();
		int counter = 0;
		int se = 0, so = 0;
		while (n != 0) {
			int rem = n % 10;
			if (counter % 2 == 0) {
				se += rem;
			} else {
				so += rem;
			}
			n = n / 10;
			counter++;
		}
		System.out.println(so);
		System.out.println(se);

	}

}
