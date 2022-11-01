package Patika.dev;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args)
    {
        int size, temp=0;
        Scanner tara = new Scanner(System.in);
        System.out.print("Siralamak istediginiz array boyutunu giriniz:");
        size = tara.nextInt();

        if(size>0)
        {
            int[] arr = new int[size];
            for(int i=0;i<size;i++)
            {
                System.out.printf("%d. elemani giriniz:",i+1);
                arr[i]= tara.nextInt();
            }

            System.out.println("Siralanmamis dizi: "+ Arrays.toString(arr));

            for(int i=0;i<size;i++)
            {
                for(int j=i+1;j<size;j++)
                {
                    if(arr[i] > arr[j])
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println("Siralanmis dizi: "+Arrays.toString(arr));
        }

        else
        {
            System.out.print("Hatali giris.");
            System.exit(0);
        }

    }
}
