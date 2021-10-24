package day02;

public class C01_SwapVariables {
    public static void main(String[] args) {
		/*
			1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
			Orn : sayi1=10 ve sayi2=20;
			kod calistiktan sonra
			sayi1=20 ve sayi2=10
		 */
		
		int num1=15;
		int num2=30;
		
		//baslangicta num1=15 ve num2=30
		
		System.out.println("first num1=" + num1 + " and num2= " + num2);
		
		//ilk once bos bir variable olusturalim
		
		int empty;
		
		//num2 yi bos variable a atayalim
		
		empty=num2;
		
		//num2 variable ina num1 degerini atayalim
		
		num2=num1;
		
		
		//empty variable daki degeri num1 e atayalim
		
		num1=empty;
		
		System.out.println("end num1=" + num1 + " and num2=" + num2);
		
		
	}
}
