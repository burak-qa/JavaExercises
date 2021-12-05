package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C07_CopyOf {

	public static void main(String[] args) {
		// Verilen iki array'i birlestiren ve 
		//sonucu birlesikArray isminde bir array'e kaydeden 
		//bir method olusturunuz
		
		int arr1[]= {3,5,7,10};
		int arr2[]= {2,4,6};
		
		
		int combineArray[]=combine(arr1, arr2);
		Arrays.sort(combineArray); //kucukten buyuge dogru siraladik
		System.out.println(Arrays.toString(combineArray)); //[3, 5, 0, 0, 0]

	}

	private static int[] combine(int[] arr1, int[] arr2) {
		
		int combineArray[]= Arrays.copyOf(arr1, arr1.length+arr2.length);
		//arr1 ile baslayacak [ 3, 5, 7, 10]
		
		
		
		for (int i = 0; i < arr2.length; i++) { //2.array'in elemanlarini alacagiz
			combineArray[i+arr1.length]=arr2[i];
		}
		
		
		return combineArray;
	}


}
