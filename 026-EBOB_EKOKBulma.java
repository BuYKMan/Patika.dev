package org.example;

import java.util.Scanner;

public class EBOB_EKOKBulma {
    public static void main(String[] args) {
        int n1, n2;
        Scanner bjk = new Scanner(System.in);

        System.out.println("n1 sayisini giriniz :");
        n1 = bjk.nextInt();

        System.out.println("n2 sayisini giriniz :");
        n2 = bjk.nextInt();

        if (n2 > n1) {

            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.println("E.B.O.B (" + n1 + " , " + n2 + ") = " + i);
                    int ebob = i;
                }
            }


        } else {
            for (int j = 1; j <= n2; j++) {
                if (n1 % j == 0 && n2 % j == 0) {
                    System.out.println("E.B.O.B (" + n2 + " , " + n1 + ") = " + j);
                    int ebob = j;
                }
            }
        }

        System.out.println("==================");
        int k = 1;

        while (k <= n1 * n2) {
            k++;

            if (k % n1 == 0 && k % n2 == 0) {
                System.out.println("E.K.O.K  = " + k);
                break;
            }
        }


    }
}
