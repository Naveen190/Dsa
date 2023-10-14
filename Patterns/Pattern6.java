package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Holo Diamond
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int star = (n+1)/2;
		int space = 1;
		
		for(int r = 1;  r<=n;  r++) {
			for(int i = 1;  i<=star;  i++) {
				System.out.print("*\t");
			}
			for(int i = 1;  i<=space;  i++) {
				System.out.print("\t");
			}
			for(int i =1; i<=star;  i++) {
				System.out.print("*\t");
			}
			System.out.println();
			if(r > n/2) {
				star++;
				space-=2;
			}
			else if(r<=n/2) {
				star--;
				space+=2;
			}
		}

	}

}
