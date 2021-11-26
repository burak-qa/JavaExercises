package day20_scope;

public class InstanceVar {
	
	int notMat=50;
	int notFen;
	//instance variable'larin scope'unda method yoktur
	
	public static void main(String[] args) {
		
		//System.out.println(notMat); //main method static oldugu icin static olmayan variable'lar 
									//main method'da direk kullanilamaz veya goruntulenemez
	
		// intance variable'lara main method'dan ulasmak istersek obje olusturup
		//obje uzerinden erisim saglayabiliriz
		
		//scanner scan=new Scanner(System.in)
		//icinde oldugumuz class'dan bir obje olusturalim
		
		InstanceVar burak=new InstanceVar(); //yukaridaki class ismi ile bu ayni olmak zorunda
		System.out.println(burak.notMat); //50
		
		InstanceVar dila=new InstanceVar();
		dila.notMat=70;
		
		System.out.println(dila.notMat);
		//instance variable'larda deger atamazsak java instance olarak atanan degeri alir
		//bu class icin notmat=50 gibi
		//ama istersek deger de atayabiliriz, 
		//bu durumda deger atadigimiz obje icin deger gecerli olur
		
		System.out.println(burak.notMat);//
		
		
		// burak'in notunu degistirmek istiyorsak burak.notMat'a deger atamaliyiz
		burak.notMat=90;
		System.out.println(burak.notMat);//90
		
		
		burak.method2();// method2 static olmadigi icin main method'dan direk cagirilamaz
		
		
		
		
		
	}
	 public static void staticMethod() {
	//	 System.out.println(notFen); //instance variable'lara static method'lardan direk ulasilamaz
	 }
	 
	 public void method2() {
	System.out.println("method2'deki notFen : " +notFen);	//bu method static olmadigi icin instance variable'lara ulasilabilir
	// instance variable olustururken deger atanmasa da olur
	//bu durumda java dafault degerler atar
	//int icin default deger 0'dir
	
	notFen=100;
	System.out.println("method2'deki notFen : " +notFen);
	
	
	 
	 }
}
