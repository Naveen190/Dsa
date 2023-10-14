package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int star = 1;
		int space = (n + 1)/2;
		
		for(int r = 1;  r <= n;  r++) {
			for(int i = 1;  i <= star;  i++) {
				System.out.print("*\t");
			}
			for(int i = 1;  i<= space;  i++) {
				System.out.println("\t");
				
			}			
			for(int i = 1;  i <= star;  i++) {
				System.out.print("*\t");
			}
		}
		System.out.println();
		space--;
		
		
		// Second approach
//		for(int r =1;  r<=n;  r++) {
//			for(int c = 1;  c<=n;  c++) {
//				if(r == c || r + c == n +1) {
//					System.out.print("*\t");
//				}
//				else {
//					System.out.print("\t");
//				}
//				
//			}
//			System.out.println();
//		}
	}

}
