package Patika.dev;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatArrayIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu  : ");
        int[] list = {10,50,20,20,20,40,30,40,40,40,40,50};
        int[] list2 = new int[list.length];


        Arrays.sort(list);
        System.out.println("Dizi  : " + Arrays.toString(list));

        int repeater = 0;
        for (int x : list) {
            int a = 0;
            for (int j = 0; j < list.length; j++) {
                if (x == list2[j]) {
                    a++;
                }
            }
            if (a == 0) {
                int sayac = 0;
                for (int i : list) {
                    if (x == i) {
                        sayac++;
                    }
                }
                list2[repeater] =x;
                repeater++;
                System.out.println(x + " sayısından " + sayac + " tane var ");
            }
        }

    }
}
