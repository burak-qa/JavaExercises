package day21_scope_arrays;

public class C01_LocalVariables {
	
	String okulIsmi;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Java local Variable'lara default deger atamasi yapmaz
		//kodlarimizda sorun yasamamak icin
		//olusturdugumuz lacal variable'lara uygun bir deger atamamizda fayada var
		
		int sayi=0; // int sayi dersek java CTE(hata) veriyor
		System.out.println(sayi);
		
		
		//int sayi; //bir lokal'de ayni isimde birden fazla variable OLUSTURULAMAZ
		//String sayi; // data turu farkli olsa da Java buna izin vermez
	
		String isim="Ali";
	}
	
	public static void staticMethod() {
		//sayi; //bir lokal'de olusturulan variable (metodlarin static olup olmamasina
				// bagli olmak sizin) farkli lokal'de kullanilamaz
		
		@SuppressWarnings("unused")
		String isim="Veli";
	}
	
}
