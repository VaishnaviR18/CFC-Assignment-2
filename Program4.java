package com.assignment1;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int num , rev = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = s.nextInt();
        int n = num;

        while(num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("The reverse of a number "+n+" is "+rev);
    }
}
