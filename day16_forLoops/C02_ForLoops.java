package day16_forLoops;

public class C02_ForLoops {

	public static void main(String[] args) {
		//Question 2 ) Print the numbers between 10 and 30 on the same line with commas between them
		
		for(int i=10; i<30; i++ ) {
			System.out.print(i + ", ");
		}
		System.out.println(30);
		
		System.out.println(); // bos syso alt satira gecmek icin kullanilir 
		System.out.println("*****Alternatif Cozum*****");
		System.out.println(); // bos syso alt satira gecmek icin kullanili
		
		for (int i = 10; i <=30; i++) {
			if (i==30) {
				System.out.println(i);
			} else {
				System.out.print(i + ", ");
			}
		}

	}

}
