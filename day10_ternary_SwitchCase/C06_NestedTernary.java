package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C06_NestedTernary {
    public static void main(String[] args) {
        //Get an integer from the user /Kullanicidan bir tam sayi alin 
		//and if the number is less than 10 it is not "Number", if less than 100 it is not "two digit number"/ve sayi 10'dan kucuk ise "Rakam", 100'den kucukse "iki basamakli sayi"degilse 
		//print "three digits or greater"/"uc basamakli veya daha buyuk sayi"yazdirin
        
        
        
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer..");
		int num=scan.nextInt();
		
		System.out.println(( num>0 && num<10)? "Number" : (num>=10 && num<100) ? "two-digit number" : "three-digit number or greater"  );
		
		
        
		scan.close();
    }
}
