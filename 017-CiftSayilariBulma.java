package org.example;

import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {
        int k;
        int counter = 0, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        k = input.nextInt();

        for( int i = 0; i  < k; i++){
            if( i % 3 == 0 && i % 4  == 0){
                total += i;
                counter++;
            }
        }

        int avarage = total / counter;
        System.out.print(avarage);


    }
}
