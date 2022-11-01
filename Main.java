package Patika;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        MineSweeper s1 =new MineSweeper();
    }
}
class MineSweeper
{
    Random rnd=new Random();
    Scanner input=new Scanner(System.in);

    public MineSweeper()
    {
        int eksenX,eksenY;
        int sayac,sayacTarla=0;
        System.out.println("Satır sayısı: "); eksenY=input.nextInt();
        System.out.println("Sütun sayısı: "); eksenX=input.nextInt();
        int mayinSayisi=(eksenX*eksenY)/4;

        String[][] mayinTarlasi =new String[eksenY][eksenX];
        String[][] mayin =new String[eksenY][eksenX];
        System.out.println(" Mayınların Konumu ");
        sayac=mayinSayisi;
        for(int i=0;i<eksenY;i++)
        {

            for(int j=0;j<eksenX;j++)
            {
                if(sayac>-1)
                {
                    int rastgeleY=rastgele(eksenY);
                    int rastgeleX=rastgele(eksenX);
                    if(mayin[rastgeleY][rastgeleX]==null)
                    {
                        sayac--;
                        mayin[rastgeleY][rastgeleX]="*";
                    }
                }
                if(mayinTarlasi[i][j]==null)
                {
                    mayinTarlasi[i][j]="-";

                }
                if(mayin[i][j]==null)
                {
                    mayin[i][j]="-";
                    sayacTarla+=1;
                }

                System.out.print(mayinTarlasi[i][j]+"  ");
                // System.out.print(mayin[i][j]+"  "); //Mayınları Konumunu Bastıran Kod

            }
            System.out.println();
        }

        int cevreMayin=0;
        int girilenSatir,girilenSutun;
        boolean sol,sag,ust,alt,solUC,sagUC,solAC,sagAC;
        int kontrol;

        while (true)
        {
            System.out.println("Satır Değeri Giriniz: "); girilenSatir=input.nextInt();
            System.out.println("Sütun Değeri Giriniz: "); girilenSutun=input.nextInt();
            System.out.println("Bayrak Koymak İçin -2,Alanı Açmak İçin -3 Tuşlayınız"); kontrol=input.nextInt();

            if(kontrol==-2)
            {
                sayacTarla--;
                mayinTarlasi[girilenSatir][girilenSutun]="^|";

                for(int i=0;i<eksenY;i++)
                {
                    for(int j=0;j<eksenX;j++)
                    {
                        System.out.print(mayinTarlasi[i][j]+"   ");
                    }
                    System.out.println();
                }
            }
            if(kontrol==-3)
            {
                if(girilenSatir<=eksenY && girilenSutun<=eksenX && girilenSatir>=0 && girilenSutun>=0)
                {
                    if(sayacTarla>1)
                    {
                        if(!mayin[girilenSatir][girilenSutun].equals("*"))
                        {
                            cevreMayin=0;

                            if(girilenSutun-1>=0 && girilenSutun-1<eksenX)
                            {
                                sol=mayin[girilenSatir][girilenSutun-1].equals("*");
                                if(sol)
                                    cevreMayin++;
                            }

                            if(girilenSutun+1>=0 && girilenSutun+1<eksenX)
                            {
                                sag=mayin[girilenSatir][girilenSutun+1].equals("*");
                                if(sag)
                                    cevreMayin++;
                            }

                            if(girilenSatir-1>=0 && girilenSatir-1<eksenY)
                            {
                                ust=mayin[girilenSatir-1][girilenSutun].equals("*");
                                if(ust)
                                    cevreMayin++;
                            }

                            if(girilenSatir+1>=0 && girilenSatir+1<eksenY)
                            {
                                alt=mayin[girilenSatir+1][girilenSutun].equals("*");
                                if(alt)
                                    cevreMayin++;
                            }

                            if(girilenSatir-1>=0 && girilenSutun-1>=0 && girilenSatir-1<eksenY && girilenSutun-1<eksenX)
                            {
                                solUC=mayin[girilenSatir-1][girilenSutun-1].equals("*");
                                if(solUC)
                                    cevreMayin++;
                            }

                            if(girilenSatir-1>=0 && girilenSutun+1>=0 && girilenSatir-1<eksenY && girilenSutun+1<eksenX)
                            {
                                sagUC=mayin[girilenSatir-1][girilenSutun+1].equals("*");
                                if(sagUC)
                                    cevreMayin++;
                            }

                            if(girilenSatir+1>=0 && girilenSutun-1>=0 && girilenSatir+1<eksenY && girilenSutun-1<eksenX)
                            {
                                solAC=mayin[girilenSatir+1][girilenSutun-1].equals("*");
                                if(solAC)
                                    cevreMayin++;
                            }

                            if(girilenSatir+1>=0 && girilenSutun+1>=0 && girilenSatir+1<eksenY && girilenSutun+1<eksenX)
                            {
                                sagAC=mayin[girilenSatir+1][girilenSutun+1].equals("*");
                                if(sagAC)
                                    cevreMayin++;
                            }


                            String cevreMayinS= String.valueOf(cevreMayin);
                            sayacTarla--;
                            mayinTarlasi[girilenSatir][girilenSutun]=cevreMayinS;

                        }
                        else
                        {
                            System.out.println("PATLADIN!");
                            System.out.println("Mayın Tarlası ");
                            for(int i=0;i<eksenY;i++)
                            {
                                for(int j=0;j<eksenX;j++)
                                {
                                    System.out.print(mayin[i][j]+"  ");
                                }
                                System.out.println();
                            }
                            break;
                        }


                    }
                    else
                    {
                        System.out.println("KAZANDINIZ!");

                        for(int i=0;i<eksenY;i++)
                        {
                            for(int j=0;j<eksenX;j++)
                            {
                                System.out.print(mayinTarlasi[i][j]+"   ");
                            }
                            System.out.println();
                        }
                        break;
                    }

                    for(int i=0;i<eksenY;i++)
                    {
                        for(int j=0;j<eksenX;j++)
                        {
                            System.out.print(mayinTarlasi[i][j]+"   ");
                        }
                        System.out.println();
                    }

                }
                else
                    System.out.println("Lütfen Geçerli Değerler Giriniz\nDizi Sınırları: "+eksenY+","+eksenX);

            }
            if(!(kontrol!=-2 || kontrol!=-3))
            {
                System.out.println("Geçersiz Değer!");
            }

        }





    }
    public int rastgele(int a)
    {
        return rnd.nextInt(0,a);
    }


}
