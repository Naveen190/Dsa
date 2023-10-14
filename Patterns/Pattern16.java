package Patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int spc = 2*n - 3;
		for(int r = 1; r<=n;  r++) {
			int lv = 1;
			for(int i = 1;  i<=r;  i++) {
				System.out.print(lv+"\t");
				lv++;
			}
			for(int i = 1;  i<=spc;  i++) {
				System.out.print("\t");
			}
			int rcnt = (r == n) ? r - 1 : r;
			int rv = rcnt;
			for(int i = 1;  i<=rcnt;  i++) {
				System.out.print(+rv + "\t");
				rv--;
			}
			System.out.println();
			spc-=2;
		}
	}

}
