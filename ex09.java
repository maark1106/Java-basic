package java09;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		for(int i = 0 ; i  <100;i++)
			arr[i] = (int)(Math.random() * 10 + 1);
		for(int i = 0 ; i  <10;i++)
			System.out.println(arr[i]);
		
		int N = 50;
		int[][] array = new int[N][N];
		
		for(int i = 0 ; i < N;i++) {
			for(int j = 0;j < N;j++) {
				array[i][j] = (int)(Math.random() * 100  + 1);
				
			}
		}
		for(int i = 0 ; i < N;i++) {
			for(int j = 0;j < N;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
