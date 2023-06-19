package SKK_Day02;

public class Ex03 {
	static final double PI = Math.PI;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rad, perim, area;
		rad = 7.5;
		perim = 2 * PI * rad;
//		area = PI * rad * rad;
		area = PI * Math.pow(rad, 2);
		
		System.out.println("Radius of the circle is : " + rad);
		System.out.println("Perimeter of the circle is : " + perim);
		System.out.println("Area of the circle is : " + area);

	}

}
