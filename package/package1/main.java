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
 * static�� ����ϸ� heap������ �ƴ� static������ �Ҵ�
 * ��� ��ü�� �����Ͽ� �ϳ��� ��� ����
 * �������� �޸� ���� ����
 */
