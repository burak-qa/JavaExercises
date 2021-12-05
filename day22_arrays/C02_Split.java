package day22_arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok guzel"
		//cumlesinin kelimelerini ters sirada yazdirin
		
		String sent="Java ogrenmek cok guzel";
		
		String word[]=sent.split(" ");
		
		System.out.println(Arrays.toString(word)); //[Java, ogrenmek, cok, guzel]
		
		for (int i = word.length-1; i >=0 ; i--) {
			System.out.print(word[i] + " "); //guzel cok ogrenmek Java 
		}
		
		
		
		
		/*for (int i =  sentence.length()-1; i >=0; i--) {
			System.out.printl(sentence.substring(i, i+1));
		}*/
		
		
		

	}

}
