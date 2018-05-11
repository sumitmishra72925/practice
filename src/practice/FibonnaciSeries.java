package practice;
import java.util.Scanner;
public class FibonnaciSeries {

	public static void main(String[] args) {
	
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		int counter=0;
		while(counter<=n){
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			counter++;
			
		}
		
	}

}
