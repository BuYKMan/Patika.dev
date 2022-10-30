package org.example;

public class RecursiveAsalSayi {
    final static int i=2;
    static void asal(int sayi,int i) {

        if (i==sayi) {
            System.out.println(sayi +"  asal sayıdır.");
            return;
        } else if (sayi%i==0) {
            System.out.println(sayi +"  asal sayı değildir.");
            return;
        }
        asal(sayi, i+1);
    }


    public static void main(String[] args) {

        asal(11,i);
    }
}
