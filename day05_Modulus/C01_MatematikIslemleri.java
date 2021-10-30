package day05_Modulus;

public class C01_MatematikIslemleri {
    public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2); //14
		
		System.out.println(4*(2+5)/3); //9
		
		//sonucu virgullu yazdirmak istersek
		
		double sonuc=4*(2+5)/3;
		System.out.println(sonuc); //9.0
		
		
		sonuc= (double)(4*(2+5)/3);
		System.out.println(sonuc); //9.0
		
		sonuc= (double)4 *(2+5)/3;
		
		System.out.println(sonuc); //9.333333333333334
		
		
		
		int num1=5;
		int num2=2;
		double num3=2;
		
		System.out.println(num1/num2); //2 cunku iki rakamda int
		System.out.println(num1/num3); //2.5 cunku bir rakam double
		System.out.println(num1+num2/num3); //6.0
		
		
		
	}
}
