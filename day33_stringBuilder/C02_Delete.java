package day33_stringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java candir can"); 
		sb.deleteCharAt(11);//sadece 11.index'deki karakteri siler 
		
		System.out.println(sb);// Java candircan 
		
		sb.delete(11, 13); //ilk index inclusive, ikinci index exclusive oldugundan 
		System.out.println(sb);//Java candirn
		
		
		sb.delete(11, sb.length()); // 11.indexten sonuna kadar gittik
		System.out.println(sb);//Java candir
		System.out.println(sb.capacity()); //31 harfleri siliyor ama capacity degistirmiyor
		
		sb.delete(5, 20);
		System.out.println(sb); // Java  
		System.out.println(sb.capacity()); //31 harfleri siliyor ama capacity degistirmiyor
		
		
		
	}

}
