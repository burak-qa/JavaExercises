package day18_nestedForLoop_whileLoop;

public class C08 {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int t=0;
		
		t=a;
		a=b;
		b=t;
		System.out.println("a="+a+" b="+b +" t="+ t);
		
		a=4;
		b=7;
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("a="+a+" b="+b +" t="+ t);
		
		

	}

}
