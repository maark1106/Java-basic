package ������;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ٳ��� : 1, ������ : 2 ? ");
		int input = sc.nextInt();
		
		Fruit fruit;
		
		if(input == 1) {
			fruit = new Banana();
		}
		else {
			fruit = new Peach();
		}
		
		fruit.show();
	}

}
