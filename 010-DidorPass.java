package org.example;

import java.util.Scanner;

public class Didpassclass {
    public static void main(String[] args) {
        int math,physics,Turkish,Chemical,Music;
        Scanner in=new Scanner(System.in);

        System.out.println("Entry your Math's Score:");
        math=in.nextInt();

        System.out.println("Entry your Physics's Score:");
        physics=in.nextInt();
        System.out.println("Entry your Turkish's Score:");
        Turkish=in.nextInt();
        System.out.println("Entry your Chemical's Score:");
        Chemical=in.nextInt();
        System.out.println("Entry your Music's Score:");
        Music=in.nextInt();

        double avarge=(math+physics+Turkish+Chemical+Music)/5;

        if(!(avarge<0||avarge>100)) {
            if (avarge <= 55) {
                System.out.println("you didn't pass upper class");
            } else
                System.out.println("you passed upper class");
        }
    }
}
