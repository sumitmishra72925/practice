package practice;

import java.util.Scanner;

public class startCampus {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter n");
		int n=scanner.nextInt();
		int counter =1;
		int fact=1;
		
		while(counter<=n){
			fact=fact*counter;
			counter++;
		}
		System.out.println(fact);

	}

}
