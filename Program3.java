package com.assignment1;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a char: ");
        ch = s.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("It is Upper case.");
        }
        else{
            System.out.println("It is Lower Case");
        }
    }
}
