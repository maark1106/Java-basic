package java04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class ex04 {
	
		final static int N = 5;
		
		public static void main(String[] args) {
			
		
		int i = 1,sum = 0;
		
		while(i <= 1000){
			sum += i++;
		}
		
		System.out.println("sum = " + sum);
		
		for(int j = 0; j <= N; j++) {
			for(int k = 0; k <= N -j - 1;k++) {
				System.out.print(" ");
			}
			for(int k = 0 ;k < j*2 + 1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		int r = 10;
		
		for(int k = -r; k <=r;k++) {
			for(int j = -r; j<= r;j++) {
				if(k*k + j*j <= r*r) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("입력된 정수는 " + num + "입니다\n");
		
		File file = new File("input.txt");
		try {
			Scanner fl = new Scanner(file);
			while(fl.hasNextInt()) {
				System.out.println(fl.nextInt() * 100);
			}
			fl.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 도중 오류 발생");
		}
		
	}
}

/*
 * Scanner = new Scanner(System.in); 입출력 가능 라이브러리
 * sc.nextInt() -> 정수 하나 입력받기
 * 
 * C언어에서 scanf의 기능
 * 
 * 뿐만 아니라 파일에서 읽어오기도 가능
 */





