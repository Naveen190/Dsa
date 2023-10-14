package Fibonacci;
import java.util.Scanner;


public class DigitOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0; 
		int temp = n; 
		
		while(temp != 0) {
			count++;
			temp = temp/ 10;
		}
		
		int pow = 1;
		int i = 0; 
		
		while(i < (count - 1)) {
			pow = pow * 10;
			i++;
		}
		
		while(pow!=0) {
			int ld = n / pow;
			System.out.println(ld);
			n = n % pow;
			pow = pow / 10;	
		}	
	}

}
