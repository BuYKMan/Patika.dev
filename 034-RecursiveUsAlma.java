package org.example;

public class RecursiveUsAlma {
    static int UsAlma(int taban,int us){
        if(us==1)
            return taban;
        else
            return taban*UsAlma(taban,us-1);

    }

    public static void main(String[] args) {
        System.out.println( UsAlma(15,2));;
    }
}
