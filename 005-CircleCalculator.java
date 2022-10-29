package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14;

        Scanner inp=new Scanner(System.in);
        System.out.println("enter the diameter of the circle: ");
        r=inp.nextInt();
        double Area =pi*r*r;
        double  circumference=2*pi*r;
        System.out.println("Area:"+Area);
        System.out.println("Circumference:"+circumference);

    }

        }








