package com.assignment1;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = s.nextInt();
        String temp = Integer.toString(num);
        int[] arr = new int[temp.length()];
        int[] a = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i < temp.length(); i++) {
            a[arr[i] - 1] = i + 1;
        }
        StringBuilder builder = new StringBuilder();
        for (int n : a) {
            builder.append(n);
        }
        int number = Integer.parseInt(builder.toString());
        System.out.println("The reverse of a number " + num+ " is " + number);
    }
}
