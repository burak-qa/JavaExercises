package day06_wrapperIf;

public class C02_Concatentaion {
    public static void main(String[] args) {
        String a="Hello";
		String b="World";
		System.out.println(a+b); //HelloWorld
		System.out.println(a+""+b); //Hello World
		
		String c="Hello";
		int d= 2;
		int e=3;
		System.out.println(c+d+e); //Hello23
		System.out.println(e+d+c); //5Hello
		System.out.println(c+(d+e));//Hello5
		
		
		String str1="Java";
		String str2= "Guzel";
		int num1=5;
		int num2=4;
		
		//Yukaridaki variable'lari kullanarak asagidaki metineri yazdiralim
		//Java Guzel 54
		System.out.println(str1+ " " +str2 +" "+num1+num2);
		//Java 5 Guzel
		System.out.println(str1+ " " + num1+ " "+ str2);
		//Java 94
		System.out.println(str1+ " "+ (num1+num2)+num2);
		//Java 19
		System.out.println(str1+" "+ (num1-num2)+(num1+num2));
		//54 Guzel
		System.out.println(""+num1+num2+ " "+ str2);
	
    }
}
