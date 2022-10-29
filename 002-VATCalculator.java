package org.example;

import java.util.Scanner;

public class VATCalculator {
    public static void printResult(double Price,double VATwithPrice,double VATsPrice) {
        System.out.println("VATWithoutPrice: " + Price);
        System.out.println("VATWithPrice: " + VATwithPrice);
        System.out.println("VATsPrice: " + VATsPrice);
    }

    public static void main(String[] args) {
        //default value
        double Price = 0, VAT = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Price: ");
        Price = input.nextDouble();

        if (Price > 0 && Price < 1000) {
            VAT = 0.18;
            double VATsPrice = Price * VAT;
            double VATwithPrice = Price + VATsPrice;
            printResult(Price, VATwithPrice, VATsPrice);
        } else if (Price >= 1000) {
            VAT = 0.08;
            double VATsPrice = Price * VAT;
            double VATwithPrice = Price + VATsPrice;
            printResult(Price, VATwithPrice, VATsPrice);
        }

    }

}

