package FunctionandNumberSystem;

import java.util.Scanner;

public class DigitFrequency {
	

	public static int digitFreq(int n , int d) {
		int count = 0;
		while(n > 0) {
			int rDigit = n % 10;
			n = n /10;
			if(rDigit == d) {
				count++;
				 
			}		
		}
		
		return count;
	
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		int f = digitFreq(n , d);
		
		System.out.println(f);
	
		
		

	}
	
}
