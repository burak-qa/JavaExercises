package repit;

public class C03_ForWhile_2 {

	public static void main(String[] args) {
		/*
		Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
		Input :
		30 and 40
		
		Expected OutPut:
		GCD for 30 and 40 = 10
		LCM for 30 and 40 = 120
		 */
		int num1=30;
		int num2=40;
		int carp=num1*num2;
		
		int gcd=1;
		int lmc=1;
		
		
		
		for (int i = 1; i <=num2&& i<=num1; i++) {
			if (num1%i==0 && num2%i==0) {
			gcd=i;
			lmc=carp/gcd;
			}
			
		}
		System.out.print("GCD for " + num1+ " and "+num2+ " = "+gcd);
		System.out.println("");
		System.out.println("LCM for" +num1 +" and "+num2+ " = "+lmc);
	}

}
