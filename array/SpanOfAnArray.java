package array;

import java.util.Scanner;

public class SpanOfAnArray {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int span = Span(arr);
        System.out.println(span);
    }

    private static int Span(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int j : arr) {
            // Max update
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = arr[j];
            }
        }
        return max - min;
    }
}
