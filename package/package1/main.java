package package1;

import java.util.Scanner;
import package2.person;

public class main {
	
	public static void main(String[] args) { 
		Scanner sc =  new Scanner(System.in);
		
		person p1 = new person();
		person p2 = new person("person A");
		p1.set_name("person B");
		
		p1.getInfo();
		p1.getMoney(100);		
		p2.getInfo();
		p2.spendMoney(300);
		p1.getInfo();
	}
}
 
/*
 * static을 사용하면 heap영역이 아닌 static영역에 할당
 * 모든 객체가 공유하여 하나의 멤버 참조
 * 유동적인 메모리 관리 가능
 */
