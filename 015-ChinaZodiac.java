package org.example;

import java.util.Scanner;

public class ChinaZodiac {
    /*
Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun*/
    public static void main(String[] args) {
        int year;
        Scanner in=new Scanner(System.in);
        System.out.println("entry year:");

        year=in.nextInt();
        int temp=year%12;

        switch (temp)
        {case 0 : System.out.println("Maymun"); break;
            case 1 : System.out.println("kaplan"); break;
            case 2 : System.out.println("horoz"); break;
            case 3 : System.out.println("köpek"); break;
            case 4 : System.out.println("domuz"); break;
            case 5 : System.out.println("fare"); break;
            case 6 : System.out.println("öküz"); break;
            case 7 : System.out.println("tavşan"); break;
            case 8 : System.out.println("ejderha"); break;
            case 9 : System.out.println("yılan"); break;
            case 10 : System.out.println("at"); break;
            case 11: System.out.println("Koyun"); break;

        }
    }
}
