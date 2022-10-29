package org.example;

import java.util.Scanner;

public class VATCalculator {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter the product price:");
        double price=imp.nextDouble();
        double VAT=18;
        double VATsPrice=price*(VAT/100);
        double VATwithPrice = VATsPrice+price;
        System.out.println("VAT:"+VAT);
        System.out.println("VATWithoutProductPrice:"+price);
        System.out.println("VATsProductPrice:"+VATsPrice);
        System.out.println("VATWithPrice:"+VATwithPrice);
    }
}
