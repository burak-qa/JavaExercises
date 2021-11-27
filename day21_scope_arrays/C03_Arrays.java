package day21_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// soru2 - soru 1 deki elemanlardan "Ali " yerine "Can", "Ayse" yerine "Gul" atayin
		
		
		String arr[]=new String[4];
		arr[0] = "Ali";
		arr[1] ="Ayse";
		arr[2] = "Veli";
		arr[3]= "Fatma";
		
		String arr2[]= {"Ali", "Ayse", "Veli", "Fatma"};
		
		arr2[0]="Can";
		arr2[1]="Gul";
		System.out.println(arr2[1]);
		System.out.println(arr2[arr.length-1]);// String'deki length() parantezli idi burada sadece length
		
		System.out.println(arr[arr.length]); //ArrayIndexOutOfBoundsException
											// yazdigin index sinirlarin disinda
		
		
		// String ==> length()
		//array ==>length
		

	}

}
