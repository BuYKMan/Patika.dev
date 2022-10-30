package org.example;

import java.util.Scanner;

public class HarmonikSayıHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Up to which number you wanna calculate the harmonic numbers?");
        int number = input.nextInt();
        double i = 1;
        double total = 0;
        while (i <= number) {
            total += (1 / i);
            i++;
        }
        System.out.println("Result:" + total);
    }
}
