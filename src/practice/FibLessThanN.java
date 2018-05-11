package practice;

import java.util.Scanner;

public class FibLessThanN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter n");
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int temp = 0;
		int counter = 0;
		while (counter < n) {
			System.out.println(a);
			temp = a + b;
			a = b;
			b = temp;
			counter++;
			if(a>n){
				return;
			}
		}

	}

}
