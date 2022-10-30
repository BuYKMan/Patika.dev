package org.example;

import java.util.Scanner;

public class ArmstrongSayıHesaplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int bigNumber = 0, value; //bignumber basamak sayisi
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int number = scan.nextInt();
        int temp1 = number;
        int temp2 = number;
        if (temp1 < 999) {
            while (temp1 > 0) {
                temp1 /= 10;
                bigNumber++;
            }
            while (temp1 > 0) {
                value = temp1 % 10;
                toplam += Math.pow(value, bigNumber);
                temp1 /= 10;
            }
            if (toplam == temp2) {
                System.out.println(temp2 + " sayisi armstrong bir sayidir.");
            } else {
                System.out.println(temp2 + " sayisi armstrong bir sayi degildir.");
            }


        } else {
            System.out.println("Yanllıısss ");
        }
    }
}
