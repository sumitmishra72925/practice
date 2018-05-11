package practice;
import java.util.Scanner;
public class PrintAllprime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter n");
		int n=scn.nextInt();
		
		int counter=2;
		while(counter!=n){
			if(n%counter==0){
				break;
			}
			System.out.println(counter);
			counter++;
		}

	}

}
