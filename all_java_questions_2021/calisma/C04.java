package calisma;

public class C04 {

	public static void main(String[] args) {
		// Bir String icerisinde yinelenen karakterleri döndüren bir kod
		// yazıniz.(mülakat Sorusu)
		// Input :
		// String str=“Javaisalsoeasy”
		// Output: a s

		String str = "Javaisalsoeasy";
		String harf = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))
					&& !harf.contains(str.substring(i, i + 1))) {
				// if (!harf.contains(str.substring(i, i + 1))) {
				harf += str.substring(i, i + 1) + " ";
				// harf+=" ";
				// }

			}
		}
		System.out.println(harf);
	}

}
