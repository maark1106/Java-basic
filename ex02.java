package java01;

public class ex02 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("오늘의 기온은"+a+"도 입니다");
		System.out.printf("오늘의 기온은%d 입니다\n",a);
		float f = 1.23f;
		System.out.println("오늘의 기온은 "+f+"입니다");
		System.out.printf("%.2f\n",12.3);
		int x,y;
		x = 10;y = 20;
		System.out.println("x + y = " + (x + y));
		System.out.println("x = " + (++x));
		
		String name = "abcd efg";
		System.out.println(name.substring(0,2));
	}
}