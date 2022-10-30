package org.example;

import java.util.Scanner;

public class MaxMinCalculator {
    public static void main(String[] args) {
        int ValuesNumber=0,max=0,min=0,personsnumber;
        Scanner in =new Scanner(System.in);
        System.out.println("Kaç sayi Gireceksiniz:");
        ValuesNumber=in.nextInt();
        for(int i=0;i<ValuesNumber;i++){
            personsnumber=in.nextInt();
            if(i==0){
                max=personsnumber;
                min=personsnumber;
            }
            else{
                if(personsnumber>max)
                    max=personsnumber;
                if(personsnumber<min)
                    min=personsnumber;
            }

        }
        System.out.println("max:"+max +"  min:"+min);
    }
}
