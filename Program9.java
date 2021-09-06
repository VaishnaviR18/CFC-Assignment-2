package com.assignment1;

import java.util.Scanner;

public class Program9 {
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
        m = primeNumber(arr, n);
        System.out.println("Number of prime numbers in an array = "+m);
    }
    public static int primeNumber(int[] a, int len){
        int count =0;
        for(int i=0; i<len; i++){
            if(a[i]<=1){
                count++;
            }
            else{
                for(int j=2; j<=a[i]/2; j++){
                    if(a[i] % j == 0) {
                        count++;
                    }
                }
            }
        }
        return len-count;
    }
}
