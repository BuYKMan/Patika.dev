package org.example;

import java.util.Scanner;

public class BurcCalculator {
    /*Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat                      OK

Balık Burcu : 20 Şubat - 20 Mart                    OK */
    public static void main(String[] args) {
        int month,day,error=0;
        String burc;
        Scanner input=new Scanner(System.in);



        do{
            do {
                error=0;
                System.out.println("enter your birth Month");
                month=input.nextInt();
                if(month<0||month>12){
                    System.out.println("are you serious?");
                error=1;}
            }while(error==1);

            do {
                error=0;
                System.out.println("enter your birth day");
                day=input.nextInt();
                if(day<0||day>31){
                    System.out.println("are you serious?");
                    error=1;
                     }
                if(month==2&& day==29){
                    System.out.println("Hadi canım sende :)");
                }
            }while(error==1);

            if((month==1&& day>=22)||(month==2&&day<=19)){//Kova
            burc="Kova";
        }

        else if((month==2&& day>=20)||(month==3&&day<=20)){//Balik
            burc="Balik";
             }

        else if((month==3&& day>=21)||(month==4&&day<=20)){//Koc
            burc="Koc";
        }

        else if((month==4&& day>=21)||(month==5&&day<=21)){//Boga

            burc="Boga";}

        else if((month==5&& day>=22)||(month==6&&day<=22)){//İkizler

            burc="Ikizler";}

        else if((month==6&& day>=23)||(month==7&&day<=22)){//Yengeç

            burc="Yengec";}

        else if((month==7&& day>=23)||(month==8&&day<=22)){//Aslan

            burc="Aslan";}

        else if((month==8&& day>=23)||(month==9&&day<=22)){//Başak
            burc="Başak";
        }

        else if((month==9&& day>=23)||(month==10&&day<=22)){//Terazi
            burc="Terazi"; }

        else if((month==10&& day>=23)||(month==10&&day<=21)){//Akrep
            burc="Akrep";
        }

        else if((month==11&& day>=22)||(month==12&&day<=21)){//Yay
            burc="Yay";
        }

        else if((month==12&& day>=22)||(month==2&&day<=21)){//Oglak
        burc="Oglak";
        }
        else {
            burc=null;
            System.out.println("Baba öyle bir şey mümkün değil be :)");
        }
        }while (burc==null);
        System.out.println("Burcun:"+burc);
    }
}

