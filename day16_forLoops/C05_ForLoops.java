package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoops {

	public static void main(String[] args) {
		//Question 5) Ask the user for an integer less than 100. 
		//Print numbers that are multiples of 3 or 5 from 1 to the number entered.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an integer less than 100... : ");
		int num=scan.nextInt();
		
		for (int i = 1; i <=num; i++) {
			if(i%3==0||i%5==0) {
				System.out.print(i + " ");
			}
		}
		
		scan.close();
	}

}
