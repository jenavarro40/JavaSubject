public class TestTriangle {

	public static void main(String[] args) {
	      	System.out.println("**********************************");
	        Triangle t1 = new Triangle();
	        System.out.println("Height of T1: " + t1.getHeight());
	        System.out.println("Area of T1: " + t1.getArea());
	        t1.print();
	        System.out.println("**********************************");
	        Triangle t2 = new Triangle(7);
	        System.out.println("Height of T2: " + t2.getHeight());
	        System.out.println("Area of T2: " + t2.getArea());
	        t2.print();
	        System.out.println("**********************************");
	        Triangle t3 = new Triangle();
	        t3.setHeight(3);
	        System.out.println("Height of T3: " + t3.getHeight());
	        System.out.println("Area of T3: " + t3.getArea());
	        t3.print();
	        System.out.println("~~ Done! ~~");
		

	}

}




