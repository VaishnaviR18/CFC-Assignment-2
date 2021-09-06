package com.assignment1;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        int n, target;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the "+n+" elements of an array : ");
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the target number: ");
        target = s.nextInt();
        triplet(arr, n, target);
    }
    public static void triplet(int[] a, int n, int s){
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == s) {
                        System.out.println("("+a[i]+", "+a[j]+", "+a[k]+")");
                    }
                }
            }
        }
    }
}
