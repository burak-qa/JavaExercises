package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list olusturalim
		//sonra list elemanlarini degistir method'u yazip orada
		//list elemanlarindan bazilarini deistirelim
		//method void olsun
		//main method'a dondukten sonra yeniden list'i yazdiralim
		
		
		List<String> letter=new ArrayList<>();
		letter.add("A");
		letter.add("B");
		letter.add("C");
		
		
		listElemanChange(letter);
		System.out.println("Main Method'a donunce list : " + letter);
		//Java'da list ve Array gibi objeler icin de pass By Value gecerlidir
		//Yani farkli bir method'da array veya list'e yeni deger atamasi yaparsaniz
		//orjinal array veya list degismez
		
		listChange(letter); //method'a yeni deger atadigim halde harfer listesi degismedi
		System.out.println("list'e yeni list atadiktan sonra Main Method'a donunce list : "+ letter);
	}

	private static void listChange(List<String> letter) {
		letter=new ArrayList<>();
		System.out.println("List'e yeni deger atayinca :  "+ letter);
		
	}

	private static void listElemanChange(List<String> letter) {
		letter.set(0, "D");
		System.out.println("Method'da degistirdigimiz list : " + letter);
		
		
	}

		
	}


