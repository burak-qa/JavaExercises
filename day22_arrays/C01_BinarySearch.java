package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		String names[]= {"Dila", "Murat","burak","Ahmet","Ali","Ihsan","Sara"};
		
		//isimler array'inde Murat ismi var mi?
		
		//array'de arama yapmadan once siralama yapmaliyiz
		
		
		Arrays.sort(names); //arrayslerin icindekileri kucukten buyuge dogru siralar
		//arrays class'i ile sort yaptigimizda array'imiz kalici olarak degisir
		
		
		System.out.println(Arrays.toString(names)); //[Ahmet, Ali, Dila, Ihsan, Murat, Sara, burak]
		//sort methodu'u elementleri natural order'a gore siralar
		names[6]="Burak";
		System.out.println(Arrays.toString(names)); //[Ahmet, Ali, Dila, Ihsan, Murat, Sara, Burak]
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names)); //[Ahmet, Ali, Burak, Dila, Ihsan, Murat, Sara]
		
		System.out.println(Arrays.binarySearch(names, "Murat")); //5
		System.out.println(Arrays.binarySearch(names, "Cevheri"));//-4
		System.out.println(Arrays.binarySearch(names, "Kemal")); //-6
		
	}

}
