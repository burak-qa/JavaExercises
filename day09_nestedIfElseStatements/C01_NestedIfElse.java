package day09_nestedIfElseStatements;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        // if (calisan kadinsa)
		//{if(yas>60){emekli olabilirsin} else{emekli olamazsin}}
		//else
		//{if(yas>65){emekli olabilirsin} else{emekli olamazsin}}
		
		
		//Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		//calisan erkekse 65 yasindan buyukse emekli olabilir
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz... \n Erkek icin E, Kadin icin K");
		
		char gender=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen yasinizi giriniz...");
		double age=scan.nextDouble();
		
		if (gender=='K') {
			if(age>=60) {
				System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olamazsin");
			}
		} else if (gender=='E'){
			if(age>=65) {
				System.out.println("Emekli olabilirsin");
			}else {
				System.out.println("Emekli olamazsin");
			}
		} else {
			System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz..");
		}
		
		System.out.println("***** Ternary Cozum ******");
        System.out.println(gender=='K' ? (age>=60 ? "Emekli olabilirsin" : "Emekli olamazsin") 
        : gender=='E' ? (age>=65 ? "Emekli olabilirsin" : "Emekli olamazsin") : "Lutfen cinsiyet icin gecerli bir harf girirniz..." );
		
		
		
		scan.close();
    }
}
