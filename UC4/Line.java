public class Line {
	Point p1;
	Point p2;
	Point p3;
	Point p4;
	
	public Line(Point p1, Point p2, Point p3, Point p4) {
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
	}
	
	double getLength1() {
		double length1 = Math.sqrt((p2.x -p1.x ) * (p2.x -p1.x) + (p2.y -p1.y) * (p2.y-p1.y));
		return length1;
	}
	
	double getLength2() {
		double length2 = Math.sqrt((p4.x-p3.x) * (p4.x-p3.x) + (p4.y-p3.y) * (p4.y-p3.y));
		return length2;
    	
    }
	public boolean equals(Object d1, Object d2) {
		if(this == d2)
			return true;
		else
			return false;
	}
	public int compareTO(double length1, double length2) {
		if(length1 > length2){
			return  1;
		}
		else if(length1 < length2) {
			return -1;
		}
		else {
			return 0;
		}
	}
}