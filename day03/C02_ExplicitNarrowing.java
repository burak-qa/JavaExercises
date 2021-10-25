package day03;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
		// eger buyuk data turundeki bir veriyi daha kucuk data turundeki 
		//variable a atamak istersek java bunu otomatik olarak yapmaz
		
		int num1=140;
		
		short num2= (short) num1;
		//esitligin sagi ile solundaki veri turleri farkli oldugundan java mismatch hatasi verir
		//hatayi gidermek icin buyuk data turundeki deger'in onune manule onayimizi gosteren
		//(short) yazilir
		System.out.println("num2: " + num2);
		
		
		byte num3= (byte) num2;
		
		System.out.println("num3: " + num3);
		//deger byte'in sinirlarinindan buyuk oldugu icin java int 300'u kendi yontemine gore 
		//byte'a donusturur ve bu arada bizim sayimiz DEGISIR
		
		double num4=87.3;
		
		int num5 = (int) num4;
		System.out.println("num5 : " + num5);
		
		
		// deger virgullu oldugundan ve int'da ondalik kisim olmadigindan java ondalik kismi keser
		//dolayisiyla data kaybi olusur
		
		int num6=27;
		int num7=4;
		System.out.println(num6/num7); //burada sayilarin ikiside int oldugu icin sonuc tam sayi(int) cikar
		
		double num8=4;
		double num9=19;
		
		System.out.println(num6 / num8); //6.75 islem yapilan sayilardan daha genis data turune sahip olan 
		//double oldugundan sonucu double olarak yazdirir
		System.out.println(num9/num7);
		
		
		
		
	}
}
