package day04_IncremnetDecrement;

public class C01_AutoWidening {
    public static void main(String[] args) {
		byte sayi1=44;
		
		short sayi2= sayi1;
		//esitligin sol tarafi short, sag tarafi byte
		//iki data turu farkli oldugu halde java itiraz etmiyor
		//cunku atama yapilan variable nin data turu (short) 
		//atanan degerin veri turunden buyuk oldugundan sorun olusmaz
		//auto widening => kucuk buyuge her zaman sigar 
		
		System.out.println("sayi2 : " + sayi2);
		
		
		int sayi3= 55;
		
		double sayi4= sayi3;
		
		System.out.println("sayi4 : " + sayi4);
		
		//atanan degerin data turu, deger atanan variable'in data turunden kucukse
		//Java castingí otomatik yapar
		//bu isleme auto widening denir
	}
    
}
