package org.example;

import java.util.Scanner;

public class BuildReverseTriangle {
    public static void main(String[] args) {
        int value;
        Scanner in= new Scanner(System.in);
        value=in.nextInt();

        for(int i=value;i>=0;i--){
            System.out.println("");
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
        }
    }
}
