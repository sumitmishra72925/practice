package practice;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int n = scanner.nextInt();
		int divisior = 2;
		while (divisior != n) {
			if (n % divisior == 0) {
				break;
			}
			System.out.println(divisior);
			divisior++;
			
		}
		if(divisior==n){
			System.out.println("p");
		}else
			System.out.println("np");

	}

}
