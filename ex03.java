package java03;

public class ex02 {
	public static void main(String[] args) {
		
		int a = 1,b = 2;
		System.out.println("a�� b�� ��������? " + (a == b));
		System.out.println("a�� b���� ū����? " + (a > b));
		System.out.println("a�� b�� �����鼭 a�� 0���� ū����? " + ((a == b) && (a > 0)));
		System.out.println("a�� 3�� �ƴѰ��� ?" + !(a == 3));
		
		double c = Math.pow(2, 10);
		System.out.println(c);
	}
}
