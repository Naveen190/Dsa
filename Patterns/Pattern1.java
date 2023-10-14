package Patterns;

import java.util.Scanner;

public class Pattern1 {
	
//	*
//	* *
//	* * *
	public static void main(String[] args) {	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// 1st loop is for row;
		for(int r = 1;  r<=n;  r++) {
			// Work logic;
			for(int i = 1; i<=r;  i++) {
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
