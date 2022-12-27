package java03;

public class ex02 {
	public static void main(String[] args) {
		
		int a = 1,b = 2;
		System.out.println("a와 b가 같은가요? " + (a == b));
		System.out.println("a가 b보다 큰가요? " + (a > b));
		System.out.println("a와 b가 같으면서 a가 0보다 큰가요? " + ((a == b) && (a > 0)));
		System.out.println("a가 3이 아닌가요 ?" + !(a == 3));
		
		double c = Math.pow(2, 10);
		System.out.println(c);
	}
}
