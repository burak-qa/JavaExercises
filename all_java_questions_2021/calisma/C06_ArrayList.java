package calisma;

public class C06_ArrayList {

	public static void main(String[] args) {
		//  (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
        
        if (arr[0]==arr[arr.length-1]) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
