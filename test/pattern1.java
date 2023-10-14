package test;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int star = n/2;
		
		for(int r = 1;  r<=n;  r++) {
			for(int i = 1;  i<=r;  i++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		

	}

}
