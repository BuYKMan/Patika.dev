package org.example;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
//MUKEMMEL SAYI PROGRAMI
public class FindPrimeNumber {
    public static void main(String[] args) {
        int value;
        Scanner in = new Scanner(System.in);
        System.out.println("değer giriniz");
        value = in.nextInt();
        System.out.println(primeNumber(value));


    }

    @Contract(pure = true)
    static @NotNull String primeNumber(int value) {
        boolean perfect = false;
        int temp = (int) Math.sqrt(value);
        System.out.println(temp);
        for (int i = 2; i <= temp; i++) {
            perfect = (value %i == 0);
            if(perfect == true)
                return "asal sayı değildir";
        }

            return "asal sayıdır";



    }
}
