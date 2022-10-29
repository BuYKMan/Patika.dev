package org.example;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b;
        double c;

        System.out.println("Enter first number: ");
        a = input.nextInt();

        System.out.println("Enter second number: ");
        b = input.nextInt();

        System.out.println("1) Addition \n 2) Subtraction \n 3)Multiplication \n 4) Division\n 5)Mod Retrieval");
        System.out.println("Choose");
        int sec = input.nextInt();

        switch (sec) {
            case 1:
                c = (a + b);
                System.out.println("Addition : " + c);
                break;

            case 2:
                c = (a - b);
                System.out.println("Subtraction : " + c);
                break;
            case 3:

                c = (a * b);
                System.out.println("Multiplication : " + c);
                break;
            case 4:
                c= (a/b);
                System.out.println("Division sonucu : "+ c);
                break;

            case 5:
                c=(a/b);
                System.out.println("Mod Retrieval:"+c);
            default:
                System.out.println("Invalid Operation");
        }

    }
}