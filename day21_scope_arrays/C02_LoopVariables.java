package day21_scope_arrays;

public class C02_LoopVariables {

	public static void main(String[] args) {
		int num=10;
		
		for (int i = 0; i < 6; i++) {
			String name="Jack";
			System.out.println(num + " " + name);
		}
		//System.out.println(name);  loop icinde olusturuldugu icin burada kullanilmaz
		//System.out.println(i);
		//bunun icin loop disinda iftiyacimiz olan bir degisken varsa
		//loop'dan once olusturur ve emniyette kalmak icicn initialize yapariz
		
		for (int i = 0; i < 10; i++) {
			//int num=20; num variable'i main method'un icinde olusturuldugunda tum main method'da 
			//gecerlidir, dolayisiyla yeniden ayni isimde bir variable olusturamazsiniz
			@SuppressWarnings("unused")
			String name=" Danial";  // ustte name loopun icinde oldugu icin burada da yazabiliriz
		}
	}

}
