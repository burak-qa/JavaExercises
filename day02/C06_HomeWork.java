package day02;

public class C06_HomeWork {
    public static void main(String[] args) {
		
		
		//Birinci varyant (Scanner kullanmadan!)
		//1-Kullanicidan iki tamsayi alip bu sayilarin toplam, fark ve carpimlarini yazdirin
		
		int num1=15;
		int num2=25;
		
		System.out.println(num1+num2);
		System.out.println(num1*num2);
		System.out.println(num1-num2);
		
		
		///2-Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
		
		int kareKenar= 4;
		
		System.out.println("karenin cevresi : " + (kareKenar + kareKenar + kareKenar + kareKenar)+ " birim dir.");
		System.out.println("karenin alani   : " + (kareKenar * kareKenar) + " birim kare dir.");
		
		//3-kullanicidan yari cap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		
		int yariCap= 3;
		
		System.out.println("Dairenin cevresi : " + (2*3.14*yariCap) + " birim dir." );
		System.out.println("Dairenin alani : " + (3.14*(yariCap*yariCap))+ " birim karedir.");
		
		//4- Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
		
		int dikUzun = 5;
		int dikKisa = 3;
		int dikYuk = 4;
		
		System.out.println("Prizmanin hacmi : " +(dikUzun*dikKisa*dikYuk)+ " birim kup dur.");
		System.out.println("Prizmanin alani : " + (2*((dikUzun*dikYuk)+(dikYuk*dikKisa)+(dikUzun*dikKisa))) + " birim kare dir.");
		
		//5- Kullanicidan ismini ve soyismini isteyip asagidaki gibi yazdirin
		//Isminiz:Burak
		//Soyisminiz:Sahin
		//Kursumuza katiliminiz alinmistir, tesekkur ederiz.
		
		String name = "Burak";
		String surName = "Sahin";
		String text = "Kursumuza katiliminiz alinmistir, tesekkur ederiz.";
		
		System.out.println("Isminiz: " + name);
		System.out.println("Soyisminiz: " + surName);
		System.out.println(text);
		
		//6- Kullanicidan ismini ve soyismini alip aralatinda bir bosluk olusturarak asagidaki gibi yazdirin
		// Isim-soyisim: Burak Sahin
		
        String isim = "Burak";
        String soyIsim= "Sahin";
        System.out.println("Isim - soyisim: " + isim + " "+ soyIsim);
    
        //7- Kullanicidan ismini alip isminin bas harfini yazdirin
        
        String names = "Burak";
        System.out.println("Kullanicinin isminin bas harfi : " +names.substring(0,1) + " dir.");
    
        //Isim ve soyisim bas harfleri yazdirma
        String isim1= "Burak" ;
        String soyIsim1= "Sahin" ;
    
        String basHarfler=isim1.substring(0,1)+" "+soyIsim1.substring(0,1);
        System.out.println("Isim ve soyisminizin basharfleri:"+ basHarfler);
        
        
        
		
		
		
		
	}
}
