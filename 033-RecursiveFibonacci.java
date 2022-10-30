package org.example;

public class RecursiveFibonacci {
    // 1 1 2 3 5 8 ...

    static int Fibonacci(int value){
        if(value==1||value==2)
            return 1;
        else
            return Fibonacci(value-1)+Fibonacci(value-2);
    }

    public static void main(String[] args) {
        int aa=18;
        System.out.println(Fibonacci(aa));;
        System.out.println(aa);
    }
}
