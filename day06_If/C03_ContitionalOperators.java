package day06_If;

public class C03_ContitionalOperators {
    public static void main(String[] args) {
        System.out.println(5+3==8 || 6+5==10 || 7-2==3); //true bir tane bile true yazsa sonuc true yaziyor 
		System.out.println(5+3==8 && 6+5==10 && 7-2==3); //false 
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc = a>b || b>c || a+b>=c;
		System.out.println(sonuc);//true
		
		//&& isareti yerine & de kullanilabilir ancak arada bir nuans var
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3 && 5>=2 && 7+3<=10); //false java ilk false gordugu zaman diger islemlere bakmaz(kisa islem)
		System.out.println(5+3==8 & 6+5==10 & 7-2==3 & 7-2==3 & 5>=2 & 7+3<=10); // java butun islemlri de kontrol eder. sonuc degismiyor ama java daha cok calisiyor. 
		
		int age=50;
		int boy=180;
		char gender='M';
		System.out.println(age<30 && boy>170 && gender=='M'); // false
    }
    
}
