package org.example;

import java.util.Scanner;

public class PlaneJourneyCalculator {
    /*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
    public static void main(String[] args) {
        int distance,journerAge;
        int evenorodd=2;
        float distanceperKm=0.1F;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Gideceğinizi mesafeyi giriniz:");
            distance = in.nextInt();
            System.out.println("Yaşınızı Giriniz");
            journerAge = in.nextInt();
            System.out.println("Gidiş mi Gidiş-Dönüş mü istersiniz");
            while(!(evenorodd==0||evenorodd==1)){
            System.out.println("Gidiş için 0 Gidiş-Dönüş için 1");
            evenorodd = in.nextInt();}
        }while(!(distance>0&&journerAge>0));

        float price=(distance*distanceperKm);
        System.out.println("Normal Tutarınız:"+price);
        System.out.println("Yaş İndiriminiz"+(price-ageCalculator(journerAge,price)));//fonksiyon yaz
        float total=price+(-ageCalculator(journerAge,price));
        System.out.println("Yaş İndirimyile Tutarınız:"+total);
        if(evenorodd==1){
        total= (float)(((total)*2)*0.8);
        System.out.println("Gidiş Dönüş Bileti İndiriminiz:"+total/4);
        };
        System.out.println("Toplam Tutarınız:"+total);


    }

    static float ageCalculator(int journerage, float price){
        if(journerage<12){
            return (float) (price*0.5);
        }
        else if(journerage>12&&journerage<24){
            return (float) (price*0.9);

        }
        else if(journerage>65){
            return (float) (price*0.7);

        }
        else
            return price;
    }
}
