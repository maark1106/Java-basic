package ���ڿ�;

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
 * String�� ������ ���� �� ���ο� �޸�, �޸� �� ��ȭ ���� �ӵ� ����
 * ���� -> StringBuffer
 * StringBuffer ������ ���� �� ���� ��ü ���
 * 
 * StringBuffer�� Builder�� �� ������ ������ ū �����͸� ������ �� �ƴϸ�
 * String�ᵵ ����
*/