package com.bridgelabz.CoreJavaAndFunction;

import java.util.Scanner;

public class QuoitentAndRemainder {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Dividend number :");
        int a = scanner.nextInt();

        System.out.println("Enter Divisor number :");
        int b = scanner.nextInt();

        int q = a/b;
        int r = a%b;

        System.out.println(" Quotient is " + q);
        System.out.println(" Remainder is " + r);
    }
}
