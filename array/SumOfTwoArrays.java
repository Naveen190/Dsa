package array;

import java.util.Scanner;

public class SumOfTwoArrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] sum = sumOf2Arrays(a1, a2);
        for (int i = 0; i < sum.length; i++) {
            if (i == 0 && sum[0] == 1) {
                System.out.println(sum[i]);
                
            } else if (i > 0) {
                System.out.println(sum[i]);
            }
        }

    }

    private static int[] sumOf2Arrays(int[] a1, int[] a2) {
        int len = a1.length > a2.length ? a1.length + 1 : a2.length + 1;
        int[] res = new int[len];
        int carry = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = res.length - 1;

        while (k >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a1[i];
            }

            if (j >= 0) {
                sum += a2[j];
            }
            int val = sum % 10;
            carry = sum / 10;

            res[k] = val;
            i--;
            j--;
            k--;
        }
        return res;
    }
}
