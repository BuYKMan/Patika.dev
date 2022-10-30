package org.example;

import java.util.Scanner;

public class IkininKuvvetleriniBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Sayı giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4'ün kuvvetleri--> " + i);
        }

        for (int j = 1; j <= n; j *= 5) {
            System.out.println("5'in kuvvetleri--> " + j);
        }
    }
}
