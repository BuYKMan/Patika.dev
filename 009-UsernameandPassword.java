package org.example;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String username,password,oldPassword="java123",newPassword = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        username=input.nextLine();
        System.out.println("Enter your password:");
        password=input.nextLine();


        if(username.equals("patika")&&password.equals(oldPassword)){
            System.out.println("Giriş Yaptınız");
        }
        else if(username.equals("patika")&&!(password.equals(oldPassword))){
            System.out.println("Tekrar Deneyiniz");
            password=input.nextLine();
            if(!(password.equals(oldPassword))) {
                System.out.println("Şifreyi Değişitriniz");
                password=input.nextLine();
                while(password.equals(oldPassword)){
                    System.out.println("Yeni Şifreniz eskisiyle aynı olamaz tekrar deneyiniz");
                    password=input.nextLine();
                }newPassword=password;
            }
        }
        else
            System.out.println("Bilgileriniz Yanlış");
        if(newPassword!=null)
        System.out.println("Yeni Şifreniz:"+newPassword);
    }
      
}