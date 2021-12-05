package day22_arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		//"Java ogrendim,  #cok para  ?kazandim.,"
		//cumlesinin kelimelerini, ozel karakterler ve noktalama isaretleri olmadan
		//harf sirasina gore yazdiralim
		
		String sent="Java ogrendim,  #cok para ?kazandim.,";
		String word[]=sent.split(" ");
		System.out.println(Arrays.toString(word)); //[Java, ogrendim,, , #cok, para, , ?kazandim.,]
		
		for (int i = 0; i < word.length; i++) {
			word[i] = word[i].replaceAll("\\W", "");
			
		}
		System.out.println(Arrays.toString(word));
		Arrays.sort(word);
		System.out.println(Arrays.toString(word));
		
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]+ " "); //Java cok kazandim ogrendim para 
											//buyuk harf kucuk harften once yazdirilir
			
			
		}
	}

}
