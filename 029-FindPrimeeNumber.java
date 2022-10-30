package org.example;
//ASAL SAYI PROGRAMI
public class FindPerfectNumber {
    public static void main(String[] args) {

        String primeNumber = "";
        for (int i = 0; i <= 100; i++) {
            int counter = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    counter ++;
                }
            }
            if (counter == 1) {
                primeNumber = primeNumber + i + " ";
            }
        }
        System.out.println(primeNumber);

        }
    }

