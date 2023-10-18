package array;

import java.util.Scanner;

public class FindElementInAnArray {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0;  i<n;  i++ ){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        System.out.println(find(arr , data));
    }

    private static int find(int[] arr, int data) {
        int indx = -1;
        for(int i = 0;  i<arr.length;  i++){
            if(arr[i] == data){
                indx = i;
                break;
            }
        }
        return indx;
    }
}
