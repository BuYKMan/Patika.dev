package Patika.dev;

import java.util.Scanner;

public class MatrisTranspozesi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını giriniz : ");
        int row = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz : ");
        int column = scanner.nextInt();

        int[][] matris = new int[row][column];
        int[][] transpoze = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((i + 1) + ". satır " + (j + 1) + ". sütun : ");
                matris[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        System.out.println("Matris : ");
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println();

        System.out.println("Transpoze : ");
        System.out.println();

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
