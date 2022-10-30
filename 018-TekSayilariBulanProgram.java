package org.example;

import java.util.Scanner;

public class TekSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, total = 0;

        do {
            System.out.println("Sayi giriniz. ");
            number = inp.nextInt();

            if (number % 4 == 0) {
                total =total+ number;
            } else if (number % 2 == 1) {
                break;
            }


        } while (number % 2 == 0);
        System.out.println("totals of number: " + total);

    }
}
