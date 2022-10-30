package org.example;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("C(n,pattern) kombinasyonu için değerleri giriniz.");
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("pattern: ");
        int r = sc.nextInt();

        System.out.print(combination(n,r));
    }

    public static int factorial(int n)
    {
        int nFactorial = 1;

        for (int i = n; i > 0; i--) {
            nFactorial *= i;
        }
        return nFactorial;
    }

    public static int combination(int n, int r)
    {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
