package day17_forLoops;

import java.util.Scanner;

public class C08_NestedForLoop {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore 
		//asagidaki sekli cizdirin
		//*
		//**
		//***
		//****
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir rakam giriniz :");
		int num=scan.nextInt();
		
	    for (int i =1; i <=num; i++) {
			for (int x = 1; x <i; x++) {
				System.out.print(x);
			}
			System.out.println("");
		}
		

	    scan.close();
	}

}
