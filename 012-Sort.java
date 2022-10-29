package org.example;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);

        System.out.println("1.number:");
        a=in.nextInt();

        System.out.println("2.number:");
        b=in.nextInt();

        System.out.println("3.number:");
        c=in.nextInt();

        if((a>b)&&(a>c)){
            if(b>c)
                System.out.println("c<b<a");
            else
                System.out.println("b<c<a");
        }
        else if((b>a)&&(b>c)){
            if(a>c)
                System.out.println("c<a<b");
            else
                System.out.println("a<c<b");
        }
        else {
            if (b > a)
                System.out.println("a<b<c");
            else
                System.out.println("b<a<c");
        }
    }
}
