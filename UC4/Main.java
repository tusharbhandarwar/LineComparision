public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(1, 4);
		Point p2 = new Point(2, 3);
		
		Point p3 = new Point(4, 5);
		Point p4 = new Point(8, 3);
		
		Line l1 = new Line(p1, p2, p3, p4);
		
		double length1 = l1.getLength1();
		Double d1 = Double.valueOf(length1);
		
		
		double length2 = l1.getLength2();
		Double d2 = Double.valueOf(length2);
		
		boolean bool = l1.equals(d1, d2);
		if(bool == true){
			System.out.println("Lines are equal");
		}else {
			System.out.println("Lines are not equal");
		}
		
		int ret = l1.compareTO(length1, length2);
		if(ret < 0) {
			System.out.println("line1 is less than line2");
		}else if(ret > 0) {
			System.out.println("line1 is gretter than line2");
		}else {
			System.out.println("Lines are equals");
		}
	}
	

}