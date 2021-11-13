package day10_ternary_SwitchCase;

public class C05_NestedTernary {
    public static void main(String[] args) {
        int y =8;
		System.out.println((y>5) ? (y<10?2*y:3*y): (y>10?2+y:3+y));
		
		int x=12;
		
		System.out.println((x>5)? (x<10?2*x:3*x):(x>10?2+x:3+x));
    }
}
