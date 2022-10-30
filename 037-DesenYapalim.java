package org.example;

import java.util.Scanner;

public class DesenYapalim {
    public static int decreasePattern(int n) {

        if (n < 0||n==0)
            return n;
        else {
            System.out.print(n + "\t");
            return decreasePattern(n - 5);
        }

    }

    public static int increasePattern(int n, int inc) {

        if (n > inc)
            return n;
        else {
            System.out.print(n + "\t");
            return increasePattern(n + 5, inc);
        }


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int n = s.nextInt();
        increasePattern(decreasePattern(n),n);
    }
}
