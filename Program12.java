package com.assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Program12 {
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
        result = separateEvenOddNumbers(arr, n);
        System.out.println("Array after separating even and odd numbers : "+ Arrays.toString(result));
    }
    public static int[] separateEvenOddNumbers(int[] a, int n) {
        int i, j = 0;
        int[] b = new int[n];
        for(i=0; i<n; i++) {
            if(a[i]%2==0) {
                b[j] = a[i];
                j++;
            }
        }
        for(i=0; i<n; i++) {
            if(a[i]%2 !=0) {
                b[j] = a[i];
                j++;
            }
        }
        return b;
    }
}
