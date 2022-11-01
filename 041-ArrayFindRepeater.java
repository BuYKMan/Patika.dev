package Patika.dev;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFindRepeater {
    public static void main(String[] args) {
        int a=3;
        int[] list= new int[a];
        Scanner input = new Scanner(System.in);
        System.out.println("Değerleri siz mi girmek(0) isterseniz hazır mı olsun(1)?");
        int temp1= input.nextInt();
        if (temp1 == 0) {
            for(int i=0;i<a;i++) {
                int temp =input.nextInt();
                list[i]=temp;
            }

        } else if (temp1 == 1) {
            list = new int[]{12, 23, 98, 43, 12, 12, 25, 97, 67, 35, 38, 97, 48, 12, 57, 34};
            System.out.println(list.length);
        }
            int[] count = new int[list.length];
            System.out.println("Dizi: " + Arrays.toString(list));

            for (int i = 0; i < list.length; i++) {
                count[i] = 1;
            }
            for (int i = 0; i < list.length; i++) {
                for (int j = i; j < list.length; j++) {
                    if ((i != j) && (list[i] == list[j])) {
                        count[i]++;
                    }
                }
            }
            for (int i = 0; i < list.length; i++) {
                for (int j = i; j < list.length; j++) {
                    if ((j != i) && (list[i] == list[j])) {
                        count[j] = count[i];
                    }
                }
            }
        System.out.println("Tekrar eden sayilar");
        for (int i = 0; i < list.length; i++) {
            if (i != 0) {
                System.out.println(list[i] + " sayisi " + count[i] + " kere tekrar edildi");
                    }

            }
    }
}
