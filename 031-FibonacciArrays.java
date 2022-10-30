package org.example;

public class FibonacciArrays {
    public static void main(String[] args) {

        long fibonacci1=1;
        long fibonacci2=1;
        long temp=0;
        System.out.println(fibonacci1);
        System.out.println(fibonacci2);

        for(int i=0;i<50;i++){
            if(i==0) {
                temp=fibonacci1+fibonacci2;
                System.out.println(fibonacci1+" + "+fibonacci2+" = "+temp);
            }
            else  {
                fibonacci1=temp;
                temp=temp+fibonacci2;
                System.out.println(fibonacci1+" + "+fibonacci2+" = "+temp);
                fibonacci2=fibonacci1;
            }

        }
    }
}
