package com.bridgelabz.CoreJavaAndFunction;

import java.util.Scanner;

public class HarmonicNumber {
    
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double num = 0.0;
        if(x > 0){
            double i;
            for ( i = 1; i <= x; i++){
                num = (1/i) + num;
                System.out.println(num);
            }
            }
        else {
            System.out.println("Invalid number:");
        }
    }
}
