package person;

public class person {

	private String name;
	private int age;
	private int num;
	
//	public person() {
//		System.out.println("person class 持失!(without parameter)");
//	}
	
//	public person(String name, int age,int num) {
//		this.name = name;
//		this.age = age;
//		this.num = num;
//		System.out.println("person class 持失!(with parameter)");
//	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getInfo() {
		System.out.println(name +  " " + age + " " + num);

	}
}
