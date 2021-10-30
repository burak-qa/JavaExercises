package day03_Scanner;

public class C02_SwapVariables2 {
    public static void main(String[] args) {
		//sayi1 ve sayi2 varible larinin degerlerini ucuncu bir degisken olmadan 
		//degistiren (SWAP) bir program yapiniz
		
		int num1=15;
		int num2=20;
		
		
		//baslangicta num1=10 ve num2=20
		
		System.out.println("Baslangicta num1=" + num1 + " ve num2=" + num2);
		
		// ucuncu bir variable kullanmayacaksak, verilen iki sayinin farkindan istifade ediyoruz
		// ilk adim 
		//sayilarin farki 5, ilk sayiya 5 eklersem ikinci sayiyi bulurum, ikinci sayidan 5 cikarsam ilk sayiyi bulurum
		
		num1= num1 - num2;  // num1= -5 oldu
		
		//ikici adim fark ile sayi ikiyi toplayip sayi ikiye assign ediyorum
		
		num2= num1+num2; // num2= 15 oldu
		
		//ucuncu adim olarak num1 e num2 - fark atiyorum
		num1=num2-num1; // 15 -(-5)= 20
		
		System.out.println("end num1=" + num1 + " and num2=" +num2);
		
	}
}
