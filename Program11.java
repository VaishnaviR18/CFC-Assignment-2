package com.assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+n+" elements of an array (only 0's and 1's)  : ");

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        sortArray(arr);
    }
    public static void sortArray(int[] a){
        int count = 0;
        for (int j : a) {
            if (j == 0) {
                count++;
            }
        }
        for(int i=0;i<count;i++){
            a[i] = 0;
        }
        for(int i=count;i<a.length;i++){
            a[i] = 1;
        }
        System.out.println("Sorted array: "+Arrays.toString(a));
    }
}
