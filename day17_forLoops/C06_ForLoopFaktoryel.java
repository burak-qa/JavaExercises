package day17_forLoops;

import java.util.Scanner;

public class C06_ForLoopFaktoryel {

	public static void main(String[] args) {
		//Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen 
		//			sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 10 dan kucuk pozitif bir tam sayi giriniz :");
		int num=scan.nextInt();
		
		
		System.out.print(num+ "!=");
		int fak=1;
		
		
		for (int i = num ; i>1; i--) {
			fak*=i;
			System.out.print(i+"*");
		}
		
		System.out.println("1=" +fak);
		
		
		
		scan.close();
	}

}
