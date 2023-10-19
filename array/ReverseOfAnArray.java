package array;

import java.util.Scanner;

public class ReverseOfAnArray {

    public static void reverse(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for(int val : arr){
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0;  i<n;  i++){
            arr[i] = scn.nextInt();
        }
        reverse(arr);
        display(arr);
    }
}
