package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        // gun numarasina gore gun isimlerini yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.print ("Lutfen bir gun numarasi giriniz... : ");
		int gunNo=scan.nextInt();
		
		
		
		switch(gunNo){
			case 1:
				System.out.println("Pazartesi");
				break;
			case 2:
				System.out.println("Sali");
				break;
			case 3:
				System.out.println("Carsamba");
				break;
			case 4:
				System.out.println("Persembe");
				break;
			case 5:
				System.out.println("Cuma");
				break;
			case 6:
				System.out.println("Cumartesi");
				break;
			case 7:
				System.out.println("Pazar");
				break;
			default:
				System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
		}
        scan.close();
    }
}
