package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Array {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir cumle isteyin ve
		// cumledeki kelime sayisini yazdirin

		/*
		 * String sent="All is easy with Java ";
		 * 
		 * String words[]=sent.split(" "); System.out.println(Arrays.toString(words));
		 * //[All, is, easy, with, Java] System.out.println("This sentence has  " +
		 * words.length + " words"); //This sentence has 6 words
		 */

		String str = "Javacilar cook afilli";
		String harf[] = str.split("");
		Arrays.sort(harf);
		String c="";
		System.out.println(Arrays.toString(harf));
		for (int i = 0; i < harf.length; i++) {
			
			
		}
		
		System.out.print(harf.length);

	}

}
