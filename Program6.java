package com.assignment1;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        int m, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        m = s.nextInt();
        n = s.nextInt();
        int g = gcd(m, n);
        System.out.println("GCD of "+m+" & "+n+" = " + g);
    }
    public static int gcd(int a, int b){
        int c = 1;
        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0){
                c = i;
            }
        }
        return c;
    }
}
