package ex03;

 class Point{
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getXY() {
		return "(" + x +"," + y + ")";
	}
}

