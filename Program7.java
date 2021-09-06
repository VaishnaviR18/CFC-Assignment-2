package com.assignment1;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        int m, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two number: ");
        m = s.nextInt();
        n = s.nextInt();
        int l = lcm(m, n);
        System.out.println("LCM of "+m+" & "+n+" = " + l);
    }
    public static int lcm(int a, int b){
        int c = 1, d;
        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0){
                c = i;
            }
        }
        d = (a*b)/c;
        return d;
    }
}
