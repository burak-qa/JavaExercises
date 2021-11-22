package day17_forLoops;

import java.util.Scanner;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		// 1'den 4'e kadar sayilari yan yana aralarinda bir bosluk birakarak yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir rakam giriniz :");
		int num=scan.nextInt();

		for (int line = 1; line <= num; line++) { //satir

			for (int i = 1; i <= num; i++) {    //sutun
				System.out.print(line*i + " ");
			}
			System.out.println("");
		}  
		
		scan.close();
	}

}
