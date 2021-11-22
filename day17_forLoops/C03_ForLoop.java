package day17_forLoops;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren 
		//bir program yazin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz :");
		String name=scan.nextLine();
		
		System.out.println(reversePrint(name));
		
		
		scan.close();
	}
	
	//String formatName="";
	//for (int i =str.length()-1; i>=0; i--) {
	//formatName+=str.substring(i,i+1)
	// }
	//return formatName;

	public static String reversePrint(String name) {
		int i=name.length()-1;
		String formatName="";  //saklama kabi 
		while (i>=0) {
			formatName+=name.substring(i, i+1);
			i--;
			
		}
		return formatName;
	}

}
