package day17_forLoops;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		//Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in 
		//			palindrome olup olmadigini kontrol eden bir program yazin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz :");
		String name=scan.nextLine();
		
		if (name.equals(reversePrint(name))) {
			System.out.println("Girdiginiz string palindrome");
		} else {
			System.out.println(("Girdiginiz string palindrome degil!!"));
		}
		
		
		
		
		
		scan.close();
	}

	public static String reversePrint(String name) {
		String formatName="";
		for (int i =name.length()-1; i>=0; i--) {
			formatName+=name.substring(i, i+1);
			
		}
		return formatName;
	}

}
