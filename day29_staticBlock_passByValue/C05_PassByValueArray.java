package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {
		int num[]= {3,4,5,6};
		changeEl(num);
		System.out.println(" Eleman degistir methodundan sonra : "+Arrays.toString(num)); //[10, 4, 5, 6]
		changeArray(num);
		System.out.println(" Arrayi degistir methodundan sonra : "+Arrays.toString(num));// [10, 4, 5, 6]
	}

	private static void changeEl(int[] num) {
		num[0]=10;
		System.out.println(" Eleman degistir methodunda : "+Arrays.toString(num));// [10, 4, 5, 6]
		
		
		
	}

	private static void changeArray(int[] num) {
		num=new int[6];
		System.out.println(" Array degistir metodunda : "+ Arrays.toString(num));//[0, 0, 0, 0, 0, 0]
		
	}

}
