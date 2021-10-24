package day01_Variables;

public class C04_HomeWorkVariables {
    public static void main(String[] args) {
		
		// 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
		
		String myName= "Burak Sarisahin";
		System.out.println(myName);
		
		
		//char degiskenler matematiksel isleme sokuldugunda char degiskeninin barindirdigi karakterin ascii degeri isleme girer 
		char firstLetter= 'B';
		
		boolean doYouUnderstand= true;
		
		System.out.println("Benim Adim : "  + myName + ", Adimin bas harfi : " + firstLetter + ", Bilgiler dogru mu? : " + doYouUnderstand);
		
		
		// 2- isim ve soyisim icin iki variable olusturun ve bunlari 	
		// 		isminiz : Burak
		//  	soyisminiz : Sarisahin seklinde yazdirin
		
		String name ="Burak", surname= "Sarisahin";
				System.out.println("your name : " +name);
				System.out.println("your surname : " +surname);
				
		// 3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
				
				int a=15;
				short b=20;
				
				System.out.println(a+b); //35
				
		// 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
				int c=30;
				double d=2.5;
				
				System.out.println(c+d); //32.5
				
				
		// 5 – char data turunde bir variable olusturun ve yazdirin
				
				char karakter='a';
				System.out.println(+karakter); //97
				
		// 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
				
				int num=25;
				char letter='a';
				
				System.out.println(num+letter); //122
		
	}
}
