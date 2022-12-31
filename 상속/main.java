package 상속;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까?");
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
			
			System.out.print("학생 이름 : ");			
			name = sc.next();
			System.out.print("학생 나이 : ");
			age = sc.nextInt();
			System.out.print("학생 키 : ");
			height = sc.nextInt();
			System.out.print("학생 몸무게 : ");
			weight = sc.nextInt();
			System.out.print("학생 학번 : ");
			studentID = sc.next();
			System.out.print("학생 학년 : ");
			grade = sc.nextInt();
			System.out.print("학생 학점 : ");
			gpa = sc.nextDouble();
			
			students[i] = new Student(name, age, height, weight, studentID, grade, gpa);			
		}
		for(int i = 0 ;i <count ; i ++) {
			students[i].getInfo();
		}
	}
}
