package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        int math,physics,chemical,Turkish,history,music;
        boolean situation;//for passed or left

        //we define the Scanner class to get the values
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your math grade:");
        do {
            math = inp.nextInt();
        }while(math>100||math<0);
        System.out.println("Enter your physics grade:");
        do {
            physics = inp.nextInt();
        }while(physics>100||physics<0);

        System.out.println("Enter your chemical grade:");
        do {
            chemical = inp.nextInt();
        }while(chemical>100||chemical<0);

        System.out.println("Enter your Turkish grade:");
        do {
            Turkish = inp.nextInt();
        }while(Turkish>100||Turkish<0);

        System.out.println("Enter your history grade:");
        do {
            history = inp.nextInt();
        }while(history>100||history<0);

        System.out.println("Enter your music grade:");
        do {
            music = inp.nextInt();
        }while(music>100||music<0);

        int total = math+physics+chemical+Turkish+history+music;
        float result =total/6;
        System.out.println("Result:"+result);
        situation =result>60;
        if (situation) {
            System.out.println("passed");
        }
        else
            System.out.println("left");

    }






}