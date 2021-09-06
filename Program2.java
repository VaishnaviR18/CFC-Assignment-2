package com.assignment1;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int n1, n2;
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n1, n2 and ch: ");
        n1 = s.nextInt();
        n2 = s.nextInt();
        ch = s.next().charAt(0);
        int result = calculation(n1, n2, ch);
        System.out.println("result = "+result);
    }
    public static int calculation(int a, int b, char c){
        if(c == '*') {
            return a*b;
        }
        else if(c == '/'){
            return a/b;
        }
        else if(c == '%'){
            return a%b;
        }
        else if(c == '+'){
            return a+b;
        }
        else if(c == '-'){
            return a-b;
        }
        else{
            return 0;
        }
    }
}
