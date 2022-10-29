package org.example;

import java.util.Scanner;

public class ArtikYear {

    //İnceleyen arkadaşım komik değil biliyorum ama kafa kalmadı bende takılma :)
    public static void main(String[] args) {
        int year;
        Scanner in=new Scanner(System.in);
        System.out.println("yılı giriniz:");
        year=in.nextInt();
        if(year%4==0){
            System.out.println("Tebrikler Artık yılı Buldunuz");
        }
        else
            System.out.println("Artık Yılı Bulamadınız");
    }
}
