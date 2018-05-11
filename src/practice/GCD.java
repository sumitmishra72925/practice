package practice;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter divident");
		int divident = scanner.nextInt();
		
		System.out.println("Enter divisor");
		int divisor = scanner.nextInt();

		while(divident % divisor != 0){
			int rem= divident % divisor ;
			divident = divisor ;
			divisor = rem ;
		}
		
		System.out.println(divisor);

	}

}
