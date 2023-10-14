package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		* * *
//		* *
//		*
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		for(int r = n;  r>=1; r--) {
			for(int i = 1;  i<=r;  i++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
