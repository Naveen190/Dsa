package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int space = n-1;
		int star = 1;
		
		// First Approach
//		for(int r = 1;  r<=n;  r++) {
//			for(int i = 1;  i<=space;  i++) {
//				System.out.print("\t");
//			}
//			for(int i = 1;  i<=star;   i++) {
//				System.out.print("*\t");
//			}
//			System.out.println();
//			space--;
//		}
		
		// Second Approch
		for(int r = 1;  r<=n;  r++) {
			for(int c =1; c<=n;  c++) {
				if(r + c == n + 1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
