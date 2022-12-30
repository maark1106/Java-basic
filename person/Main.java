package person;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		person p1 = new person();
		person p2 = new person();
		
		System.out.print("p2의 나이 : ");
		int num = sc.nextInt();
		p2.setAge(num);
		p2.getInfo();
		
		sc.nextLine(); //버퍼 비우기
		
		System.out.print("p2의 이름 : ");
		name = sc.nextLine();
		p2.setName(name);
		p2.getInfo();
		
	}
}
