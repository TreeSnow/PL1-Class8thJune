package SKK_Day02;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float width, height, area, perim;

		width = 5.6f;
		height = 8.5f;

		perim = (width + height) * 2;
		area = width * height;

		System.out.println("The width of rectangle is " + width);
		System.out.println("The height of rectangle is " + height);
		System.out.println("");

		System.out.println("Area is " + width + " * " + height + " = " + area);
		System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perim);

		System.out.println("====================================================");
//		To compare expressions

		System.out.printf("Area is " + width + " * " + height + " = " + "%.2f %n", area);
//		System.out.printf("%.2f %n", area);
		System.out.print("Perimeter is 2 * (" + width + " + " + height + ") = ");
		System.out.printf("%.2f %n", perim);

	}

}
