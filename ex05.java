package ex05;

import java.util.Scanner;

public class Main {
	
	public static int function(int a, int b,int c) {
		int min;
		if(a > b) {
			if(b > c) {
				min = c;
			}
			else
				min = b;
		}
		else {
			if(a > c) {
				min = c;
			}
			else
				min = c;
		}
		
		for(int i = min;i>0;i--) {
			if(a % i == 0 && b % i == 0 && c % i == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(function(100,200,300));
	}

}
// �Լ� == �޼ҵ�