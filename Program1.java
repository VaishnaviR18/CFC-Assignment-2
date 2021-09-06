package com.assignment1;

import java.util.Scanner;

public class Program1 {
        public static void main(String[] args) {
            long num;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the decimal number:");
            num = s.nextInt();

            long dec = dec2oct(num);

            System.out.println("Number "+num+" in decimal to octal"+" = "+dec);
        }

        public static long dec2oct(long num) {
            long n = 0, place = 1;
            long rem;

            while (num > 0) {
                rem = num % 8;
                num /= 8;
                n = (rem * place) + n;
                place = place * 10;
            }
            return n;
        }
}

