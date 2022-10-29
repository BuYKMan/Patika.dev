package org.example;

import java.util.Scanner;

public class WeatherSituation {
    public static void main(String[] args) {

        boolean temp;
        int temparaute;
        Scanner input=new Scanner(System.in);
        temparaute=input.nextInt();

        temp= (temparaute<5);
        if(temp)
            System.out.println("Kayak Yapabilirsiniz");
        else if(temparaute <=25){
            if(temparaute<=15)
                System.out.println("Sinemaya gidebilirsin");
            if(temparaute>=10)
                System.out.println("Pikniğe gidebilirsin");
        }
        else
            System.out.println("Yüzmeye gidebilirsin");




    }


}
