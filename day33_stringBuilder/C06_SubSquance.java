package day33_stringBuilder;

public class C06_SubSquance {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Java ne kadar kolay");
		
		System.out.println(sb.substring(14)); //kolay
		
		System.out.println(sb.subSequence(14, 19));//kolay
		
		//ikisi de ayni sonici dondurur
		//ancak substring() String class 'indan geldigi icin 
		//substring() kullandigimda arkasindan String method'larini kullanabilirim
		//Ancak, subSquence kullandigimda bu mumkun olmaz
		
		

	}

}
