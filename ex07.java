package ex07;

import java.util.Scanner;

public class Main {
	
	public static int function(int number, int k) {
		for(int i = 1; i <= number;i++) {
			if(number % i == 0)
				k--;
			if(k == 0)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int k = sc.nextInt();
		int result = function(number, k);
		if(result == -1)
			System.out.println(k + "��° ����� �����ϴ�");
		else
			System.out.println(number +"�� "+ k+"��° ��� : " + result);
	}
}
