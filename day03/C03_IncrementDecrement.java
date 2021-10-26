package day03;

public class C03_IncrementDecrement {
    public static void main(String[] args) {
		
		//atama islemi olursa sayinin degeri kalici olarak degisir
		//atama islemi olmadan yapilan toplama, cikarma vs islemler sadece o satirda yapilir
		// sayinin degerini kalici olarak degistirmez
		int num1=10;
		
		System.out.println(num1+=5); //15
		// bu islem num1 in degerini 5 arttirip  num1'e assign ediyor
		//dolayisiyla num1'in degeri kalici olarak degisiyor
		
		System.out.println(num1); //15
		
		System.out.println(num1+12); //27
		
		System.out.println(num1); //15
		
		
		num1++;
		//her ne kadar = isareti gorunmese de num1++ isleminde assign vardir
		//dolayisiyla deger kalici olarak degisir
		System.out.println(num1); //16
		
		
	}
}
