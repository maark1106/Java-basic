package 문자열;

public class Main {
	
	public static void main(String[] args) {
	
		String str = "java";
		
		System.out.println(str);
		
		StringBuilder sf = new StringBuilder("java");
		sf.append("Spring"); 
		System.out.println(sf);
		System.out.println("sf.length = " + sf.length());
		sf.insert(sf.length(), " is good");
		System.out.println(sf);
		
		sf.delete(0,2);
		System.out.println(sf);
		
		StringBuilder sb = new StringBuilder();
		sb.append("easd");
		
		System.out.println(sb);
	}
}

/*
 * String은 데이터 변경 시 새로운 메모리, 메모리 상 변화 많아 속도 느림
 * 개선 -> StringBuffer
 * StringBuffer 데이터 변경 시 기존 객체 사용
 * 
 * StringBuffer와 Builder가 더 빠르긴 하지만 큰 데이터를 관리할 때 아니면
 * String써도 무방
*/