package practice;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number to reverse");
		int num = scn.nextInt();
		
		
		while (num!=0) {
			 int rem=num%10;
			 System.out.print(rem);
			 num=num/10;

		}

	}

}
