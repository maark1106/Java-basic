package package2;

public class person {
	
	String name;
	static int amount = 0;
	
	public person() {
		System.out.println("person 持失");
	}
	
	public person(String name) {
		this.name = name;
		System.out.println("person 持失(with name)");
	}
	
	public void set_name(String name) {
		this.name = name;
	}
	
	public void spendMoney(int m) {
		amount -= m;
	}
	
	public void getMoney(int m) {
		amount += m;
	}
	
	public void getInfo() {
		System.out.println(this.name + " : " + amount);
	}
}
