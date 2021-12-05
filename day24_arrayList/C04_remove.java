package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {

	public static void main(String[] args) {
		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println(harfler);// [A, Z, F, D]
		harfler.remove(1); // bu satir gidip 1. index teki elemani remove eder
		//ve delil olarak remove ettigi elemani getirir
		
		//listenin kalanini gormek isterseniz listeyi yazdirabiirsiniz
		System.out.println(harfler); //[A, F, D]
		harfler.remove(2);
		System.out.println(harfler); //[A, F]
		
		System.out.println(harfler.remove("F"));//gidip F yi remove eder ve true dondurur
		
		System.out.println(harfler.remove("B")); //listede B olmadigi icin remove yapamaz
									// gorevi yapamadigi icin false doner
		System.out.println(harfler);
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println(harfler);//[A, A, Z, F]
		
		harfler.remove("A");
		System.out.println(harfler);
		harfler.add("A");
		harfler.add("K");
		harfler.add("A");
		harfler.add("T");
		harfler.add("B");
		System.out.println(harfler);
		
		List<String> silinecekHarfler=new ArrayList<>();
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		silinecekHarfler.add("K");
		
		
		
		harfler.removeAll(silinecekHarfler);
		System.out.println(harfler);//[Z, T, B]
		harfler.removeAll(harfler);//verilen bir listeyi siler
		System.out.println(harfler); //[]
		
		//eger listemiz integer larda olusuyorsa
		//Java remove(index) ve remove (object) method'lari karsmasin diye
		//girilen sayiyi index olarak kabul eder.
		
		
		
		
	}

}
