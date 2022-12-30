package Å¬·¡½º01;

public class Main {
	public static void main(String[] args) {
		
		Node first_node = new Node(10, 20);
		Node second_node = new Node(30, 40);
		
		Node result = first_node.getCenter(second_node);
		System.out.println("result = (" + result.getX() + "," + result.getY() + ")");
	}
}
