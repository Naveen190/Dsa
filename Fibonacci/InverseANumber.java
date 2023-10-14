package Fibonacci;

import java.util.Scanner;

public class InverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int fv = 0;
		int ans = 0;
		
		
		while(n!=0) {
			fv++;
			int rd = n % 10;
			n = n / 10;	
			ans = ans + fv * (int)(Math.pow(10 , rd - 1));
			
		}
		System.out.println(ans);
	}

}
