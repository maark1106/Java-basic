package java01;

public class ex02 {
	
	public static void main(String[] args) {
		
		int[] arr1;
		arr1 = new int[10];
		
		arr1[0] = 100;
		arr1[1] = 200;
		
		for(int i = 0 ; i  <4;i++) {
			//System.out.printf("arr1[%d] = %d\n",i , arr1[i]);
		}
		
		String a = "man";
		
		if(a.equalsIgnoreCase("Man")) {
			System.out.println("남자입니다\n");
		}
		else {
			System.out.println("여자입니다\n");
		}
		
	}
}



