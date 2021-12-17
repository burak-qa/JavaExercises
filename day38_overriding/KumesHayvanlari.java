package day38_overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {
	
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme();//Tum hayvanlar beslenir
		kms1.hareket();//Kumes hayvanlari yuruyerek hareket eder
		kms1.solunum();//Kuslar akcigerleri ile nefes alir
		
		Kuslar kms2 = new KumesHayvanlari();
		
		kms2.beslenme();//Animals ==> Tum hayvanlar beslenir
		kms2.hareket();//Kuslar ama kuslardan almadi!!! ==> Kumes hayvanlari yuruyerek hareket eder
		kms2.solunum();//Kuslar ==> Kuslar akcigerleri ile nefes alir
		//kendi spesifik ozellikleri disinda kuslara tabi oluyor
		//ama spesifik bir durumu varsa farkini ortaya koyuyor
		
		Kuslar kms3 = new Kuslar();
		kms3.beslenme();//Tum hayvanlar beslenir
		kms3.hareket();//Kuslar ucarak hareket eder
		kms3.solunum();//Kuslar akcigerleri ile nefes alir
		
		Animals kms4= new KumesHayvanlari();
		kms4.beslenme();//Animals==>Tum hayvanlar beslenir
		kms4.hareket();//Animals ama animalstan almadi!!! overriding var. Constructor imiz KumesHayvanlari==> Kumes hayvanlari yuruyerek hareket eder
		kms4.solunum();//Animals ama animals tan almadi!!! Burada kuslardan aldi. ==> Kuslar akcigerleri ile nefes alir 

	}
	public void hareket() {
        System.out.println("Kumes hayvanlari yuruyerek hareket eder");
    }
    
 
    
 

}
