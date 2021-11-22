package day18_nestedForLoop_whileLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		//soru2 ) For Loop ve while loop kullanarak 3 basamakli sayilardan
		//			15,20, ve 90'na tam bolunebilen sayilari yazdirin.
		
		for (int i = 0; i < 1000; i++) {
			if (i%15==0 && i%20==0 && i%90==0) {
				System.out.println(i);
			}
		}
		
		
		int num=100; //baslangic degeri
		while (num<1000) {
			if (num%15==0 && num%20==0 && num%90==0) {
				System.out.println(num);
			}
			num++;  //bunu unutursak sonsuz loop'a donuyor

		}
		//eger baslangic ve bitis sarti bir sayinin artisina bagli ise veya 
		//tekrar edilecek islem adedi belli ise for loop tercih edilir
		// islem tekrar sayisi belli degilde veya bitis icin bir sart varsa while loop tercih edilir
	}

}
