package day02;

import java.util.Scanner;

public class C07_HomeWorkScanner {
    public static void main(String[] args) {
		
		//Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
		//Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
		//Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Lutfen cemberin yaricapini giriniz");
		
		//double yariCap=scan.nextDouble();
		//double cevre=2*3.14*yariCap;
		//double alan=3.14*yariCap*yariCap;
		
		//cemberin cevresi :25.7
		//dairenin alani : 26.31
		
		//System.out.println("dairenin cevresi :" + cevre);
		//System.out.println("dairenin alani :" + alan);
		
		//Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
		//Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
			//Isminiz : Mehmet
			//Soyisminiz : Bulut
			//Kursumuza katiliminiz alinmistir, tesekkur ederiz.
		//Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
		//Isim - soyisim : Mehmet Bulutluoz
		//Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi yaziniz");
		
		char ilkHarf=scan.next().charAt(0);

		System.out.println("isminizin ilk harfi : " + ilkHarf);
		
		scan.close();
	}
}
