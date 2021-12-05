package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		// MultiDimensional Array'ler ic ice array'ler demektir
		//Array olusturmak icin iki yontemimiz vardi
		//1.yontem once declara edip sonra deger atama
		
		int arr[][]=new int [3][2]; //outer array'i 3 elemanli
		// her bir inner array ise 2 elemanli olan MDArray olusturur
		//Bu yontemle olusturdugumuz inner array'lerin hepsi ayni boyutta olmalidir
		
		System.out.println(Arrays.toString(arr)); //direk outer array'i yazdirmak istedigimizde 
		//icindeki elemenlar non-primitive oldugundan 
		//kendisini degil referansini yaziyor
		//[[I@3fee733d, [I@5acf9800, [I@4617c264]
		
		System.out.println(Arrays.toString(arr[1])); //[0, 0]
		System.out.println(Arrays.toString(arr[2])); //[0, 0]
		
		System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0]]
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		System.out.println(Arrays.deepToString(arr)); //[[0, 5], [2, 0], [0, 3]]
		
		//Array olusturmak icin iki yontemimiz vardi
		//2.yontem hem declare edip hem de deger atama
		int arr2[][]= {{0},{1,2,3},{6,7,8,9}};
		System.out.println(Arrays.deepToString(arr2));//[[0], [1, 2, 3], [6, 7, 8, 9]]
		
		System.out.println(Arrays.toString(arr2[1])); //[1, 2, 3]
		System.out.println(arr2[2][1]); //7
		
		
	}

}
