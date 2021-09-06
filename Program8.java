package com.assignment1;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        int n, m;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+n+" elements of an array : ");
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        m = multipleOfFive(arr, n);
        System.out.println("Multiples of five in an array = "+m);
    }
    public static int multipleOfFive(int[] a, int len){
        int count =0;
        for(int i=0; i<len; i++){
            if(a[i]%5 == 0){
                count++;
            }
        }
        return count;
    }
}
