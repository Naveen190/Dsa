package Patterns;

import java.util.Scanner;

public class PatternTest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int valc = 1;
		int spc = n/2;
		
		for(int r = 1;  r<=n;  r++) {
			for(int i = 1;  i<=spc;  i++) {
				System.out.print("\t");
			}
			int val = r;
			for(int i = 1;  i<=valc;  i++) {
				System.out.print(val +"\t");
				val++;
			}
			System.out.println();
			if(r <= n/2) {
				spc--;
				valc+=2;
			}else {
				spc++;
				valc-=2;
			}
		}

	}

}
