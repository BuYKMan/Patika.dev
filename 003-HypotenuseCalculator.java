package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
                int a, b;
                double c;
                int Area;

                Scanner input = new Scanner(System.in);
                System.out.print("Enter side of A triangle: ");
                a = input.nextInt();
                System.out.print("Enter side of A triangle : ");
                b = input.nextInt();

                c = Math.sqrt((Math.pow(a, 2)) + Math.pow(b, 2));
                Area = (a * b) / 2;
                System.out.println("Hypotenuse: " + c);
                System.out.println("Area: " + Area);

            }

        }








