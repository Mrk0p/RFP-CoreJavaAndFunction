package com.bridgelabz.CoreJavaAndFunction;

import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a%2 == 0){
            System.out.println("is Even number: "+a);
        }
        else
            System.out.println("is Odd number: "+a);

    }
}
