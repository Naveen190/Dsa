package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int star = 1;
		int space = 0;
		
//		for(int r = 1;  r<=n;  r++) {
//			for(int i = 1;  i<=space;  i++) {
//				System.out.print("\t");
//			}
//			for(int i = 1; i<=star;  i++) {
//				System.out.print("*\t");
//			}
//		
//			System.out.println();
//			space++;
//		}
		
		//Second Approach
		
		for(int r = 1;  r<=n;  r++) {
			for(int c = 1;  c<=n;  c++) {
				if(r == c) {
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
