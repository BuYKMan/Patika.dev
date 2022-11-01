package Patika.dev;

import java.util.Scanner;

public class Harmon {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz.");
        int row = s.nextInt();
        double[] array = new double[row];
        double avg;
        double total = 0.0;
        System.out.println("bu dizide eleman sayısı kadar değer giriniz.");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            total += 1 + (1 / (array[i]));
        }
        avg = total / array.length;
        if (array.length == 0) {
            System.out.println("Ortalama hesaplanamaz!");
        } else {
            System.out.print("Dizinin toplamı: ");
            System.out.print("\t" + total);
            System.out.println();
            System.out.print("Dizinin harmonik ortalaması: ");
            System.out.print("\t" + avg);
        }

    }
}