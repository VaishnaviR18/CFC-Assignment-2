package com.assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        int[] result;
        System.out.println("Enter the "+n+" elements of an array : ");

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        result = reverse(arr, n);
        System.out.println("Array after reversing : "+ Arrays.toString(result));
    }
    public static int[] reverse(int[] a, int n) {
        int i, j = 0;
        int[] b = new int[n];
        for(i=n-1; i>=0; i--) {
            b[j] = a[i];
            j++;
        }
        return b;
    }
}
