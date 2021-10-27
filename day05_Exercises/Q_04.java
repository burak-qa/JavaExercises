package day05_Exercises;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        //Kullanicidan 2 tam sayinin dort islem sonucunu yazdiriniz.

        Scanner scan=new Scanner(System.in);

        System.out.println("birinci sayiyi giriniz : "); //kullaniciya 1. sayi girmesinin bildirimini yazdirdik
        int num1=scan.nextInt();

        System.out.println("ikinci sayiyi giriniz : "); //kullaniciya 2. sayi girmesinin bildirimini yazdirdik
        int num2=scan.nextInt();



        System.out.println("Girilen sayilarin toplami :" +(num1+num2));
        System.out.println("Girilen sayilarin farki :" +(num1-num2));
        System.out.println("Girilen saylarin carpimi :" +(num1*num2));
        System.out.println("Girilen sayilarin bolumu :" +(num1/num2));

        // \n yazarak tek bir satirda 4 ciktiyi yazdira biliriz	

        System.out.println("Girilen sayilarin toplami :"+(num1+num2)+ "\n"
        +"Girilen sayilarin farki :"+ (num1-num2)+ "\n"
        +"Girilen sayilarin carpimi :" + (num1*num2)+ "\n"
        + "Girilen sayilarin bolumu :" + (num1/num2) );









        scan.close();
    }
}
