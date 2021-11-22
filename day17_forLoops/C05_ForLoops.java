package day17_forLoops;

import java.util.Scanner;

public class C05_ForLoops {

	public static void main(String[] args) {
		// Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari 
		//           toplayip, sonucu yazdiran bir program yaziniz

			Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen iki sayi giriniz : ");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			
			int sum=0;
			
			if (num1<num2) {
				for (int i= num1; i<=num2; i++) {
					sum+=i;
				}
			} else {
				for (int i= num1; i>=num2; i--) {
					sum+=i;
				}
			}
	
			
			System.out.println("girilen sayilar ve aralarindaki sayilarin toplami :" +sum);
			
		
			/*int small=0;
			int big=0;
			int sum=0;
			
			if (num1>num2) {
				big=num1;
				small=num2;
			} else {
				big=num2;
				small=num1;
			}
			
			for (int i =small; i <=big; i++) {
				sum+=i;
			}
			System.out.println(sum);*/
			
			scan.close();
			
	}



	

}
