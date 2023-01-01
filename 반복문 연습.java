package ex01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		char[][] str= new char[N][N];

		sc.nextLine();
		String s;
		while(true) {
			int x = 0;
			int y = 0;
			System.out.print("입력 : ");
			s = sc.nextLine();
			if(s.length() == 2) {
				x = s.charAt(0) - '0';
				y = s.charAt(1) - '0';
			}
			if(x == 0 && y == 0)
				break;
			
			if(s.length() != 2 || x > N || y > N || x <= 0  || y <= 0){
				System.out.println("두 자리를 입력하시오");
				continue;
			}
	
			str[x - 1][y -1] = 'X';
		}
		
		System.out.print("  ");
		for(int i = 0 ; i  < N ; i++)
			System.out.print((i + 1));
		System.out.println("");
		for(int i = 0;i < N ; i ++ ) {
			System.out.print((i + 1) + " ");
			for(int j = 0 ; j < N ; j++)
				System.out.print(str[i][j]);
			System.out.println();
		}
		
	}
}
