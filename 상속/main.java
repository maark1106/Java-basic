package ���;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ���� �л��� �����մϱ�?");
		int count = sc.nextInt();
		
		Student[] students = new Student[count];
		
		for(int i = 0 ; i < count ; i++) {
			
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gpa;
			
			System.out.print("�л� �̸� : ");			
			name = sc.next();
			System.out.print("�л� ���� : ");
			age = sc.nextInt();
			System.out.print("�л� Ű : ");
			height = sc.nextInt();
			System.out.print("�л� ������ : ");
			weight = sc.nextInt();
			System.out.print("�л� �й� : ");
			studentID = sc.next();
			System.out.print("�л� �г� : ");
			grade = sc.nextInt();
			System.out.print("�л� ���� : ");
			gpa = sc.nextDouble();
			
			students[i] = new Student(name, age, height, weight, studentID, grade, gpa);			
		}
		for(int i = 0 ;i <count ; i ++) {
			students[i].getInfo();
		}
	}
}
