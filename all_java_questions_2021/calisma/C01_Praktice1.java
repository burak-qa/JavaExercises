package calisma;

import java.util.Scanner;

public class C01_Praktice1 {

	public static void main(String[] args) {
		/*
        1.Kullaniciya    "Vize sinav sonucunuzu giriniz :"
        2.vize notu double degerinde girilecek.

        3. Kullaniciya  "Vize sinavi yuzdesini giriniz". ->> double olmali ->> 0,40 etkiliyor   !!Yuzde kac etkiledigini Sisteme siz giriyorsunuz.!!

        4.Kullaniciya    "Final sinav sonucunuzu giriniz.

        5. final notu double degerinde olmali. (orn: 65,5)

        6.Kullaniciya    "Final sinavi yuzdesini giriniz"-->> double olmali ->> 0,60 etkiliyor.

        7. Vize final ortalamasini bulmak icin, vize nin yuzde40 i, finalin yuzde60 i alinmali ve cikan sonuclar toplanmalidir.

        8. Cikan sonucu (dersin not ortalamasini)   double toplam  ' a esitleyebilirsiniz.

        todo  :  Kosul kismi
 			eger ortalamasi 90(90 dahil) 'dan buyuk ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 arasinda ise  
 			BA, 70(70 dahil)   ile 80 arasinda ise 
 			BB, 60(60dahil) ile 70 arasinda ise 
 			CB, 50(50 dahil) ile 60 arasinda ise 
 			CC, 40(40 dahil) ile 50 arasinda ise 
 			DC, 30(30 dahil) ile 40 arasinda ise 
 			DD, 30 'dan dusuk ise FF  gelmeli.
 			
         */
		Scanner scan=new Scanner(System.in);
		System.out.println("Vize sinav sonucunuzu giriniz :");
		double vize=scan.nextDouble();
		 if(vize<0 || vize>100) {
			 System.out.println("Lutfen gecerli bir not giriniz");
		 }else {
		System.out.println("Vize sinavi yuzdesini giriniz");
		 };
		double vizeYuzdesi=scan.nextDouble();
		
		System.out.println("Final sinav sonucunu giriniz");
		double fin=scan.nextDouble();
		if(fin<0 || fin>100) {
			 System.out.println("Lutfen gecerli bir not giriniz");
		 }else {
			 System.out.println("Final sinavi yuzdesini giriniz");
		 };
		
		double finYuzdesi=scan.nextDouble();
			
		double ortalama=(vize*vizeYuzdesi/100)+(fin*finYuzdesi/100);
		 System.out.println("Sinavlarin ortalamasi : " + ortalama);
		 
	
		 
		
		   if (ortalama>=90) {
			System.out.println("Notunuz : AA ");
		} else if (ortalama>=80) {
			System.out.println("Notunuz : BA ");
		} else if (ortalama>=70) {
			System.out.println("Notunuz : BB ");
		} else if (ortalama>=60) {
			System.out.println("Notunuz : CB ");
		} else if (ortalama>=50) {
			System.out.println("Notunuz : CC ");
		} else if (ortalama>=40) {
			System.out.println("Notunuz : DC ");
		} else if (ortalama>=30) {
			System.out.println("Notunuz : DD ");
		} else {
			System.out.println("Notunuz : FF ");
		}
		 
		 
	}
	

}
