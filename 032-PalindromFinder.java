package org.example;

import java.util.Scanner;

public class PalindromFinder {

    static boolean isPalindorm(int number) {
        int temp = number, reversenumber = 0, lastnumber;
        while (temp != 0) {
            lastnumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temp /= 10;
            System.out.println(reversenumber);
            System.out.println(number);
        }
        if(number==reversenumber)
            return  true;
        else
            return  false;
    }

    public static void main(String[] args) {
        int value=0;
        Scanner in= new Scanner(System.in);
        while(value!=-1) {
            System.out.print("Değer Giriniz:");
            value = in.nextInt();
            System.out.println(isPalindorm(value));
        }
        }
}
