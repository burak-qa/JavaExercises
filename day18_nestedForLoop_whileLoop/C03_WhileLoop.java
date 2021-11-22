package day18_nestedForLoop_whileLoop;

public class C03_WhileLoop {

	public static void main(String[] args) {
		// 20 den 30 a kadar olan sayilari(20 ve 30 dahil)
		// while loop ile yazdirin

		for (int i = 20; i <= 30; i++) {
			System.out.print(i + " ");

			System.out.println("");

			int num = 20;
			while (num <= 30) {
				System.out.print(num + " ");
				num++;
			}
			// for loop ile cozebildigimiz sorularda while loop kullanmak
			// kodumuzu biraz uzatir
		}
	}

}
