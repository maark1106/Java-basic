package ex08;


import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static char function(String str) {
		return str.charAt(str.length() - 1);
	}
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		System.out.println(str);
		char ch = function(str);
		System.out.println("������ �ܾ� : " + ch);
		
		System.out.print("�迭�� ũ�� �Է� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		int result = -1;
		for(int i = 0 ; i< num;i++) {
			arr[i] = sc.nextInt();
		} 
		
		for(int i = 0; i  < num;i++) {
			result = max(arr[i], result);
		}
		
		System.out.println("arr �迭���� ���� ū �� : " + result);
	}
}
