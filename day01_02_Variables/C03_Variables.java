package day01_Variables;

public class C03_Variables {
    public static void main(String[] args) {
		int num1= 10;
		int num2= 20;
		
		String num3="10";
		String num4="20";
		
		
		System.out.println(num1+num2); //30
		System.out.println(num3+num4); //1020
		
		//Farkli dta turleri ayni degeri alabilir
		//burada onemli olan bu degiskenleri degisken turune gore islem yapabilmemiz
		
		String letter1="A";
		char letter2='A'; //char atadigimiz zaman listde atagimiz rakam hangi sayiya denk geliyorsa onu aliyor
		
		
		//Yukaridaki degiskenleri kullanarak 30A yazdirin
		System.out.println(num1+num2+letter1); //30A
		System.out.println(num1+num2+letter2); //95
		
		// char ekstra ozelligi sebebiyle matematiksel islemlerde numerik deger alir
		
		System.out.println(letter1+num1+num2); // A1020
		System.out.println(num1+letter1+num2); // 10A20
		System.out.println(letter1+(num1+num2));  // A30
		
	}
    
}
