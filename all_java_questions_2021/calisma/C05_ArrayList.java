package calisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C05_ArrayList {

	public static void main(String[] args) {
		// Kullanicidan  alacaginiz 6 elemanli bir dizinin
		//sadece tek elemanlarini ayri diziye bir methoda atayarak
		//main de yazdiriniz

		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 6 adet sayi giriniz : ");
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int num4=scan.nextInt();
		int num5=scan.nextInt();
		int num6=scan.nextInt();
		int arr[]= {num1,num2,num3,num4,num5,num6};
		
		tekEleman(arr);
		
		System.out.println(tekEleman(arr));
		
	}

	private static List<Integer> tekEleman(int[] arr) {
		
		List<Integer>tekSayi=new ArrayList<>();
		
		//int arr1[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				//arr1[i]=arr[i];
				tekSayi.add(arr[i]);
			}
		}
		//System.out.println(Arrays.toString(arr1));
		return tekSayi;
	}
	
}
