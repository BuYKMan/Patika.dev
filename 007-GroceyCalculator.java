package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double    Pear = 2.14;
    double    Apple = 3.67;
    double    Tomato = 1.11;
    double    Banana= 0.95;
    double    Aubergine = 5.00;

        Scanner input =new Scanner(System.in);
        System.out.println("how many kilos of pear did you buy:");
        double Pearkg=input.nextDouble();
        System.out.println("how many kilos of apples did you buy:");
        double Applekg=input.nextDouble();
        System.out.println("how many kilos of tomato did you buy:");
        double Tomatokg=input.nextDouble();
        System.out.println("how many kilos of banana did you buy:");
        double Bananakg=input.nextDouble();
        System.out.println("how many kilos of aubergine did you buy:");
        double Auberginekg=input.nextDouble();


        double TotalPrice=(Pearkg*Pear)+(Applekg*Apple)+(Tomatokg*Tomato)+(Bananakg*Banana)+(Auberginekg*Aubergine);
        System.out.println("Total Price:"+TotalPrice);
    }

        }








