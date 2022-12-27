package java01;

public class 기본자료형 {

	public static void main(String[] args) {
		char c = 'a';
		System.out.println("c = " + c);
		
		String s = "Hello World!!";
		System.out.println("s = " + s);
		
		byte by = 10;
		int i = 10;
		System.out.println("i = " + i);
		
		int iVar = 123456;
		byte bVar = (byte)iVar;
		System.out.println("iVar = " + iVar);
		System.out.println("bVar = " + bVar);
	}
}

 
/* 작은 메모리 -> 큰 메모리의 형 변환 ok
   큰 메모리 ->작은 메모리의 형 변환 x(데이터 누실)
 */
