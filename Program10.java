package com.assignment1;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        int n, result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+n+" elements of an array : ");

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        result = isArraySorted(arr);

        if (result == 1)
            System.out.println("The array is sorted in ascending order.");
        else if (result == 2)
            System.out.println("The array is sorted in descending order.");
        else
            System.out.println("The array is not sorted.");
    }

    public static int isArraySorted(int[] ar) {
        int a = 1, d = 1, i = 0;

        while ((a == 1 || d == 1) && i < ar.length - 1) {
            if (ar[i] < ar[i+1])
                d = 0;
            else if (ar[i] > ar[i+1])
                a = 0;
            i++;
        }

        if (a == 1)
            return 1;
        else if (d == 1)
            return 2;
        else
            return 0;
    }
}
