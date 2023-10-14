package Fibonacci;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		while(n!=0) {
			 int rd = n % 10;
			 System.out.print(rd);
			 n = n / 10;
		}
	}
}
