package ex06;

import java.util.Scanner;

public class Main {
	
	public static boolean is_prime(int x) {
		boolean flag = true;
		for(int i = 2; i < x ; i++) {
			if( x % i == 0) {
				flag = false;
				break;
			}
		}
		return flag == true ? true : false;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(is_prime(n))
			System.out.printf("소수입니다");
		else
			System.out.println("소수가 아닙니다");
	}
}
