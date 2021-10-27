package day05_Exercises;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        /*
		 *kulllanicinin ad soyad yas boy kilosunu alt alta yazdirin 
		 */

        Scanner scan=new Scanner(System.in);

        System.out.print("Adinizi giriniz :");
        //System.out.print ---> girilen veriyi ayni satira yazdirir
		//System.out.println --> girilen veriyi bir alt satira yazdirir
        String name=scan.nextLine();

        System.out.print("Soyadinizi giriniz: ");
        String surName=scan.nextLine();

        System.out.print("Yasinizi giriniz :");
        int age=scan.nextInt();

        System.out.print("Boyunuzu giriniz : ");
        int boy=scan.nextInt();

        System.out.print("Kilonuzu giriniz :");
        int kilo=scan.nextInt();


        System.out.println("Benim adim: " +name+ "\n"
        +"Benim soyadim: " +surName+ "\n"
        +"Benim yasim:" +age+ "\n"
        +"Benim boyum: "+boy+ "cm"+"\n"
        +"Benim kilom: "+kilo+ "kg");

        /*  adinizi giriniz :Burak
            soyadinizi giriniz :Sarisahin
            yasinizi giriniz :40
            boyunuzu giriniz :170
            kilonuzu giriniz :	80
            benim adim:Burak
            soyadim :Sarisahin
            yasim:40
            boyum :170cm
            kilom :80kg 
		*/


        scan.close();
    }
}
