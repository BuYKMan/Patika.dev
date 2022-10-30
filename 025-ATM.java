package org.example;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String user, pass;
        Scanner scanner = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int secim;

        while (right > 0){
            System.out.print("Kullanıcı adınız: ");
            user = scanner.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            pass = scanner.nextLine();

            if (user.equals("Mike") && pass.equals("123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
                System.out.println(" 1-para yatırma" +"\n 2-para çekme" + "\n 3-bakiye sorgula"+"\n 4-çıkış yap");
                secim = scanner.nextInt();
                switch (secim){
                    case 1:
                        System.out.print("Yatırmak istediğin miktarı girin: ");
                        int price= scanner.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Çekeceğin para miktarı: ");
                        price = scanner.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye yetersiz..");
                        }else{
                            balance -= price;
                            System.out.println("Kalan Miktar: " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Kalan bakiye = "+ balance);
                        break;
                    case 4:
                        System.out.println("İyi günler. Yine bekleriz...");
                        break;

                }break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }

        }
    }

}
