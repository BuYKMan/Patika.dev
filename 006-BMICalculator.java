package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double length, weight, bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your length by meter: ");
        length = input.nextDouble();
        System.out.print("Enter your weight by kg: ");
        weight = input.nextDouble();

        bmi = (weight / (length*length));
        System.out.println("BMI: " + bmi);
    }

        }








